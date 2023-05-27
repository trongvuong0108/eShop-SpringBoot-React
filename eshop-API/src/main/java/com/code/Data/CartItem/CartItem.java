package com.code.Data.CartItem;

import com.code.Data.ApplicationUser.ApplicationUser;
import com.code.Data.Product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cartId")
    private int id ;
    @ManyToOne
    @JoinColumn(name = "productId",nullable = false, referencedColumnName = "productId")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "userId",nullable = false, referencedColumnName = "userId")
    private ApplicationUser user;
    private Date dayAdd;
    private int amount;
}

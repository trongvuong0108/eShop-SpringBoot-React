package com.code.Data.ProductImg;

import com.code.Data.Product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class ProductImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productImgId")
    private int id ;
    private String img ;
    @ManyToOne
    @JoinColumn(name = "productId",nullable = false, referencedColumnName = "productId")
    private Product product;
}

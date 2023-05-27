package com.code.Data.OrderItem;

import com.code.Data.Order.Order;
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
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "orderItemId")
    private int id ;

    private int amount;

    @ManyToOne
    @JoinColumn(name = "orderId",nullable = false, referencedColumnName = "orderId")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "productId",nullable = false, referencedColumnName = "productId")
    private Product product;
}

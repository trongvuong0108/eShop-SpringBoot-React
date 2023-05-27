package com.code.Data.Comment;

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
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String comment ;
    private float vote;

    @ManyToOne
    @JoinColumn(name = "productId",nullable = false, referencedColumnName = "productId")
    private Product product;
}

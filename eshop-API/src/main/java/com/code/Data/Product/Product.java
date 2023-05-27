package com.code.Data.Product;

import com.code.Data.Brand.Brand;
import com.code.Data.Category.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId")
    private int id ;
    private String name ;
    private Long price ;
    private String img;
    private String description ;
    private boolean enable = true;

    @ManyToOne
    @JoinColumn(name = "brandId",nullable = false, referencedColumnName = "brandId")
    private Brand brand;
    @ManyToOne
    @JoinColumn(name = "categoryId",nullable = false, referencedColumnName = "categoryId")
    private Category category;
    public Product(String name, Long price, String img, String description, boolean enable, Category category,Brand brand) {
        this.name = name;
        this.price = price;
        this.img = img;
        this.description = description;
        this.enable = enable;
        this.category = category;
    }
}

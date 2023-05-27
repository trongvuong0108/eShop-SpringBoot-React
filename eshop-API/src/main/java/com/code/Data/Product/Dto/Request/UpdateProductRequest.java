package com.code.Data.Product.Dto.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductRequest {
        private int id ;
        private String name;
        private int cateID;
        private Long price;
        private String description;
}

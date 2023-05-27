package com.code.Data.Product;

import com.code.Data.Product.Dto.Request.CreateProductRequest;
import com.code.Data.Product.Dto.Request.UpdateProductRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IProductService {
    public List<Product> getAll();
    public void create(CreateProductRequest createProductRequest);
    public void update(UpdateProductRequest updateProductRequest);
    public void disable(int id);
    public Product findById(int id);
    public List<Product> getByCategory(int id);
    public void uploadIMG(int id , MultipartFile img);
    public int count();
}

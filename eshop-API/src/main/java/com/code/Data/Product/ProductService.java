package com.code.Data.Product;

import com.code.Data.Product.Dto.Request.CreateProductRequest;
import com.code.Data.Product.Dto.Request.UpdateProductRequest;
import com.code.Data.Brand.Brand;
import com.code.Data.Category.CategoryRepository;
import com.code.Utilities.Cloudinary.Uploader;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    Uploader uploader = new Uploader();

    public ProductService(CategoryRepository categoryRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public void update(UpdateProductRequest updateProductRequest) {
        Product product = productRepository.findById(updateProductRequest.getId()).get();
        product.setEnable(true);
        product.setCategory(categoryRepository.findById(updateProductRequest.getCateID()).get());
        product.setName(updateProductRequest.getName());
        product.setPrice(updateProductRequest.getPrice());
        product.setDescription(updateProductRequest.getDescription());
        productRepository.save(product);
    }

    @Override
    public void create(CreateProductRequest createProductRequest) {
        Product product = new Product(
                createProductRequest.getName(),
                createProductRequest.getPrice(),
                "",
                createProductRequest.getDescription(),
                true,
                categoryRepository.findById(createProductRequest.getCateID()).get(),
                new Brand()
        );
        productRepository.save(product);
    }

    @Override
    public void disable(int id) {
        Product product = productRepository.findById(id).get();
        product.setEnable(false);
        productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> getByCategory(int id) {
        List<Product> res = new ArrayList<>();
        for (Product product: productRepository.findAll()) {
            if(product.getCategory().getId() == id){
                res.add(product);
            }
        }
        return res;
    }

    @Override
    public void uploadIMG(int id, MultipartFile img) {
        Uploader uploader = new Uploader();
        Product product = productRepository.findById(id).get();
        product.setImg(uploader.uploadFile(img));
    }

    @Override
    public int count() {
        return (int) productRepository.count();
    }
}

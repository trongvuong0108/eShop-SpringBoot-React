package com.code.Data.ProductImg;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImgService implements IProductImgService {

    private final ProductImgRepository ProductImgRepository;

    public ProductImgService(ProductImgRepository ProductImgRepository) {
        this.ProductImgRepository = ProductImgRepository;
    }

    @Override
    public void save(ProductImg productImg) {
        ProductImgRepository.save(productImg);
    }

    @Override
    public List<ProductImg> getByProduct(int id) {
        return ProductImgRepository.getByProduct(id);
    }
}

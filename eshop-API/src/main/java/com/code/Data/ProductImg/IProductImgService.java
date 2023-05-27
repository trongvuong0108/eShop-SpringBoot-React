package com.code.Data.ProductImg;

import java.util.List;

public interface IProductImgService {
    public void save(ProductImg productImg);
    public List<ProductImg> getByProduct(int id);
}

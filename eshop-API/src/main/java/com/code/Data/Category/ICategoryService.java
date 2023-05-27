package com.code.Data.Category;

import java.util.List;

public interface ICategoryService {
    public List<Category> getAll();
    public void save(String name);
    public Category findById(int id);
}

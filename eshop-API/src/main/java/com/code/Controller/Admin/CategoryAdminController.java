package com.code.Controller.Admin;

import com.code.Data.Category.Category;
import com.code.Data.Category.ICategoryService;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryAdminController {
    @Autowired
    private ICategoryService CategoryService;

    @RequestMapping("/getAll")
    public List<Category> getAll(){
        return CategoryService.getAll();
    }

    @PostMapping("/Save")
    public ResponseEntity<String> save(@RequestParam("name") String name){
        CategoryService.save(name);
        return ResponseEntity.status(HttpStatus.SC_OK).body("OK");
    }
}

package com.code.Controller.Admin;

import com.code.Data.Product.Dto.Request.CreateProductRequest;
import com.code.Data.Product.Dto.Request.UpdateProductRequest;
import com.code.Data.Product.Product;
import com.code.Data.ProductImg.ProductImg;
import com.code.Data.Category.ICategoryService;
import com.code.Data.ProductImg.IProductImgService;
import com.code.Data.Product.IProductService;
import com.code.Utilities.Cloudinary.Uploader;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("admin/product")
public class ProductAdminController {
    @Autowired
    private IProductService ProductService;

    @Autowired
    private ICategoryService CategoryService;

    @Autowired
    private IProductImgService ProductImgService;

    @RequestMapping("/getAll")
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.status(HttpStatus.SC_OK).body(ProductService.getAll());
    }

    @RequestMapping("/getById")
    public ResponseEntity<?> getById(@RequestParam("id") int id) {
        Product product = ProductService.findById(id);
        if (product == null)
            return ResponseEntity.status(HttpStatus.SC_BAD_REQUEST).body("Can't find product has id = " + id);
        else {
            return ResponseEntity.status(HttpStatus.SC_OK).body(product);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<?> save(@RequestBody CreateProductRequest createProductRequest) {
        ProductService.create(createProductRequest);
        return ResponseEntity.status(HttpStatus.SC_BAD_REQUEST).body("Successful");
    }

    @PostMapping("/update")
    public ResponseEntity<?> update(@RequestBody UpdateProductRequest updateProductRequest) {
        Product product = ProductService.findById(updateProductRequest.getId());
        if (product == null)
            return ResponseEntity.status(HttpStatus.SC_BAD_REQUEST).body("Can't find product has id = " + updateProductRequest.getId());
        else {
            ProductService.update(updateProductRequest);
            return ResponseEntity.status(HttpStatus.SC_BAD_REQUEST).body(product);
        }
    }

    @GetMapping("/disableProduct")
    public ResponseEntity<?> deleteProduct(
            @RequestParam("id") int id
    ) {
        Product product = ProductService.findById(id);
        if (product == null)
            return ResponseEntity.status(HttpStatus.SC_BAD_REQUEST).body("Can't find product has id = " + id);
        else {
            product.setEnable(false);
            ProductService.disable(id);
            return ResponseEntity.status(HttpStatus.SC_OK).body("disable product is successful");
        }
    }

    @PostMapping("/uploadIMG")
    public ResponseEntity<?> uploadIMG(
            @RequestParam("id") int id,
            @RequestParam("img") MultipartFile img
    ) {
        Product product = ProductService.findById(id);
        if (product == null)
            return ResponseEntity.status(HttpStatus.SC_BAD_REQUEST).body("Can't find product has id = " + id);
        else {
            ProductService.uploadIMG(id,img);
            return ResponseEntity.status(HttpStatus.SC_OK).body("upload product IMG is successful");
        }
    }

    @PostMapping("/addIMG")
    public ResponseEntity<?> addMoreProductImg(
            @RequestParam("id") int id,
            @RequestParam("img") MultipartFile img
    ) {
        Product product = ProductService.findById(id);
        if (product == null)
            return ResponseEntity.status(HttpStatus.SC_BAD_REQUEST).body("Can't find product has id = " + id);
        else {
            Uploader uploader = new Uploader();
            ProductImg productImg = new ProductImg();
            productImg.setProduct(product);
            productImg.setImg(uploader.uploadFile(img));
            ProductImgService.save(productImg);
            return ResponseEntity.status(HttpStatus.SC_OK).body("Add more product img is successful");
        }

    }
}

package com.capgeminiAcademy.webServices.resources;

import com.capgeminiAcademy.webServices.entities.Product;
import com.capgeminiAcademy.webServices.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {

    @Autowired
    private ProductService productRepository;
    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = productRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product Product = productRepository.findById(id);
        return ResponseEntity.ok().body(Product);
    }
}

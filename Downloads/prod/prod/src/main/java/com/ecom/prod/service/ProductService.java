package com.ecom.prod.service;

import com.ecom.prod.model.Product;
import com.ecom.prod.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> getProductByCategoryId(Long categoryId){
        return productRepository.findByCategoryId(categoryId);
    }
}

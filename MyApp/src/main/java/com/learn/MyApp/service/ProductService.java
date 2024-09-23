package com.learn.MyApp.service;


import com.learn.MyApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101,"Samsung",50000),
            new Product(102,"MSI",60000));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId){
        return products.stream()
                .filter(p  ->p.getProdId() == prodId)
                .findFirst().get();
    }

}

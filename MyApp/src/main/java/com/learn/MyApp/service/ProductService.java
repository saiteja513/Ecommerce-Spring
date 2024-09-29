package com.learn.MyApp.service;


import com.learn.MyApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Samsung",50000),
            new Product(102,"MSI",60000)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId){
        return products.stream()
                .filter(p  ->p.getProdId() == prodId)
                .findFirst().get();
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index = 0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId() == prod.getProdId()){
                products.set(index, prod);
            }
        }
    }
}

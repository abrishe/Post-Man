/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farre.API_DS.service;

import com.farre.API_DS.model.Product;
import com.farre.API_DS.repositorio.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author abrarawfarvio
 */
@Service
public class ProductService {
    @Autowired 
    private ProductRepository productRepository;
    
    
    public List<Product>listProducts(){
        
        return productRepository.findAll();
    }
    
    public void saveProduct(Product product){
        productRepository.save(product);
    }
    
    public Product getProductById(Integer id){
        return productRepository.findById(id).get();
    }
    
    public void editProduct(Product product, Integer id){
       productRepository.existsById(id);
   }
    
    public void removeProduct (Integer id){
        productRepository.deleteById(id);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skipthedishes.services;

import com.skipthedishes.DTO.ProductDTO;
import com.skipthedishes.domain.Product;
import com.skipthedishes.repository.ProductRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rodrigomelo
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Collection<ProductDTO> listProducts() {

        Collection<ProductDTO> productsDTO = new ArrayList<>();

        Collection<Product> products = productRepository.findAll();

        products.stream()
                .map((product) -> new ProductDTO(product.getId(), product.getName(), product.getDescription(), product.getPrice(), product.getStore().getId()))
                .forEachOrdered((productDTO) -> {productsDTO.add(productDTO);
        });

        return productsDTO;
    }

}

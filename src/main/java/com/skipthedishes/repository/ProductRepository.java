/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skipthedishes.repository;

import com.skipthedishes.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rodrigomelo
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}

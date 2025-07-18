package com.example.demo.myfirstapi.repository;

import com.example.demo.myfirstapi.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository productRepository;
    @BeforeEach
    void setup(){
        productRepository = new ProductRepository();

    }

    @Test
    void findAll() {
        List<Product> products = productRepository.findAll();

        assertEquals( "[Product{id=1, name='Laptop', price=1200.0}, Product{id=2, name='Mouse', price=25.5}, Product{id=3, name='Keyboard', price=75.0}]", products.toString());
        assertNotNull(products);
    }

    @Test
    void findById() {
        Optional<Product> products = productRepository.findById(1L);

        assertTrue(products.isPresent(), "Product with ID 1L (Laptop) exist.");
        assertEquals("Laptop", products.get().getName());

    }

    @Test
    void foundIdIsEmpty(){
        Optional<Product> products = productRepository.findById(20L);

        assertTrue(products.isEmpty(), "Product not found");
    }

    @Test
    void save() {
        Product products = new Product("Monitor",300.00);
        int initialSize = productRepository.findAll().size();

        Product savedProducts = productRepository.save(products);

        assertNotNull(savedProducts.getId());
        assertEquals(initialSize + 1, productRepository.findAll().size());
        assertTrue(productRepository.findById(savedProducts.getId()).isPresent());
    }

    @Test
    void SavedProductsShouldUpdate(){
        Product updatedProduct = new Product(1L, "Laptop", 2000.00);
        int initialSize = productRepository.findAll().size();

        productRepository.save(updatedProduct);
        Optional<Product> product = productRepository.findById(1L);

        assertEquals(initialSize, productRepository.findAll().size());

        assertTrue(product.isPresent());
        assertEquals("Laptop", product.get().getName());


    }
}
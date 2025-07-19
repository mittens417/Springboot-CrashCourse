package com.example.demo.myfirstapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ProductTest {
    Product product;
    @BeforeEach
    void setup() {
        product = new Product(123456789L, "apple",1.99D);
    }
    @Test
    void getId() {

        assertEquals(123456789L,product.getId());
    }

    @Test
    void getName() {

        assertEquals("apple",product.getName());
    }

    @Test
    void getPrice() {
        assertEquals(1.99D,product.getPrice());
    }

    @Test
    void setId() {
        product.setId(20L);
        assertEquals(20L, product.getId());
    }

    @Test
    void setName() {
        product.setName("banana");
        assertEquals("banana",product.getName());
    }

    @Test
    void setPrice() {
        product.setPrice(2.99D);
        assertEquals(2.99D,product.getPrice());
    }

    @Test
    void testToString() {
        assertEquals("Product{id=123456789, name='apple', price=1.99}", product.toString());
    }

    @Test
    void testEquals() {
        assertTrue(product.equals(product));
    }

    @Test
    void testHashCode() {
        Product product2 = new Product(123456789L, "apple",1.99D);
        assertEquals(product2.hashCode(),product.hashCode());
    }
}
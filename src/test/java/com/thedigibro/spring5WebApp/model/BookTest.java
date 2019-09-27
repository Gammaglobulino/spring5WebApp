package com.thedigibro.spring5WebApp.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book;
    Publisher hc;

    @BeforeEach
    void setUp() {
        book=new Book("Story of Andrea","102304040433",hc);
        hc= new Publisher("Harper Collins","My street");
    }

    @Test
    void getTitle() {
        assertEquals("Story of Andrea",book.getTitle());
    }

    @Test
    void setTitle() {
    }
}
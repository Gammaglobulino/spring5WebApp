package com.thedigibro.spring5WebApp.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    Author author ;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        author = new Author("Andrea","Mazzanti");
    }

    @Test
    void getFirstName() {
        assertEquals("Andrea",author.getFirstName());
    }

    @Test
    void setFirstName() {
    }

    @Test
    void getBooks() {
    }

    @Test
    void setBooks() {
    }
}
package com.example.anita.androidlibraryv4.testBooks;


import junit.framework.Assert;

import org.junit.Test;

import domain.bookSystem.Books;
import factories.booksFactory.impl.UseBookFactory;

/**
 * Created by Anita on 2016/04/16.
 */
public class TestBooks {

    @Test
    public void testBookAuthor() throws Exception {
        UseBookFactory bookFactory = new UseBookFactory();
        Assert.assertEquals(bookFactory.getBook("Adult").getAuthor(),"Elizabeth Gilbert");
    }

    @Test
    public void testSetBookAuthor() throws Exception {
        Books book = new Books.Builder()
                .author("Stephen King")
                .build();
        Assert.assertEquals(book.getAuthor(),"Stephen King");

    }


}

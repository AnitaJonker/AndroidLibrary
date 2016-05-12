package com.repositorytests.booksystem;

import android.test.AndroidTestCase;

import junit.framework.Assert;

import java.util.Set;

import main.domain.booksystem.Books;
import main.repository.booksystem.impl.BookRepositoryImpl;

/**
 * Created by Anita on 2016/04/24.
 */
public class SettingsBookTest extends AndroidTestCase {
    private static final String TAG=" SETTINGS TEST ";
    private long id;

    public void testCreateReadUpdateDelete() throws Exception {
        BookRepositoryImpl repo = new BookRepositoryImpl(this.getContext());

        // CREATE
        Books createEntity = new Books.Builder()
                .bookTitle("Julia vanishes")
                .author("Catherine Egan")
                .pages(235)
                .publisher("Random House")
                .iSBN("75412412")
                .build();


        Books insertedEntity = repo.save(createEntity);
        id = insertedEntity.getId();
        Assert.assertNotNull(TAG + " CREATE", insertedEntity);

        //READ ALL
        Set<Books> settings = repo.findAll();
        Assert.assertTrue(TAG + " READ ALL", settings.size() > 0);


        //READ ENTITY
        Books entity = repo.findById(id);
        Assert.assertNotNull(TAG + " READ ENTITY", entity);


        //UPDATE ENTITY
        Books updateEntity = new Books.Builder()
                .copy(entity)
                .pages(235)
                .build();
        repo.update(updateEntity);
        Books newEntity = repo.findById(id);
        Assert.assertEquals(TAG + " UPDATE ENTITY", 235 , newEntity.getPages());

        // DELETE ENTITY
        repo.delete(updateEntity);
        Books deletedEntity = repo.findById(id);
        Assert.assertNull(TAG + " DELETE", deletedEntity);

        //DELETE ALL
          repo.deleteAll();
        Set<Books> settingsDelete = repo.findAll();
        Assert.assertTrue(TAG + " READ ALL", settingsDelete.size() == 0);
        // Assert.assertTrue(TAG + " test ALL", settings.size() == 0);




    }
}






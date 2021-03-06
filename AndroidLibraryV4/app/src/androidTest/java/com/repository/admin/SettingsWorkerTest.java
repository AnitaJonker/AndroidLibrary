package com.repository.admin;

import android.provider.Settings;
import android.test.AndroidTestCase;

import junit.framework.Assert;

import java.util.Set;

import domain.admin.Worker;
import repository.admin.impl.WorkerRepositoryImpl;


/**
 * Created by hashcode on 2016/04/09.
 */
public class SettingsWorkerTest extends AndroidTestCase {
    private static final String TAG=" SETTINGS TEST ";
    private long id;

    public void testCreateReadUpdateDelete() throws Exception {
        WorkerRepositoryImpl repo = new WorkerRepositoryImpl(this.getContext());

        // CREATE
        Worker createEntity = new Worker.Builder()
                .name("Julia")
                .surname("James")
                .address("Hillside")
                .build();


        Worker insertedEntity = repo.save(createEntity);
        id = insertedEntity.getId();
        System.out.println(id + "PRINT THIS OUT");
        Assert.assertNotNull(TAG + " CREATE", insertedEntity);

        //READ ALL
        Set<Worker> settings = repo.findAll();
        Assert.assertTrue(TAG + " READ ALL", settings.size() > 0);
        Assert.assertEquals(insertedEntity.getName(),"Julia");


        //READ ENTITY
        Worker entity = repo.findById(id);
        Assert.assertNotNull(TAG + " READ ENTITY", entity);


        //UPDATE ENTITY
        Worker updateEntity = new Worker.Builder()
                .copy(entity)
                .address("Hill on the side")
                .build();
        repo.update(updateEntity);
        Worker newEntity = repo.findById(id);
        Assert.assertEquals(TAG + " UPDATE ENTITY", "Hill on the side", newEntity.getAddress());

        // DELETE ENTITY
        repo.delete(updateEntity);
        Worker deletedEntity = repo.findById(id);
        Assert.assertNull(TAG + " DELETE", deletedEntity);


        //DELETE ALL
        repo.deleteAll();
        Set<Worker> settingsDelete = repo.findAll();
        Assert.assertTrue(TAG + " READ ALL", settingsDelete.size() == 0);
        // Assert.assertTrue(TAG + " test ALL", settings.size() == 0);


    }
}






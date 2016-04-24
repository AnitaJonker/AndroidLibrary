package com.example.anita.androidlibraryv4.testAdmin;

import junit.framework.Assert;

import org.junit.Test;

import domain.admin.Worker;
import factories.workerFactory.impl.UseWorkerFactory;

/**
 * Created by Anita on 2016/04/16.
 */
public class TestWorker {
    @Test
    public void testWorkerName() throws Exception {
        UseWorkerFactory workerFactory = new UseWorkerFactory();
        Assert.assertEquals(workerFactory.getWorker("Cleaner").getName(),"Lana");
    }

    @Test
    public void testWorkerSetName() throws Exception {
        UseWorkerFactory workerFactory = new UseWorkerFactory();
        Assert.assertEquals(workerFactory.getWorker("Cleaner").getName(),"Lana");

        Worker worker = new Worker.Builder()
                .name("Lezandi")
                .build();

        Assert.assertEquals(worker.getName(),"Lezandi");
    }
}

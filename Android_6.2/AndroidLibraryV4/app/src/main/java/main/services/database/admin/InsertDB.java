package main.services.database.admin;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;

import main.domain.admin.Worker;
import main.repository.admin.WorkerRepository;
import main.repository.admin.impl.WorkerRepositoryImpl;

public class InsertDB extends IntentService {

    WorkerRepositoryImpl repo = new WorkerRepositoryImpl(this.getApplicationContext());

    private static final String TAG ="services.database";
    public InsertDB() {
        super("InsertDB");
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        repo.update(updateDB());
    }


    public Worker updateDB()
    {

        Worker worker = new Worker.Builder()
                .name("Sam")
                .surname("Smith")
                .address("London")
                .id(555)
                .build();
        return worker;
    }

}

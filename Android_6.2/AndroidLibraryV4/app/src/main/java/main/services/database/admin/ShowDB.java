package main.services.database.admin;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import main.repository.admin.impl.WorkerRepositoryImpl;

public class ShowDB extends Service {

    WorkerRepositoryImpl repo = new WorkerRepositoryImpl(this.getApplicationContext());

    private final IBinder adminBind = new myLocalBinder();

    public ShowDB() {
    }

    @Override
    public IBinder onBind(Intent intent) {
       return adminBind;
    }

    public class myLocalBinder extends Binder
    {
        public  ShowDB getService(){
            return ShowDB.this;
        }
    }

    public int getSize()
    {
        return repo.findAll().size();
    }

}

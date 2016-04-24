<<<<<<< HEAD
package domain.admin.impl;

import domain.admin.RegisterWorker;
import domain.admin.Worker;

/**
 * Created by Anita on 2016/04/16.
 */
public class RegisterCleaner extends WorkerDetails implements RegisterWorker {

    public Worker registerWorker()
    {
        Worker cleaner = new Worker.Builder()
                .name("Lana")
                .surname("De Waal")
                .address("Barbarossa str 4")
                .build();
        return cleaner;
    }

    public Worker handleRequest(String request) {
        if(request.equalsIgnoreCase("Cleaner")){
            return registerWorker();
        }else{
            if (request!=null) {
                return nextType.handleRequest(request);
            }
            return null;
        }
    }


}


=======
package domain.admin.impl;

import domain.admin.RegisterWorker;
import domain.admin.Worker;

/**
 * Created by Anita on 2016/04/16.
 */
public class RegisterCleaner extends WorkerDetails implements RegisterWorker {

    public Worker registerWorker()
    {
        Worker cleaner = new Worker.Builder()
                .name("Lana")
                .surname("De Waal")
                .address("Barbarossa str 4")
                .build();
        return cleaner;
    }

    public Worker handleRequest(String request) {
        if(request.equalsIgnoreCase("Cleaner")){
            return registerWorker();
        }else{
            if (request!=null) {
                return nextType.handleRequest(request);
            }
            return null;
        }
    }


}


>>>>>>> 3f4401acfd7d3290b2ac0e2f99049c6ccae0b211

<<<<<<< HEAD
package domain.admin.impl;

import domain.admin.RegisterWorker;
import domain.admin.Worker;

/**
 * Created by Anita on 2016/04/16.
 */
public class RegisterSecurity extends WorkerDetails implements RegisterWorker {

    public Worker registerWorker()
    {
        Worker security = new Worker.Builder()
                .name("Anita")
                .surname("Jonker")
                .address("Almeria str4")
                .build();
        return security;
    }

    public Worker handleRequest(String request) {
        if(request.equalsIgnoreCase("Security")){
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
public class RegisterSecurity extends WorkerDetails implements RegisterWorker {

    public Worker registerWorker()
    {
        Worker security = new Worker.Builder()
                .name("Anita")
                .surname("Jonker")
                .address("Almeria str4")
                .build();
        return security;
    }

    public Worker handleRequest(String request) {
        if(request.equalsIgnoreCase("Security")){
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

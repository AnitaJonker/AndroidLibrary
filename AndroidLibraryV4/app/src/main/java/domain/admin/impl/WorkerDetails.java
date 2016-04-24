<<<<<<< HEAD
package domain.admin.impl;

import domain.admin.Worker;

/**
 * Created by Anita on 2016/04/16.
 */
public abstract class WorkerDetails {

    WorkerDetails nextType;

    public void setNextWorkerType(WorkerDetails nextType) {
        this.nextType = nextType;
    }
    public abstract Worker handleRequest(String request);
}
=======
package domain.admin.impl;

import domain.admin.Worker;

/**
 * Created by Anita on 2016/04/16.
 */
public abstract class WorkerDetails {

    WorkerDetails nextType;

    public void setNextWorkerType(WorkerDetails nextType) {
        this.nextType = nextType;
    }
    public abstract Worker handleRequest(String request);
}
>>>>>>> 3f4401acfd7d3290b2ac0e2f99049c6ccae0b211

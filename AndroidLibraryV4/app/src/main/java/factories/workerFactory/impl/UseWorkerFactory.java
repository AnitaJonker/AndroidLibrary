package factories.workerFactory.impl;

import domain.admin.Worker;
import domain.admin.impl.RegisterCleaner;
import domain.admin.impl.RegisterLibrarian;
import domain.admin.impl.RegisterSecurity;
import domain.admin.impl.WorkerDetails;
import factories.workerFactory.WorkerFactory;

/**
 * Created by Anita on 2016/04/16.
 */
public class UseWorkerFactory implements WorkerFactory {
    Worker worker;

    public Worker getWorker(String workerType) {
        WorkerDetails chain = setUpChain();
        return chain.handleRequest(workerType);
    }

    public static WorkerDetails setUpChain(){
        WorkerDetails cleaner = new RegisterCleaner();
        WorkerDetails librarian = new RegisterLibrarian();
        WorkerDetails security = new RegisterSecurity();
        cleaner.setNextWorkerType(librarian);
        librarian.setNextWorkerType(security);
        return cleaner;
    }



}

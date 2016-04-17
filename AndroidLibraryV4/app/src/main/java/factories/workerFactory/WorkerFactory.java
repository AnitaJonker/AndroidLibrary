package factories.workerFactory;

import domain.admin.Worker;

/**
 * Created by Anita on 2016/04/16.
 */
public interface WorkerFactory {
    Worker getWorker(String name);
}

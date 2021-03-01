package Lab1.ProposedExercices.LabTimeExercices;

import Lab1.ProposedExercices.LabTimeExercices.queue.sync.QueueSyncRunner;
import Lab1.ProposedExercices.LabTimeExercices.simple.threading.TwoProducers;
import Lab1.ProposedExercices.LabTimeExercices.waitnotify.sync.LockSyncRunner;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        QueueSyncRunner.execute();
       // LockSyncRunner.run();
       // TwoProducers.execute();
    }
}

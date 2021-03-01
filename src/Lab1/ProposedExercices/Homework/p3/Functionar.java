package Lab1.ProposedExercices.Homework.p3;

import java.util.ArrayList;
import java.util.List;

public class Functionar extends Thread {
    private final List<String> documents = new ArrayList<>();
    private final String nume;
    private final Data data;
    private final int delay;

    public Functionar(Data data, int delay, String nume) {
        this.data = data;
        this.delay = delay;
        this.nume = nume;
        for (int i = 0; i < 3; i++) {
            documents.add(nume + " " + (i + 1));
        }
    }

    public void run() {
        try {
            for (String doc : documents) {
                data.addToPrinter(doc);
                sleep(delay);
            }
            sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

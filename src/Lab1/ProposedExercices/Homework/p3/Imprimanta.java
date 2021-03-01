package Lab1.ProposedExercices.Homework.p3;

public class Imprimanta extends Thread {
    private Data data;
    private long delay;

    public Imprimanta(Data data, long delay) {
        this.data = data;
        this.delay = delay;
    }

    public void run() {
        try {
            String document = "";
            while (!document.equals("Functionar 6 3")) {
                document = data.printDocument();
                sleep(delay);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

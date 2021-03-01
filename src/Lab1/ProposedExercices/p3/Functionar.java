package Lab1.ProposedExercices.p3;

public class Functionar extends Thread {
    private Document document;
    private int delay;

    public Functionar(Document nume, int delay) {
        this.document = nume;
        this.delay = delay;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public void run() {
        try {
            System.out.println("Created document " + document);
            sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

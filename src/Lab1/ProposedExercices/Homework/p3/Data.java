package Lab1.ProposedExercices.Homework.p3;

public class Data {
    private String document;
    boolean printing = false;

    public synchronized void addToPrinter(String document) {
        while (printing) {
            try {
                System.out.println("Functionarul asteapta sa se elibereze imprimanta");
                wait();
                System.out.println("Imprimanta a terminat de listat si functionarul va aduce un document");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Documentul" + this.document + " este inlocuit cu " + document);
        this.document = document;
        printing = true;
        System.out.println("Notificam imprimanta ca functionarul a adus un document");
    }

    public synchronized String printDocument() {
        try {
            while (!printing) {
                System.out.println("Imprimanta asteapta un document");
                wait();
                System.out.println("Imprimanta a primit un document");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Imprimanta listeaza " + document);
        System.out.println("Notificam functionarii ca pot aduce documente");
        printing = false;
        notifyAll();
        return this.document;
    }
}

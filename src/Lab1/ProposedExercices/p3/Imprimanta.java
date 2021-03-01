package Lab1.ProposedExercices.p3;

public class Imprimanta extends Thread {
    private Document document;
    private Functionar functionar;

    public Imprimanta(Document document, Functionar functionar) {
        this.document = document;
    }

    public void run() {
        System.out.println("Acum se printeata documentul" + document.getName() + " de catre " + functionar.getName());
    }
}

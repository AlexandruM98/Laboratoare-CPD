package Lab1.ProposedExercices.Homework.p4;

public class Main {
    public static void main(String[] args) {
        String data = "Imi place laboratorul de CPD";
        StringProcessor sp1 = new StringProcessor("Inainte", data, 1, 0);
        StringProcessor sp2 = new StringProcessor("Inapoi", data, -1, data.length() - 1);
        sp1.start();
        sp2.start();
    }
}

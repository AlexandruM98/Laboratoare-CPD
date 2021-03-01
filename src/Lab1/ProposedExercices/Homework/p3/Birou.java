package Lab1.ProposedExercices.Homework.p3;

public class Birou {

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            Functionar f = new Functionar(new Document("documentul" + i), 500 + i * 100);
        }
    }
}

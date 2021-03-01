package Lab1.ProposedExercices.Homework.p3;

import java.util.ArrayList;

public class Birou {

    public static void main(String[] args) {
        Data data = new Data();
        Imprimanta imprimanta = new Imprimanta(data, 500);
        var functionari = new ArrayList<Functionar>();
        for (int i = 0; i < 8; i++) {
            Functionar f = new Functionar(data, 1000 + ((i + 1) * 200), "Functionar " + i);
            functionari.add(f);
        }
        functionari.forEach(Thread::start);
        imprimanta.start();
    }
}

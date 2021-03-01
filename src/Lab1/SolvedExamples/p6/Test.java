package Lab1.SolvedExamples.p6;/*
 * Test.java
 */

/**
 * 
 * 
 * Studiati rolulul blocurilor sincronizate si modul de functionare a acestora.
 */
public class Test {

    public static void main(String[] args) {
        
        Punct p = new Punct();
        FirSet fs1 = new FirSet(p);
        FirGet fg1 = new FirGet(p);
        
        fs1.start();
        fg1.start();
        
    }
}

package Lab1.SolvedExamples.p4;/*
 * NumaratorR.java
 */

/**
 * 
 * 
 * Aceasta clasa ilustreaza modul in care se pot implementa firele de executie utilizand
 * interfata Runnable.
 * 
 * Teme
 * 
 * 1. Verificati functionarea programului 
 * 
 * 2. Verificati al doilea mod de lansare in executie a firelor (sectiunea de cod comentata
 * din cadrul metodei main)
 * 
 * 3. Modificati programul NumaratorT astfel incat acesta sa foloseasca interfata Runnable
 * pentru lucrul cu fire.
 */
public class NumaratorR implements Runnable {

    Thread t;
    
    public void start(){
        if(t!=null){
            t = new Thread(this);
            t.start();
        }
    }
      
    public void run() {
        System.out.println("Firul ruleaza.");
    }

    public static void main(String[] args) {
        NumaratorR nr = new NumaratorR();
        nr.start();
        
        //Un alt mod de lansare a executie a firului fara a mai fi nevoie de implementarea
        // metodei start in cadrul clasei NumaratorR
        //Thread t = new Thread(nr);
        //t.start();
        
    }

}

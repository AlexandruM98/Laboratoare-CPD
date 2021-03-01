package Lab1.SolvedExamples.p7;/*
 * NumaratorT.java
 */


/**
 * 
 * 
 * Clasa ilustreaza modul de lucru cu fire de executie in java.
 * 
 * Tema:
 * 
 * 1. Verificati functionarea programului
 * 
 * 2. Inlocuiti apelarea meotdelor start() cu apelarea directa a metodelor run() in cadrul
 * 	programului principal (ex. in loc de n1.start() -> n1.run() ). Observati modificarile 
 *  in executie.
 * 
 * 3. Pentru a seta prioritatea unui fir se utiliezeaza metoda setPriority(priority), unde
 * priority reprezinta prioritatea unui thread. Analizati documentatia clasei Thread si determinati 
 * variabilele sau metodele definite in cadrul clasei care va permit sa aflati valoarea maxima si minima
 * a prioritatilor pentru un fir de executie. Modificati programul pentru a afisa valorile maxime 
 * si minime ale prioritatilor adimisibile.
 * 
 * 4. Modificati programul pentru a permite setarea pentru fiecare fir de executie startat a unei prioritati.
 * Se va modifica constructorul clasei astfel incat acesta sa primeasca ca si argument prioritatea dorita. In 
 * cadrul clasei se va seta prioritatea firului de executie. 
 * 
 * 5. scoateti comentariul din fata liniei setDaemon(true) din cadrul clasei NumaratorT.
 * Recompilati si rulati programul. Explicati modul de comportament.
 * 
 * 5. Modificati acest program astfel incat firele de executie saafiseze in cadrul unei 
 * ferestre intr-un TextField valoarea conunterului.
 */
public class NumaratorT extends Thread{

    int nr;
    boolean active = true;
    
    /**
     * Constructorul clasei. 
     * @param name reprezinta numele firulul
     */
    public NumaratorT(String name){
        //metoda seteaza numele unui fir de executie
        this.setName(name);
        //this.setDaemon(true);
    }
    
    /**
     * In momentul startarii unui fir de exectuie este apelata si executata in cadrul
     * firului metoda run().
     */
    public void run(){
        
        while(active){
            nr++;
            System.out.println("Thread "+this.getName()+" counter = "+nr);
            try {
                //dupa fiecare incrementare a firului se realizeaza opauza de 500 milisecunde
                Thread.sleep(500);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }//.while
    }
    
    
    public static void main(String[] args) {
        
        //declara 3 variabile de tip NumaratorT
        NumaratorT n1,n2,n3;
        
        //construieste obiectele n1, n2 si n3
        n1 = new NumaratorT("Fir 1");
        n2 = new NumaratorT("Fir 2");
        n3 = new NumaratorT("Fir 3");
        
        //starteaza cele 3 fire de executie. Startarea unui fir de executie se face
        // apelandmetoda start
        n1.start();
        n2.start();
        n3.start();
         
    }
}

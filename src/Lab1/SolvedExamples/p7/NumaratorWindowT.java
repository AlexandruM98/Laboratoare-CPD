package Lab1.SolvedExamples.p7;/*
 * NumaratorWindowT.java
 */


import javax.swing.JTextField;

/**
 * 
 
 */
/*
 * NumaratorT.java
 */
public class NumaratorWindowT extends Thread{

    int nr;
    boolean active = true;
    JTextField tf;
    /**
     * Constructorul clasei. 
     * @param name reprezinta numele firulul
     */
    public NumaratorWindowT(String name){
        //metoda seteaza numele unui fir de executie
        this.setName(name);
    }
    
    /**
     * In momentul startarii unui fir de exectuie este apelata si executata in cadrul
     * firului metoda run().
     */
    public void run(){
        
        while(active){
            nr++;
            System.out.println("Thread "+this.getName()+" counter = "+nr);
            tf.setText(""+nr);
            try {
                //dupa fiecare incrementare a firului se realizeaza opauza de 500 milisecunde
                Thread.sleep(500);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }//.while
    }
    
    public void setTextField(JTextField tf){
        this.tf = tf;
    }
    
    public static void main(String[] args) {
        
        ThreadJFrame f = new ThreadJFrame();
        
        //declara 3 variabile de tip NumaratorT
        NumaratorWindowT n1,n2,n3;
        
        //construieste obiectele n1, n2 si n3
        n1 = new NumaratorWindowT("Fir 1");
        n2 = new NumaratorWindowT("Fir 1");
        n3 = new NumaratorWindowT("Fir 1");
        
        f.addThreadCounterTextbox(n1);
        f.addThreadCounterTextbox(n2);
        f.addThreadCounterTextbox(n3);
        
        f.setVisible(true);
        
        
        //starteaza cele 3 fire de executie. Startarea unui fir de executie se face
        // apelandmetoda start
        n1.start();
        n2.start();
        n3.start();
         
    }
}

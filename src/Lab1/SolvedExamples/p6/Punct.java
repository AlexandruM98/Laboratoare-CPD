package Lab1.SolvedExamples.p6;/*
 * Punct.java
 */


/**

 * 
 * Daca un obiect de tip Punct este folosit concurent de doua sau mai multe fire de executie
 * pentru setarea si citirea valorilor x si y, pot aparea situatii de inconsistenta a datelor.
 * 
 * Astfel o situatie posibila este aceea in care un fir de executie incearca sa seteze noua pozitie a 
 * punctului si un alt fir de executie incearca sa citeasca pozitia curenta a punctului.
 * 
 * Pentru rezolvarea problemei solutia posibila este de folosire a blocurilor sau a metodelor sincronizate
 */
public class Punct {
    int x,y;
    
    
   
    public void setXY(int a,int b){
        x = a;
       
        y = b;
    }
    
    
    public int getX(){return x;}
    
    public int getY(){return y;}

    
}

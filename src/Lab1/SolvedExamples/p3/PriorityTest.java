package Lab1.SolvedExamples.p3;

import java.awt.Graphics;

public class PriorityTest extends Thread{
    Graphics g;
    int i=0;
    int pos;
    
    public PriorityTest(int pos, int p, Graphics g){
        this.setPriority(p);
        this.g = g;
        this.pos = pos;
    }
    
    public void run(){
        
        while(i<200){
            i++;
            display();
            try {
                sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    public void display(){
        g.drawRect(i,pos,2,2);
    }
    
   
}

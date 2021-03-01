package Lab1.SolvedExamples.p3;/*
 * AppTest.java
 */
import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JApplet;

/**
 * 
 * This class is part of the labs project.
 * 
 * Programul ilustreaza modul in care poate fi setata prioritatea unui thread.
 * 
 * 1. Construiti un fisier HTML pentru lansarea in executie a appletului.
 * 
 * 2. Executati applet-ul
 * 
 */
public class AppTest extends JApplet {
    
    Vector<PriorityTest> v = new Vector<>();
    
    public void init(){
        PriorityTest pt  = new PriorityTest(1,1, this.getGraphics());
        pt.start();
        v.add(pt);
        
        pt = new PriorityTest(10,3, this.getGraphics());
        pt.start();
        v.add(pt);     
        
        pt = new PriorityTest(20,5, this.getGraphics());
        pt.start();
        v.add(pt);  
        
        pt = new PriorityTest(30,8, this.getGraphics());
        pt.start();
        v.add(pt);  
        
        pt = new PriorityTest(40,10, this.getGraphics());
        pt.start();
        v.add(pt);  
        
        pt = new PriorityTest(60,2, this.getGraphics());
        pt.start();
        v.add(pt);  
        
        pt = new PriorityTest(70,2, this.getGraphics());
        pt.start();
        v.add(pt);  
        
        this.setSize(new Dimension(400,400));
        
    }
    
   
}

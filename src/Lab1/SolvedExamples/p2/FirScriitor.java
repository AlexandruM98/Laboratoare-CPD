package Lab1.SolvedExamples.p2;/*
 * FirScriitor.java
 */

import java.io.PipedOutputStream;

/**
 * 
 * 
 */
class FirScriitor extends Thread
{
	private final PipedOutputStream po;
	FirScriitor(){po = new PipedOutputStream();}
	
	public void run()
	{
		try
		{
		while (true)
		{
		    int d = (int)(10*Math.random());
		    System.out.println("Fir scriitor trimite : "+d);
			po.write(d);
			sleep(400);
		}
		}catch(Exception e){}
	}
	
	PipedOutputStream getPipe(){return po;}
}

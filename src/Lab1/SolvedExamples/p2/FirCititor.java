package Lab1.SolvedExamples.p2;/*
 * FirCititor.java
 */
/**
 */
import java.io.*;

class FirCititor extends Thread
{
	private PipedInputStream pi;
	FirCititor()
	{
		pi = new PipedInputStream();
	}
	
	public void run()
	{
		try
		{
		while (true)
		{
			if (pi.available()>0)
			{System.out.println("Fir cititor a primit : "+pi.read());}
		}
		}catch(Exception e){}
		
	}
	
	void conect(PipedOutputStream os)throws Exception
	{
		pi.connect(os);
	}
}

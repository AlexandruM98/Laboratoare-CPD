package Lab1.SolvedExamples.p2;/*
 *
 * Programul exeplifica comunicare intre fire de executie utilizand pipe-uri.
 */
public class Test
{

	public static void main(String args[])
	{
		FirCititor fc = new FirCititor();
		FirScriitor fs = new FirScriitor();
		try
		{
			fc.conect(fs.getPipe());
			fc.start();
			fs.start();
		}catch(Exception e)
		{e.printStackTrace();}
	}
}


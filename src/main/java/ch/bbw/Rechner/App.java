package ch.bbw.Rechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	    	
        System.out.println( "Gib die erste Zahl ein" );
        
        BufferedReader in1 = new BufferedReader(new InputStreamReader(System.in));
        String inZahl1 = null;
		try {
			inZahl1 = in1.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
        System.out.println( "Gib die zweite Zahl ein" );
        
        BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
        String inZahl2 = null;
		try {
			inZahl2 = in2.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Rechner rechner1 = new Rechner();
		rechner1.adieren(Integer.parseInt(inZahl1) , Integer.parseInt(inZahl2));
		
		//Test1
		TestRechner test1 = new TestRechner();
		test1.TestZweiPositive();
		//Test2
		TestRechner test2 = new TestRechner();
		test2.TestZweiNegative();
		//Test3
		TestRechner test3 = new TestRechner();
		test3.TestZweiNull();
		
    }
}

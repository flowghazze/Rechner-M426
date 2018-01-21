package ch.bbw.Rechner;

public class TestRechner {
	
	public void TestZweiPositive(){
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Das ist der Test für die Adition von zwei Positiven Zahlen");
		
		int zahl1 = 5;
		int zahl2 = 8;
		
		Rechner test = new Rechner();
		test.adieren(zahl1, zahl2);
		
		System.out.println("Erwartete Summe 5 + 8 = 13");	
		
	}
	
	public void TestZweiNegative(){
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Das ist der Test für die Adition von zwei Negativen Zahlen");
		
		int zahl1 = -5;
		int zahl2 = -8;
		
		Rechner test = new Rechner();
		test.adieren(zahl1, zahl2);
		
		System.out.println("Erwartete Summe -5 + -8 = -13");	
		
	}
	
	public void TestZweiNull(){
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Das ist der Test für die Adition von zwei NULL Wert Zahlen");
		
		int zahl1 = 0;
		int zahl2 = 0;
		
		Rechner test = new Rechner();
		test.adieren(zahl1, zahl2);
		
		System.out.println("Erwartete Summe 0 + 0 = 0");	
		
	}

}

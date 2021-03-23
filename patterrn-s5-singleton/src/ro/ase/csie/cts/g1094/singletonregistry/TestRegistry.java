package ro.ase.csie.cts.g1094.singletonregistry;

public class TestRegistry {

	public static void main(String[] args) {
		DbConnection con1 =DbConnection.getDbConnection("127.0.0.1", "devdb");
		DbConnection con2 =DbConnection.getDbConnection("127.0.0.1", "devdb");
		DbConnection con3 =DbConnection.getDbConnection("126.1.2.1", "devdb");
		
		if (con1==con2) {
			System.out.println("THEY ARE THJE SAME");
		}
		
		if (con2!=con3) {
			System.out.println("THEY ARE different");
			
	}

}
}

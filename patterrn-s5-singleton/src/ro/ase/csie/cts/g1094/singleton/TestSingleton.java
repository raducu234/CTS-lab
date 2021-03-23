package ro.ase.csie.cts.g1094.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DbConnection con1 =DbConnection.getConnection();
DbConnection con2 =DbConnection.getConnection();
		//DbConnection con1 =DbConnection.getConnection("127.0.0.1:1443","cts");
		//DbConnection con2 =DbConnection.getConnection("127.0.0.1:1443","cts");
		//DbConnection con =DbConnection.getConnection("127.0.0.1:1443","cts");
if(con1==con2) {
	System.out.println("They are the same");
}
}
}

package ro.ase.csie.cts.g1094.singleton.staticref;


public class DbConnection {
String connString;
String schema;
public final static DbConnection connection =new DbConnection();


private DbConnection() {
	System.out.println("Creating a connection object");
	System.out.println("Loading configuration....");
	this.connString="127.0.0.1:1443";
	this.schema="cts";
}




private DbConnection(String connString,String schema) {
	super();
	this.connString=connString;
	this.schema=schema;
}

}

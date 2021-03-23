package ro.ase.csie.cts.g1094.singletonregistry;

import java.util.Hashtable;

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

private static Hashtable<String,DbConnection> connections=new Hashtable<>();


private DbConnection(String connString,String schema) {
	super();
	this.connString=connString;
	this.schema=schema;
}

public static DbConnection getDbConnection(String connString,String schema) {
	DbConnection connection =connections.get(connString);
	if(connection==null) {
		connection = new DbConnection(connString,schema);
		connections.put(connString, connection);
	}
	return connection;
}
}
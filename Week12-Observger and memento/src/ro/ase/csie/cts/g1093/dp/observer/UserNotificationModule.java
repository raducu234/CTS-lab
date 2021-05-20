package ro.ase.csie.cts.g1093.dp.observer;

public class UserNotificationModule implements ConnectionStatusInterface {
	public void connectionDown() {
		System.out.println("Alert: Connection lost");
	}

	public void connectionUp() {
	
}
}

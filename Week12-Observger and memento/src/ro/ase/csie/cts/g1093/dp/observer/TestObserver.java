package ro.ase.csie.cts.g1093.dp.observer;

public class TestObserver {

	public static void main(String[] args) {
		ServerConnectionModule monitor  = new ServerConnectionModule();
		
		monitor.networkStatusChanged(ConnectionStatus.UP);
		
		ConnectionStatusInterface backup = new BackupModule();
		ConnectionStatusInterface notifications = new UserNotificationModule();
		
		monitor.register(backup);
		monitor.register(notifications);
		
		monitor.networkStatusChanged(ConnectionStatus.DOWN);
		
		monitor.unregister(notifications);
		
		monitor.networkStatusChanged(ConnectionStatus.UP);
		
	}

}

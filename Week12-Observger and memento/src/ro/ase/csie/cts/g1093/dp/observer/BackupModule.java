package ro.ase.csie.cts.g1093.dp.observer;

public class BackupModule implements ConnectionStatusInterface  {
	@Override
	public void connectionDown() {
		System.out.println("Create a local copy of the data...");
	}

	@Override
	public void connectionUp() {
		System.out.println("Reloading game level");
	}
}

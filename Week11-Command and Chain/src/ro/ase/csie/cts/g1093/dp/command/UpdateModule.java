package ro.ase.csie.cts.g1093.dp.command;

public class UpdateModule implements InterfaceAsyncronTask {


	@Override
	public void startTaskAsincron(String details) {
		System.out.println("Start update for version " + details);
		
	}

}

package ro.ase.csie.cts.g1093.dp.command;

public class TestCommand {

	public static void main(String[] args) {
	    public static void main(String[] args) {

	        TaskManager manager = new TaskMnager();

	        manager.addTask(new TaskAsincron(new UpdateModule(), "10.1",5));
	        manager.addTask(new TaskAsincron(new ModulAutoSave(), "finiishing...",1));

	        System.out.println("Game continues..");

	        manager.executeNextTask();

	        System.out.println("Game continues...");

	        manager.executeNextTask();

	        System.out.println("Game continues...");
	}

}

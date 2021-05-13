package ro.ase.csie.cts.g1093.dp.command;

public class TaskManager {
	

	    List<InterfaceAsyncronTask> tasks = new ArrayList<>();
	   

	    public void addTask(InterfaceAsyncronTask task) {
	        tasks.add(task);
	    }

	    public void executaUrmatorulTask() {
	        if (tasks.size() > 0) {
	        	InterfaceAsyncronTask task = tasks.get(0);
	            task.startTaskAsincron();
	            tasks.remove(0);
	        }
	    }
	}

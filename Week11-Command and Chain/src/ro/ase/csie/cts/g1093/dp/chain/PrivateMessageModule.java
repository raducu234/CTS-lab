package ro.ase.csie.cts.g1093.dp.chain;

public class PrivateMessageModule  extends GenericMessageHnadler{

	@Override
	public void processMessage(Message message) {
	
		if (!message.destination.toLowerCase().equals("@everyone")) {
			System.out.println("Private message for " + message.destination+":"+message.text);
			
		}
		else {
			if(this.next!=null) {
				this.next.processMessage(message);
			}
		}
		
	}

}

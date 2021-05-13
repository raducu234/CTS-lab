package ro.ase.csie.cts.g1093.dp.chain;

public abstract class GenericMessageHnadler {

	GenericMessageHnadler next=null;
	
	public abstract void processMessage(Message message);

	public GenericMessageHnadler getNext() {
		return next;
	}

	public void setNext(GenericMessageHnadler next) {
		this.next = next;
	}
	
}

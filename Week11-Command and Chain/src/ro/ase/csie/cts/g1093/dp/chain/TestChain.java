package ro.ase.csie.cts.g1093.dp.chain;

public class TestChain {

	public static void main(String[] args) {
		
		

		GenericMessageHnadler filterModule=new FilterModule("English");
		GenericMessageHnadler privateModule=new PrivateMessageModule();
		GenericMessageHnadler groupModule=new GroupMessageModule();

	filterModule.setNext(privateModule);
	privateModule.setNext(groupModule);
	
	GenericMessageHnadler chatServer=filterModule;
	
	chatServer.processMessage(new Message("Hello John","@John" , 1));
	chatServer.processMessage(new Message("I hate you","@John" , 1));
	chatServer.processMessage(new Message("Let s join the party","@everyone", 1));
	}

}

package ro.ase.csie.cts.g1093.dp.cpmposite;

public class NPC extends AbstractNode{

	
	@Override
	public void attack(String playerName) {
		System.out.println(String.format("%s is attacking"));
		
	}

	@Override
	public void retreat() {
		System.out.println(String.format("%s is retreating"));
		
	}

	@Override
	public void move() {
		System.out.println(String.format("%s is moving"));
		
	}

	@Override
	public void addNode(AbstractNode node) {
		
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void deleteNode(AbstractNode node) {
		throw new UnsupportedOperationException();
		
	}

}

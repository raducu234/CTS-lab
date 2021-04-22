package ro.ase.csie.cts.g1093.dp.cpmposite;

public abstract class AbstractNode implements NPCActions {

	public abstract void addNode(AbstractNode node);
	public AbstractNode getNode(int node);
	public  abstract void deleteNode(AbstractNode node);
	
}

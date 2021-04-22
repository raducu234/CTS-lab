package ro.ase.csie.cts.g1093.dp.cpmposite;

import java.util.ArrayList;

public class Group extends AbstractNode{

	
	String name;
	public Group(String name, ArrayList<AbstractNode> nodes) {
		super();
		this.name = name;
		this.nodes = nodes;
	}


	ArrayList<AbstractNode> nodes=new ArrayList<>();
	@Override
	public void attack(String playerName) {
		for (AbstractNode node:nodes)
			node.attack(playerName);
		
	}

	@Override
	public void retreat() {
		for (AbstractNode node:nodes) {
			
			node.retreat();
		}
		
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNode(AbstractNode node) {
		this.nodes.add(node);
		
	}

	public ArrayList<AbstractNode> getNodes() {
		return nodes;
	}

	
	@Override
	public void deleteNode(AbstractNode node) {
		this.nodes.remove(node);
		
	}

}

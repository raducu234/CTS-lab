package ro.ase.csie.cts.g1093.dp.cpmposite;

public class TestComposite {

	public static void main(String[] args) {
		Group group1=new Group("Red Team");
		group1.addNode(new NPC("Soldier1",100));
		group1.addNode(new NPC("Soldier2",100));
		
		AbstractNode group2 =new Group("BlueTeam");
		group2.addNode(new NPC("Soldier3",1550));
		group2.addNode(new NPC("Tank",300));
		
		AbstractNode levelGroup=new Group("Level 2");
		levelGroup.addNode(new NPC("Level boss",100));
		levelGroup.addNode(group1); 
		levelGroup.addNode(group2);
		
		levelGroup.attack("SUPERMAN");
		levelGroup.retreat();
		levelGroup.getNode(0).move();
	}

}

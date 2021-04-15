package ro.ase.csie.ct.g1093.dp.adapter;

public abstract class ACMECharacter {

	protected String name;
	protected int lifePoints;
	
	public ACMECharacter(String name, int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
	}

	public String getName() {
		return name;
	}



	
	public  abstract void move();
	public  abstract void takeAHit(int points);
	public  abstract void heal(int points);
	
	
	
}

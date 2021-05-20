package ro.ase.csie.cts.g1093.memento;

import java.util.Date;

public class HeroMemento {
	String name;
	int lifePoints;
	String magic;
	
	Date timestamp;
	
	
	public HeroMemento(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
		this.timestamp = new Date();
	}
	
	public String getName() {
		return name;
	}
	public int getLifePoints() {
		return lifePoints;
	}
	public String getMagic() {
		return magic;
	}
	
}

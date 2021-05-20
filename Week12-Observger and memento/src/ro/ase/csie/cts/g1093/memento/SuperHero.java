package ro.ase.csie.cts.g1093.memento;

public class SuperHero {
	String name;
	private int lifePoints;
	String magic;
	
	public SuperHero(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
	}
	
	public void attack() {
		System.out.println("Is attacking ...");
	}
	
	public void heal() {
		System.out.println("Is healing ...");
	}
	
	public void takeAHit() {
		this.magic+=magic;
	}
	
	public HeroMemento createRestorePoint() {
		return new HeroMemento(name, lifePoints, magic);
	}
	
	public void restore(HeroMemento memento) {
		this.name = memento.name;
		this.lifePoints = memento.lifePoints;
		this.magic = memento.magic;
	}
}

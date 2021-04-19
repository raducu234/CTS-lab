package ro.ase.csie.cts.g1093.dp.decorator;

import ro.ase.csie.ct.g1093.dp.adapter.ACMECharacter;

public abstract class ACMEAbstractDecorator extends ACMECharacter {

	ACMECharacter character = null;

	public ACMEAbstractDecorator(ACMECharacter hero) {
		super(hero.getName(), hero.getLifePoints());
		this.character = hero;
	}

	public void move() {
		this.character.move();
	}
	
	public void takeAHit(int points) {
		this.character.takeAHit(points);
	}
	public void heal(int points) {
		
		
		this.character.heal(points);
		
		
	}
	
	
	
}

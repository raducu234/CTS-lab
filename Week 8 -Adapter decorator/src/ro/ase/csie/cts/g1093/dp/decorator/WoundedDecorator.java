package ro.ase.csie.cts.g1093.dp.decorator;

import ro.ase.csie.ct.g1093.dp.adapter.ACMECharacter;

public class WoundedDecorator  extends ACMEAbstractDecorator{

	
	public final static int MIN_POINTS=200;
	
	
	@Override
	public void move() {
		if (this.character.getLifePoints()<MIN_POINTS)
			System.out.println();
		super.move();
	}


	public WoundedDecorator(ACMECharacter hero) {
		super(hero);
		// TODO Auto-generated constructor stub
	}
	

}

package ro.ase.csie.cts.g1093.dp.decorator;

import ro.ase.csie.ct.g1093.dp.adapter.ACMECharacter;
import ro.ase.csie.ct.g1093.dp.adapter.DisneyActions;
import ro.ase.csie.ct.g1093.dp.adapter.DonaldDuck;
import ro.ase.csie.ct.g1093.dp.adapter.FantasyCharacter;

public class TestDecorator {

	public static void main(String[] args) {
		
		
		ACMECharacter dragon=new FantasyCharacter("Blue dsragonm",1000)
				
		dragon.move();
		dragon.takeAHit();
		dragon.heal();
		
		dragon=new ArmorDecorator(dragon,200);
		dragon.takeAHit(300);
		
		dragon=new WoundedDecorator(dragon);
		dragon.heal();
		
		ACMECharacter dragon2=new FantasyCharacter("Yellow dragon",500);
		dragon2.changeLocation(100,50);
		dragon2.losePower(150);
		dragon2.recoverPower(100);
	}

}

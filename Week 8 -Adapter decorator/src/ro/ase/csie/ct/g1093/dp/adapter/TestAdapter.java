package ro.ase.csie.ct.g1093.dp.adapter;

import java.util.ArrayList;

public class TestAdapter {


	ACMECharacter dragon=new FantasyCharacter("Blue dragon", 1000);
			dragon.move();
			dragon.takeAHit();
			dragon.heal();
			
			DisneyActions donald=new DonaldDuck("Donald Duck",500);
			donald.changeLocation(100,50);
			donald.losePower(150);
			donald.recoverPower(100);
			
			
			//use the adaptor
			ArrayList<ACMECharacters> characters=new ArrayList<>();
			characters.add(dragon);
			//characters.add(donald);
			Disney2ACMEAdapter donaldAdapter=new Dysney2ACMEAdapter(donald);
			characters.add(donaldAdapter);
		   System.out.println("----------------");
			for(ACMECharacter hero: characters) {
				hero.move();
				hero.takeAHit(50);
				
			}
			
}

package ro.ase.csie.ct.g1093.dp.adapter;

public class Disney2ACMEAdapter extends ACMECharacter{

	public Disney2ACMEAdapter(DisneyActions disneyC) {
		super(disneyC.getName(),disneyC.getPowerLevel());
		this.disneyCharaccter=disneyC;
		
		}

	DisneyActions disneyCharaccter = null;

	@Override
	public void move() {
this.disneyCharaccter.changeLocation(0, 0);		
	}

	@Override
	public void takeAHit(int points) {
		this.disneyCharaccter.losePower(points);
		
	}

	@Override
	public void heal(int points) {
		this.disneyCharaccter.recoverPower(points);
		
	}
	
}

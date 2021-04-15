package ro.ase.csie.ct.g1093.dp.adapter;

public class DonaldDuck implements DisneyActions {
	String name;
	int powerLevel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPowerLevel() {
		return powerLevel;
	}


	public void recoverPower(int power) {
		System.out.println(String.format("Recovering %d power", power));
		this.powerLevel+=power;
	}
	
	public void losePower(int power) {
		System.out.println(String.format("Losing - %d power", power));
		this.powerLevel-=power;
	}
	
	public void changeLocation(int power) {
		System.out.println(String.format("Moving to new coordinates %d ", power));
		this.powerLevel+=power;
	}
	@Override
	public void changeLocation(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}

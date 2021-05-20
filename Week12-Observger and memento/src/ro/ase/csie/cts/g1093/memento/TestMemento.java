package ro.ase.csie.cts.g1093.memento;

public class TestMemento {

	public static void main(String[] args) {
	SuperHero superman = new SuperHero("Superman", 100, "Fly");
		
		HeroMemento initialsave = superman.createRestorePoint();
		
		superman.takeAhit(50);
		superman.takeAhit(20);
		System.out.println("LifePoints " + superman.lifePoints);
		
		superman.restore(initialsave);
		System.out.println("LifePoints " + superman.lifePoints);
		

	}

}

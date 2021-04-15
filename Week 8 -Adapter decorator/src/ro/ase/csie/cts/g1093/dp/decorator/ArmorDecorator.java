package ro.ase.csie.cts.g1093.dp.decorator;

public class ArmorDecorator extends ACMEAbstractDecorator {
	int armorLevel;

	public ArmorDecorator(ACMECharacter hero, int armorLevel) {
		super(hero);
		this.armorLevel = armorLevel;
	}

	@Override
	public void takeAHit(int points) {
		int lostPoints = points - armorLevel;
		if (lostPoints >0)
			this.character.takeAHit(lostPoints);
			super.takeAHit(points);
	}
}

package ro.ase.csie.cts.g1093.dp.prototype;

public class TestPrototype {

	public static void main(String[] args) {

		//Char3DModel mickeyMouse=new Char3DModel(CharacterType.DISNEY,"RED");
		//Char3DModel mickeyMouse2=new Char3DModel(CharacterType.MARVEL,"RED");
		//Char3DModel mickeyMouse3=new Char3DModel(CharacterType.DISNEY,"RED");

		
		Char3DModel mickeyMouse2=new (Char3DModel) mickeyMouse.clone();
		Char3DModel mickeyMouse3=new (Char3DModel) mickeyMouse.clone();
	
	}

}

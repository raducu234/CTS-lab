package ro.ase.csie.cts.g1093.dp.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		ScreenData soldier1=new ScreenData(100,100,0,"blue");
		ScreenData soldier2=new ScreenData(100,50,0,"Green");
		ScreenData building1=new ScreenData(100,50,0,"Grey");
		ScreenData building2=new ScreenData(100,50,0,"Dark grey");

		
		Model3DInterface soldierModel=ModelIsFactory.getModel(ModelType.SOLDIER)
				soldierModel.display(soldier1);
		        soldierModel.display(soldier2);
		        
		        ModelIsFactory.getModel(ModelType.BUILDING).display(building1);
		        ModelIsFactory.getModel(ModelType.BUILDING).display(building2);
	}

}

package ro.ase.csie.cts.g1093.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Char3DModel implements Cloneable        {

	CharacterType type;
	String color;
	
	ArrayList<Integer> graphicPoints;

	
public Char3DModel(CharacterType type, String color) {
		super();
		this.type = type;
		this.color = color;
		
		System.out.println("Genereating the 3D model points........");

		try {
			Thread.sleep(2000);
			Random random=new Random(7887);
			for (int i=0; i<20; i++) {
				graphicPoints.add(random.nextInt(1000));
			}
			System.out.println("Model loaded.");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
private Char3DModel() {

}
@Override
public Object clone() throws CloneNotSupportedException {
	//dont
	//Char3DModel copy= new  Char3DModel(this.type,this.color);
	Char3DModel copy=new Char3DModel();
	copy.type=this.type;
	copy.color=this.color;
	copy.graphicPoints=(ArrayList<Integer>) this.graphicPoints.clone();
	return copy;
}
	
	

}

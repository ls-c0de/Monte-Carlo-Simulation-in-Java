package monte_carlo;

import java.util.ArrayList;

public class Spielfeld {
	private int groesseX = 1000;
	private int groesseY = 1000;
	private Dropper d;
	private ArrayList<AreaObject> objectList = new ArrayList<AreaObject>();
	private final static int MAX_OBJECTS = 2;
	
	public int getGroesseX() {
		return groesseX;
	}
	
	public int getGroesseY() {
		return groesseY;
	}
	
	public Spielfeld() {
		
	}
	
	public Spielfeld(int x, int y, Dropper dropper, AreaObject... aob) {
		groesseX = x;
		groesseY = y;
		
		d = dropper;
		
		for (int i = 0; i < aob.length; i++) {
			objectList.add(aob[i]);
			System.out.println("Object added sucessfully");
		}
	}
	
	public void nextMove() {
		Point p = d.dropRandom();
		System.out.println(p.toString());
		
		objectList.forEach((obj) -> {
			if (obj.isInside(p)) {
				obj.addWeight();
			}
		});
	}
	
	public void outputWeight() {
		int[] res = new int[5];
		int i = 0;
		
//		objectList.forEach((p) -> {
//			System.out.println(p.getWeight()); 
//		}); //Debugging
		
		System.out.println("\nCircle: " + objectList.getFirst().getWeight());
		System.out.println("Rectangle: " + objectList.getLast().getWeight());
		
		for (AreaObject o : objectList) {
			res[i] = o.getWeight();
			i++;
		}
		
		System.out.println("\nVerhältnis von Circle zu Rectangle: " + (double) res[0]/ (double) res[1]);
		System.out.println("PI ist: " + Math.PI);
	}
	
	public String toString() {
		return null;
		
	}
}

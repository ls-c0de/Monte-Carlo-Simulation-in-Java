package monte_carlo;

import java.util.Random;

public class Dropper {
	private int groesseX;
	private int groesseY;
	
	public Dropper() {

	}
	
	public void setBounds(Spielfeld s) {
		groesseX = s.getGroesseX();
		groesseY = s.getGroesseY();
	}
	
	public Point dropRandom() { //returns random Point
		Random rand = new Random();
		return new Point(rand.nextInt(groesseX), rand.nextInt(groesseY));
	}

	public Point dropSpecific(int x, int y) {
		return new Point(x, y);
	}
}

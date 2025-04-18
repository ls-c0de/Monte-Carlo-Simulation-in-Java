package monte_carlo;

public class Point {
	private int xCord;
	private int yCord;
	
	public Point(int x, int y) {
		xCord = x;
		yCord = y;
	}
	
	public int getxCord() {
		return xCord;
	}
	public int getyCord() {
		return yCord;
	}
	
	public String toString() {
		return "Meine Koordinaten sind: X: " + xCord  + " und Y: " + yCord;
	}

}

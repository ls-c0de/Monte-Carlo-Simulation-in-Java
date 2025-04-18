package monte_carlo;

public class Circle implements AreaObject{
	private Point center;
	private int radius;
	private int weight = 0;
	
	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}

	
	private int calcDistanceToCenter(Point p) {
		int a = p.getxCord() - center.getxCord();
		int b = p.getyCord() - center.getyCord();
		int erg = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		System.out.println("Distanz zum Zentrum: " + erg);	
		return erg;
	}
	
	@Override
	public boolean isInside(Point p) {
		if (calcDistanceToCenter(p) < radius) {
			System.out.println("Punkt ist drin");
			return true;
		} else 
			System.out.println("Punkt ist draußen");
			return false;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public void addWeight() {
		weight += 1;
	}

}

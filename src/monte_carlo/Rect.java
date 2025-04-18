package monte_carlo;

public class Rect implements AreaObject {
	private Point linksUnten;
	private Point rechtsOben;
	private int weight = 0;
	
	public Rect(Point p1, Point p2) {
		linksUnten = p1;
		rechtsOben = p2;
	}
	
	@Override
	public boolean isInside(Point p) {
		if((linksUnten.getxCord() <= p.getxCord() && p.getxCord() <= rechtsOben.getxCord()) && 
			linksUnten.getyCord() <= p.getyCord() && p.getyCord() <= rechtsOben.getyCord()) {
			System.out.println("Punkt ist drinne");
			return true;
		} else return false;
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

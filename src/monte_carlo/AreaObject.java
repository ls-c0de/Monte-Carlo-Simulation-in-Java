package monte_carlo;

public interface AreaObject {
	public boolean isInside(Point p);
	public int getWeight();
	public void addWeight();
}

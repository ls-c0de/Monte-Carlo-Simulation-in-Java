package monte_carlo;

public class Main {
	public static void main(String[] args) {
		setup();
	}

	public static void setup() {
		Dropper d = new Dropper();
		Spielfeld s = new Spielfeld(100000, 100000, d, 
				new Circle(new Point(20000, 40000), 20000), 
				new Rect(new Point(50000, 20000), new Point(70000, 40000)));
		d.setBounds(s);
		
		int anzahlDurchlaeufe = 1000000;

		for (int i = 0; i < anzahlDurchlaeufe; i++) {
			s.nextMove();
		}
		s.outputWeight();
	}

}

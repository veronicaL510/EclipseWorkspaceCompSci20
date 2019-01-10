package tutorialPackage;

public class TestHero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hero h1 = new Hero();
		Hero h2 = new Hero("dudu", "invisibility", 7, 150, 12);
		Hero h3 = new Hero("blink", "calm", 3, 199, 2);
		
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		
		Meteorite m = new Meteorite();
		
		m.mutate(h1);
		m.mutate(h2);
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		
		while(h1.getHealth() > 0) {
		h2.attack(h1);
		System.out.println(h1.getHealth());
		
		} // end while
	}

}

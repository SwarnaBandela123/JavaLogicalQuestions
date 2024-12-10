package inheritance;

public abstract class AbstarctClassShape {
	 abstract void draw();
	}
	class Circle extends AbstarctClassShape {
	    void draw() {
	        System.out.println("Drawing a Circle");
	    }
	}
	class Rectangle extends AbstarctClassShape {
	    void draw() {
	        System.out.println("Drawing a Rectangle");
	    }
	}
	
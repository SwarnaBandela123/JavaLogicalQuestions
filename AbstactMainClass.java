package inheritance;

public class AbstactMainClass {
	   public static void main(String[] args) {
	    	AbstarctClassShape circle = new Circle();
	        circle.draw(); // Output: Drawing a Circle

	        AbstarctClassShape rectangle = new Rectangle();
	        rectangle.draw(); // Output: Drawing a Rectangle
	    }
}

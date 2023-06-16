/**
 * 
 */
package Construct_and_Constructor_Overloading;

/**
 * Constructor Overloading Example1
 * @author Toufique
 *
 */
public class Box {

 private int height,width;
 public Box()
 {
	 height = 15;
	 width =10;
 }
 public Box(int height,int weight)
 {
	 this.height = height;
	 this.width = width; 
 }
	public static void main(String[] args) {
		
		Box b1 = new Box();
		Box b2 = new Box(20,40);
		Box b3 = new Box(50,60);
	    Box b4 = new Box();
		
		System.out.println(" For Box 1: Height = "+b1.height+" Width = "+b1.width);
		System.out.println(" For Box 1: Height = "+b2.height+" Width = "+b2.width);
		System.out.println(" For Box 1: Height = "+b3.height+" Width = "+b3.width);
		System.out.println(" For Box 1: Height = "+b4.height+" Width = "+b4.width);

	}

}

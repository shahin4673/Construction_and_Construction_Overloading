/**
 * 
 */
package Construct_and_Constructor_Overloading;

/**
 * Parameterised Constructor Example 2
 * @author Toufique
 *
 */
public class Employee {

  int empID;
  String empName;
  Employee(int id,String name)
  {
	  this.empID = id;
	  this.empName =name;
  }
  void display()
  {
	  System.out.println("ID : "+empID+" Name :"+empName);
  }
  
	public static void main(String[] args) {
		Employee e1 =new Employee(001,"Toufique Ahemed");
		Employee e2 = new Employee(002," Ismot Ara Khan");
		e1.display();
		e2.display();

	}

}

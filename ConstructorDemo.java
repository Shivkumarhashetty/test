
public class ConstructorDemo {

	public static void main(String[] args) {
		EmployInfo emp1=new EmployInfo();
		EmployInfo emp2=new EmployInfo();

		emp1.display();
		emp2.display();

	}

}
 class Std
 {
	 int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
 }


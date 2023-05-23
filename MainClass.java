package mypack;

class Employee {

	int empno = 1;
	String ename = "Asha";

	Salary sal;

	public Employee() {
		System.out.println("From Employee Constructor");
		sal = new Salary();
	}

	public Employee(int x) {
		this.empno = x;
		System.out.println("From Employee Constructor" + x);
		sal = new Salary();
	}

	public void getDetails() {
		System.out.println(empno + " -- " + ename + " --- " + sal.getNet());
	}

	public void Netsal(double basic) {
		sal.setBasic(basic);
		sal.setDa(0.6 * basic);
		sal.setPf(0.9 * basic);
		sal.setGross(sal.getBasic() + sal.getDa() + sal.getPf());
		sal.setNet(sal.getGross() - sal.getPf());

	}

}

class Manager extends Employee {
	String dept = "IT";

	public Manager() {
		super(888); // used to invoke base clas constructor
		System.out.println("From Mgr Constr");

	}

	public void getDetails() {
		System.out.println(empno + " -- " + ename + "--  " + dept);
	}

}

public class MainClass {

	public static void main(String[] args) {
		Employee emp = new Employee(4);
		emp.Netsal(79000);
		emp.getDetails();

		Manager mgr = new Manager();
		mgr.getDetails();

	}

}

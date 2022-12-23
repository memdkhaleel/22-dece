// package lab_exercise;

class Member {
	public String na = "khaleel", add = "#123 bangalore", spec = "Java", dept = " web developer";
	public int age = 22, p_no = 123456789;
	public String mna = "Sabir", madd = "#234 bangalore", mspec = "Python";
	public int mage = 25, mp_no = 23456789;

	public void p_sal(int sal) {
		System.out.println(" Salary: " + sal);
	}
}

class Emp extends Member {
	public void show() {
		System.out.println(" The Employee Details are...");
		System.out.println(" Name: " + na);
		System.out.println(" Age: " + age);
		System.out.println(" Phone No: " + p_no);
		System.out.println(" Address: " + add);
		p_sal(56000);
		System.out.println(" Specializatioin: " + spec);
		System.out.println(" Department: " + dept);
		System.out.println(" ");
	}
}

class Man extends Member {
	public void show() {
		System.out.println(" The Manger Details are...");
		System.out.println(" Name: " + mna);
		System.out.println(" Age: " + mage);
		System.out.println(" Phone No: " + mp_no);
		System.out.println(" Address: " + madd);
		p_sal(100000);
		System.out.println(" Specializatioin: " + mspec);

	}
}

public class Members {
	public static void main(String[] args) {

		Emp e = new Emp();
		e.show();

		Man m = new Man();
		m.show();

	}
}
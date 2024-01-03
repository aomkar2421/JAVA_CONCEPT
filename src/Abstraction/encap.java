package Abstraction;

class Ankita{
private int empId;
	
	void set(int eid) {
		empId=eid;
	}
	
	int get () {
		return empId;
	}
}

public class encap{
	public static void main(String[] args) {
		Ankita a1=new Ankita();
		a1.set(183);
		System.out.println(a1.get());
		}
	
}
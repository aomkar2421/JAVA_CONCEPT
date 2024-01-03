package static_final_super_this;

public class Static102Emp {
public static void main(String[] args) {
	Static102Emp s1 =new Static102Emp(101, "Ankita");
	s1.show();
	
	Static102Emp s2 =new Static102Emp(103, "Nikita");
	s2.show();
}

int empid;
String empname;
static  String company= "SP";

Static102Emp(int empid,String empname){
	this.empid=empid;
	this.empname=empname;
}

void show() {
	System.out.println(empid+" "+empname+" "+company);
}

}

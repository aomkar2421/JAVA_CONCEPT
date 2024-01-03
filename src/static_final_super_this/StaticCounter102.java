package static_final_super_this;

public class StaticCounter102 {

	public static void main(String[] args) {
		StaticCounter102 s1=new StaticCounter102();
		StaticCounter102 s2=new StaticCounter102();
		StaticCounter102 s3=new StaticCounter102();

	}

	static int count=0;
	StaticCounter102(){
		count++;
		System.out.println(count);
	}
}

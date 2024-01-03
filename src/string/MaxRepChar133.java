package string;

public class MaxRepChar133 {
public static void main(String[] args) {
	String s1="abbccc";
	
	int arr[]=new int [127];
	
	for (int i = 0; i < s1.length(); i++) {
		arr[s1.charAt(i)]=arr[s1.charAt(i)]+1;
	}
	
	int max=-1;
	char c=' ';
	for (int i = 0; i < s1.length(); i++) {
		if(max<arr[s1.charAt(i)]) {
			max=arr[s1.charAt(i)];
			c=s1.charAt(i);
		}
		
	}
	System.out.println("Max char is "+c);
	
	int min=1;
	char d=' ';
	for (int i = 0; i < s1.length(); i++) {
		if(min>=arr[s1.charAt(i)]) {
			min=arr[s1.charAt(i)];
			d=s1.charAt(i);
		}
		
	}
	System.out.println("Min char is "+d);

}

}



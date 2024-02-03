package telusko;

public class Jagged {
	public static void main(String[] args) {
		
		int [][] arr = { {1, 2, 3, 4} ,{5, 6} , {7, 8, 9} }; 
		
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
		
		
		int [][] arr1 = new int [3][];
		arr1[0] = new int[3]; 
        arr1[1] = new int[2]; 
        arr1[2] = new int[4]; 
        
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length ; j++) {
				arr1[i][j] = 0;
				
			}
		}
		
		for (int i[] : arr1) {
			for (int j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}

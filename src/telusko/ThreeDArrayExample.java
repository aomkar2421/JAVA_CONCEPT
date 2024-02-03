package telusko;

public class ThreeDArrayExample {
    public static void main(String[] args) {

        int[][][] threeDArray = new int[3][3][3];

        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    threeDArray[i][j][k] = 0;
                }
            }
        }


        System.out.println("Printing using normal for loop:");
        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


        System.out.println("\nPrinting using enhanced for loop:");
        for (int[][] i : threeDArray) {
            for (int[] j : i) {
                for (int k : j) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

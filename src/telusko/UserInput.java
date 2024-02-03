package telusko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
    public static void main(String[] args) throws IOException {
      
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.println("Enter an integer:");

            String input = reader.readLine();
            int number = Integer.parseInt(input);

            System.out.println("You entered: " + number);
      
    }
}

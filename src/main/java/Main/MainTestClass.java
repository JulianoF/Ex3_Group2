package Main;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainTestClass {

    public static void main(String[] args) throws FileNotFoundException {
        Keyboard testKeyboard = new Keyboard();
        Scanner input = new Scanner(System.in);
        
       String flag = "";
        while(!flag.equalsIgnoreCase("q")){
      
            System.out.print("Type 'q' to quit or 'c' to continue and Choose a product ID: ");
            flag = input.nextLine();
            if(flag.equalsIgnoreCase("c")){
                testKeyboard.productIDInput(); // THIS LINE WAITS FOR USER INPUT}
            }
            else{
                System.exit(0);
            }
            
        }
    }
}

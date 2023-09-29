package Main;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Keyboard {
    public Keyboard(){}
    
    public void productIDInput() throws FileNotFoundException{
        Scanner scan = new Scanner(System.in);
        int iD = scan.nextInt();
        
        System.out.println(iD); // TEST CODE
     
        scan.close();
        
        CashRegister testCash = new CashRegister();
        testCash.getItem(iD);
    }
}

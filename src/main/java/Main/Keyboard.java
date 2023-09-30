package Main;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Keyboard {
    public Keyboard(){}
    
    public void productIDInput() throws FileNotFoundException{
        Scanner scan = new Scanner(System.in);
        int iD = scan.nextInt();
        
        //System.out.println(iD); // TEST CODE
     
        scan.close();
        
        //TEST CODE TO SEE IF KEYBOARD CAN CALL CASH REGISTER
        //AND PROPERLY GET THE SENT ITEM
        CashRegister testCash = new CashRegister();
        testCash.getItem(iD);
    }
}
package Main;

import java.io.FileNotFoundException;

public class MainTestClass {

    public static void main(String[] args) throws FileNotFoundException {
        Keyboard testKeyboard = new Keyboard();
        Display testDisplay = new Display();
        
        ////////TEST CODE//////////
        System.out.println(System.getProperty("user.dir"));
        CashRegister test = new CashRegister();
        test.getItem(1);
        test.getItem(2);
        test.getItem(3);
        test.getItem(4);
        
        testKeyboard.productIDInput(); // THIS LINE WAITS FOR USER INPUT
        ///////////////////////////
    }
}

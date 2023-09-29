package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CashRegister {
    private final File productFile;
    
    public CashRegister() throws FileNotFoundException{
        this.productFile = new File("ProductList.txt");
        Scanner lineReader = new Scanner(this.productFile);
    }
    
    
}

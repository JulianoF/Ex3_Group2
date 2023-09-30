package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CashRegister{
    private final File productFile;
    private Scanner lineReader;
    
    public CashRegister() throws FileNotFoundException{
        this.productFile = new File("src/main/java/Main/ProductList.txt");
        this.lineReader = null;

    }
    
    public void getItem(int iD) throws FileNotFoundException{
        this.lineReader = new Scanner(this.productFile);
        while(lineReader.hasNext()){
            if(lineReader.hasNextInt()){
                int current = lineReader.nextInt();
                if(current == iD){
                String name = lineReader.next();
                float price = lineReader.nextFloat();
                
                ////TEST CODE////
                System.out.println(current);
                System.out.println(name);
                System.out.println(price);}
                ////////////////
                
            }else{
                lineReader.next();
            }
        }
    }
    
}

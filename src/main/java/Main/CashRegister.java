package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CashRegister {
    private final File productFile;
    Scanner lineReader;
    //private String[][] db = new String[4][4];
    
    public CashRegister() throws FileNotFoundException{
        this.productFile = new File("src/main/java/Main/ProductList.txt");
        lineReader = new Scanner(this.productFile);

    }
    
    public void getItem(int iD){
        while(lineReader.hasNext()){
            if(lineReader.hasNextInt()){
                int current = lineReader.nextInt();
                String name = lineReader.next();
                Float price = lineReader.nextFloat();
                System.out.println(current);
                System.out.println(name);
                System.out.println(price);
            }else{
                lineReader.next();
            }
        }
    }
    
}

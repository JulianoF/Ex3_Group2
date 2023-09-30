package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CashRegister{
    private final File productFile;
    private Scanner lineReader;
    public Display primaryDisplay;
    
    public CashRegister() throws FileNotFoundException{
        this.productFile = new File("src/main/java/Main/ProductList.txt");
        this.lineReader = null;
        primaryDisplay = new Display();
    }
    
    public void getItem(int iD) throws FileNotFoundException{
        this.lineReader = new Scanner(this.productFile);
        String productDetails = "";
        boolean hasProduct = false;
        while(lineReader.hasNext()){
            if(lineReader.hasNextInt()){
                int current = lineReader.nextInt();
                if(current == iD){
                String name = lineReader.next();
                float price = lineReader.nextFloat();
                hasProduct = true; 
                ////TEST CODE////
                productDetails = "Product ID:" + current + "\nProduct: " + 
                name + "\nPrice $" + price+ "\n";}                
                ////////////////
                
            }else{
                lineReader.next();
            }
        }
        primaryDisplay.notifyDisplay(hasProduct);
        primaryDisplay.updateProduct(productDetails);
    }
    
}

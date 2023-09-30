package Main;

public class Display {
    public Display(){}
    
    public void notifyDisplay(boolean productDetect) {
    	if(productDetect) {
    		System.out.println("Product Detected");
    	}
    	else {
    		System.out.println("No Matching Product found, please try again");
    	}
    }
    
    public void updateProduct(String productDetails) {
    	if(!productDetails.isEmpty())
    	System.out.println(productDetails);
    }
}

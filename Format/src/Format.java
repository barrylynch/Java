

import java.util.Scanner;


public class Format {

	//private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
    	Scanner sc=new Scanner(System.in);
    	int counter = 0;
    	sc.hasNextInt(); 
    	sc.nextLine();
    	String[] arrA = sc.nextLine().split(" ");    	
    	int arrSize = arrA.length;
    	
        //start point
        for (int startPoint = 0; startPoint <arrSize ; startPoint++) 
        {
            for (int grps = startPoint; grps <=arrSize ; grps++) 
            {
            	boolean hasValues = false;
            	int total = 0;
                for (int j = startPoint ; j < grps ; j++) 
                {                	
                	hasValues = true;
                	total += Integer.parseInt(arrA[j]);
                }
                
                if(total > 0) {
                	counter++;}
            }
        }
        System.out.print(counter);
    }
}

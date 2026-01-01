
import java.util.Scanner;
public class arithexecp {
    public static void main(String args[]){

    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    
    try{
        int result =a/b;
        
    }
    catch(Exception e){
        System.out.println("error:cannot didvide by zero.");
    }
}
}
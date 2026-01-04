import java.util.Scanner;
public class PrintintbyUser {
    public static void main (String []args){

      //reads instace which taks i/p from user  
       Scanner sc= new Scanner(System.in);
       System.out.println("you enterd the git number:"); 


       int num=sc.nextInt();//reads the integer from the keyboard
         System.out.println("you enterd :"+ num);
    }
}

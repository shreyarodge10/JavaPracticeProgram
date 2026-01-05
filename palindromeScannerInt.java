import java .util.Scanner;
public class palindromeScannerInt {
   public static void main(String args []){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter an integer:");
 int n=sc.nextInt();
 int r=0;
 int temp=n;
 while(n!=0){
    r=r*10+n/10;
    n=n/10;
 }
    if(temp==r){
        System.out.println("The number is a palindrome");
   } else {
    System.out.println("The number is not a palindrome");
   }
   }
}

import java.util.*;


public class evenoddDigits {
    public static void main (String args[]){
    int number;
    
    Scanner sc= new Scanner(System.in);
   number= sc.nextInt();
System.out.println("enter the number:" );
int evenCount=0;
int oddCount=0;

 number=Math.abs(number);
while(number>0){
   int rem=number%10;
if(rem%2==0){
   evenCount++;
}else{
    oddCount++;
}
 number=number/10;
   }

  System.out.println(evenCount);
System.out.println(oddCount);  

}
}
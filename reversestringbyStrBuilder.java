import java.util.Scanner;
public class reversestringbyStrBuilder {
   public static void main(String args[]){
//    with string builder  
// // String s="hello";
    // StringBuilder sb=new StringBuilder(s).reverse();
    // System.out.println(sb);   } 

   //without the strinbg builder // String s="hello";
    // for (int i=s.length()-1; i>=0;i--){
    //     System.out.print(s.charAt(i));
    // }
Scanner s =new Scanner(System.in);
System.out.println("eneter a string:");
String  sc = s.next();
for(int i=sc.length()-1;i>=0;i--)
{
    System.out.print(sc.charAt(i));
}
}
}

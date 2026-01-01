import java.util.*;
public class spacecount {
 public static  void main(String args[])  {
 Scanner sc=new Scanner(System.in);
 System.out.println("enetr a string:");
 String s=sc.nextLine();
 int spacec=0;
 for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
    if(Character.isWhitespace(ch)){
    spacec++;
    }
        
    
 }
System.out.println("white space are:"+spacec);

 } 
}

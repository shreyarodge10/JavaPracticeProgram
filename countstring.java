import java.util.*;
class countstring{
    public static void main(String args[]){
        String s;
       
        
        Scanner sc=new Scanner(System.in);
         System.out.println("enter string:");
        s=sc.nextLine();
        int letterc=0;
        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(Character.isLetter(ch)){
           letterc++;
        }
    }
    
        System.out.println("number of letter"+letterc);
}


            
        }
    
    


    




public class balancedstring {
 public static void main(String args[]){
    String str="LRRRRLLRLLRL";
    int count=0;
    int balance=0;

    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='L'){
            balance++;b 
            
        }else{
            balance--;
        }
        if(balance==0){
            count++;
        }
    }
  System.out.println("maximum valanced string" +count);
 }   
}

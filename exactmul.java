



public class exactmul {
    public static void main(String args[]){

    int n1=10;
    int n2 =5;
    int r=exactmulofsecond(n1,n2);
    System.out.println(r);


}
public static int exactmulofsecond(int input1,int input2 ){

int n1,n2;
if (input1<=0){
    input1=input1*(-1);
}
if (input2<=0){
    input2=input2*(-1);
}
return input1%10 +input2%10;
}    
}

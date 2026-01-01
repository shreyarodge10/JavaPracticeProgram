public class missnoarr {
    public static void main(String[] args) {
        int a[]={ 1,2,3,4,5,6,8,10};
        for(int i=a[0];i<a[a.length-1];i++){
             boolean found=false;

        
        for(int j=0;j<a.length;j++){
            if(a[j]==i){
                found=true;
                break;
            }
            
            }
            if (!found){
                System.out.println("missing no.:"+i);
        }

    }


        }
        
        
    }


class factorial{
    public static void main(String[] args) {
        int n=6;
        int r=fact(n);
        System.out.println(" factorial is"+r);}
        public static int fact(int n){
            int f=1;
            for(int i=1;i<=n;i++){
               f=f*i; 
            }
         return f;
        }

            
        
    }

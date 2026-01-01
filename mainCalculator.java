
class Calculator {
    int a, b;

    
    Calculator(int a, int b) {
        this.a = a; 
        this.b = b;
    }

    
    public void add() {
        System.out.println("Addition: " + (a + b));
    }
}


class AdvancedCalculator extends Calculator {

    
    AdvancedCalculator(int a, int b) {
        super(a, b);  
    }

   
    public void multiply() {
        System.out.println("Multiplication: " + (a * b));
    }
}


public class mainCalculator {
    public static void main(String[] args) {
        
        AdvancedCalculator ac = new AdvancedCalculator(5, 3);

        
        ac.add();   //8   
        ac.multiply(); //15 
    }
}

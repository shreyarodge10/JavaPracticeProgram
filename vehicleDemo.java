public class vehicleDemo {
    public static void main(String args[]){
        Car myCar=new Car();
        bike mybike=new bike();
        truck mytruck=new truck();
        myCar.start();
        mybike.start();
        mytruck.start();
    }
}
abstract class vehicle{
    abstract void start();
}
class Car extends vehicle
{
    void start(){
        System.out.println("car strs with a push-button.");


    }

}
class bike extends vehicle{
    void start(){
        System.out.println("bike stsrts with a kick.");

    }
}
class truck extends vehicle{
    void start(){
        System.out.println("truck stsrts with key.");
    }
}


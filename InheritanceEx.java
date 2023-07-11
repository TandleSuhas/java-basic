class Vehicle
{
    String brand;
    public Vehicle(String brand)
    {
        this.brand=brand;
    }
    public void start()
    {
        System.out.println("The Vechile Starts");
    }
    public void stop()
    {
        System.out.println("The Vechile Stops");
    }

}
class Car extends Vehicle
 {
     int numWheels;
     public Car(String brand,int numWheels)
     {
       Super(brand);
       this.numWheels=numWheels;
     }
    
    private void Super(String brand) {
    }

    public void drive()
     {
        System.out.println("The car is driving");
     }  
}

public class InheritanceEx
{
    public static void main(String[] args)
    {
        Car mycar=new Car("Toyota",4);
        mycar.start();
        mycar.drive();
        mycar.stop();

    } 
}
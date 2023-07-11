class Vehicle
{
   void start()
   {
     System.out.println("the vehicle starts.");
   }
   void stop()
   {
     System.out.println("the vehicle stops.");
   }
}
  class Car extends Vehicle
   {
    void drive()
     {
       System.out.println("the car is driving.");
     }
   }
 class SportsCar extends Car
   {
     void accelerate()
     {
       System.out.println("the sports car is accelerating.");
     }
  }
  public class InheritanceEx1
    {
     public static void main(String[] args)
      {
        SportsCar mySportsCar=new SportsCar();
        mySportsCar.start();
        mySportsCar.drive();
        mySportsCar.accelerate();
        mySportsCar.stop();
      }
    }
class Animal
{
    String name;
  public Animal(String name)
    {
     this.name=name;
    }
  public void makeSound()
    {
      System.out.println("Animal is making sound");
    }
}

class Dog extends Animal
  {
    String breed;
     public Dog(String name,String breed)
    {
      super(name);
       this.breed=breed;
    }
    public void makeSound()
    {
      super.makeSound();
      System.out.println("Dog is braking");
    }
  
   public void displayDetails()
     {
       System.out.println("Name:"+super.name);
       System.out.println("Breed:"+this.breed);
     }
  }

   public class SuperEx
   {
    public static void main(String[] args)
     {
      Dog myDog=new Dog("Buddy","Labrador");
      myDog.makeSound();
      System.out.println();
      myDog.displayDetails();
     }
}
abstract public class Abstraction {
  abstract  void show();

  public static void main(String[] args) {
      Car c=new Car();
      c.show();
      
      Scooter sc=new Scooter();
      sc.show();
    }
}

class Car extends Abstraction{
    void show(){
        System.out.println("start with key");
    }
}

class Scooter extends Abstraction{
    void show(){
        System.out.println("start with kick");
    }

    
}

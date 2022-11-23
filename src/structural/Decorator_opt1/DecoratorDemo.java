package structural.Decorator_opt1;

//reference digitalOcean
public class DecoratorDemo {

  public static void main(String[] args) {
    Car sportCar = new SportsCar( new BasicCar());
    sportCar.assemble();
    
    Car sportsluxuryCar = new SportsCar( new LuxuryCar( new BasicCar()));
    sportsluxuryCar.assemble();
  }
}

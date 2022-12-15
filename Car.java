

public class Car implements Comparable{

    private String make;
    private String model;
    private int horsepower;

    public Car(String make, String model, int horsepower) {
        this.make = make;
        this.model = model;
        this.horsepower = horsepower;
    }


    public static void main(String[] args) {
        Car car1=new Car("toyota","corolla",110);
        Car car2=new Car("Honda","Cvic",120);
        Car car3=new Car("Honda","Accord",140);
        Car car4=new Car("Porche","panamera",220);

        LinkedList<Car> car=new LinkedList<Car>();
        car.addToEnd(car1);
        car.addToEnd(car2);
        car.addToEnd(car3);
        car.addToEnd(car4);
        car.display();
        System.out.println(car.findMax());

    }

    @Override
    public int compareTo(Object o) {
       Car c=((Car)o);
       if(this.horsepower==c.horsepower){
           return 0;
       }else if(this.horsepower>c.horsepower){
           return 1;
       }else{
           return -1;
       }
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", horsepower=" + horsepower +
                '}';
    }
}

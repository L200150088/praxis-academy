public class Car{
    private String type;

    public Car(String type){
        this.type = type;
    }

    public void setType(String type){
        this.type = type;
    }

    public static void foo(Car someCar){
        Car newCar = new Car("Sedan");
        someCar = newCar;
        someCar.setType("Coupe");
        System.out.println(newCar.type);
        System.out.println(someCar.type);
    }

    public static void main(String[] args){
        Car myCar = new Car("Sport");
        foo(myCar);
        System.out.println(myCar.type);
    }
}

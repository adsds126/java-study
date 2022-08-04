package taess;

public class staticDemo {
    public static void main(String[] args) {
       Car car1 = new Car();
       Hyundai Santafe = new Hyundai("싼타페");
       car1.sound2();
        Car.sound();
        Kia.sound();
        Santafe.setName("공서");
        System.out.println("싼타페는" + Santafe.getName());

    }
}

class Car{
    public static void sound(){
        System.out.println("부릉");
    }
    public void sound2(){
        System.out.println("부아앙");
    }
}
class Kia extends Car{
    @Override
    public void sound2(){
        System.out.println("뿌릉");
    }
}
class Hyundai{
    private String name;
    Hyundai(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}


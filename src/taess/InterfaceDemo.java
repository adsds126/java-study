package taess;

public interface InterfaceDemo {
    abstract void Santafe();
    abstract void avante();
}
class OurCar implements InterfaceDemo{

    @Override
    public void Santafe() {
        System.out.println("싼타페는 공서");
    }

    @Override
    public void avante() {
        System.out.println("아반떼는 이사모");
    }
}

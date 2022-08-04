package taess;
public abstract class AbstractDemo {

    public abstract void ab();
    public void cd(){
        System.out.println("efg");
    }
}
class test extends AbstractDemo{
    @Override
    public void ab() {
        System.out.print("abcd");
    }
    public void cd(){
        System.out.println("efg");
    }

}

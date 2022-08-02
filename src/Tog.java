public class Tog {
    public static void main(String[] args) {
        Mog a = new Mog();
        a.setName("바둑이");
        System.out.println(a.getName());
        a.setAge(12);
        System.out.println(a.getAge());
    }
}
class Mog{
    private int age;
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

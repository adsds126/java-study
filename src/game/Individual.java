package game;

abstract class Individual {
    abstract public void intro();
    private String name;
    private int level;
    private String introduce;//공통된 개체 인터페이스 구현
    private int power;
    Individual(String name, int level, String introduce, int power){
        this.name = name;
        this.level = level;
        this.introduce = introduce;
        this.power = power;
    }
}
class User extends Individual{
   private String job;
   public void intro(){
       System.out.println("taess두두등장");
   }
   User(String name1, int level1, String introduce1, int power1){
       super(name1, level1, introduce1, power1);
    }
    public void setJob(String job){
       this.job = job;
    }
    public String getJob(){
       return job;
    }

}
class Monster extends Individual{
    private String type;
    public void intro(){
        System.out.println("크아아아");
    }
    Monster(String name2, int level2, String introduce2, int power2) {
        super(name2, level2, introduce2, power2);
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }

}
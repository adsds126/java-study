package game;

public class main {
    public static void main(String[] args) {
        String name1 = "taess";
        int level1 = 50;
        String introduce1 ="여포";
        int power1 = 10000;
        User a = new User(name1, level1, introduce1, power1);
        a.setJob("직업:worrier");

        String name2 = "드래군";
        int level2 = 30;
        String introduce2 ="좆밥";
        int power2 = 10000;
        Monster m = new Monster(name2, level2, introduce2, power2);
        m.setType("종족:dragon");


        System.out.println("taess vs 드래군");
        System.out.println("---------용사등장--------");
        System.out.print("이름"+name1+", 레벨"+level1+", 소개"+introduce1+", 전투력"+power1);
        System.out.println();
        System.out.println(a.getJob());
        System.out.println("---------몬스터등장--------");
        System.out.print("이름"+name2+", 레벨"+level2+", 소개"+introduce2+", 전투력"+power2);
        System.out.println(m.getType());
        System.out.println("---------전투시작--------");


    }
}

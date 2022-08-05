package game;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String name1 = "taess";
        int level1 = 50;
        String introduce1 ="강함";
        User a = new User(name1, level1, introduce1);
        a.setJob("직업:worrier");

        String name2 = "드래군";
        int level2 = 30;
        String introduce2 ="약함";
        Monster m = new Monster(name2, level2, introduce2);
        m.setType("종족:dragon");

        System.out.println(name1+"vs"+name2);
        System.out.print("전투력을 입력하세요 "+name1+"의 전투력>");
        Scanner in = new Scanner(System.in);
        int power1 = in.nextInt();
        System.out.print("전투력을 입력하세요 "+name2+"의 전투력>");
        int power2 = in.nextInt();

        System.out.println("---------용사등장--------");
        System.out.println("이름:"+name1+", 레벨:"+level1+", 소개:"+introduce1+", 전투력:"+power1);
        System.out.println(a.getJob());
        System.out.println("---------몬스터등장--------");
        System.out.println("이름:"+name2+", 레벨:"+level2+", 소개:"+introduce2+", 전투력:"+power2);
        System.out.println(m.getType());
        System.out.println("---------전투시작--------");
        if(power1 > power2){
            System.out.println(name1+"승리");
        }else if(power1 < power2) {
                System.out.println(name2+"승리");
    }else{
            System.out.println("비겼습니다.");
        }
        }
}

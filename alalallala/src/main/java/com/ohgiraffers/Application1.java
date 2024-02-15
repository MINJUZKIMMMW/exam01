import java.awt.*;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
//

        Robot robot1 = new Robot();
        Black black1 = new Black();
        White white1 = new White();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("시작");
            System.out.println("1.흑인로봇 걷게하기");
            System.out.println("2.흑인로봇 웃게하기");
            System.out.println("3.흑인로봇 놀래키기");
            System.out.println("4.백인로봇 걷게하기");
            System.out.println("5.백인로봇 웃게하기");
            System.out.println("6.백인로봇 놀래키기");
            System.out.println("7.프로그램 종료하기");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    black1.walk();
                    break;
                case 2:
                    black1.smile();
                    break;
                case 3:
                    black1.scream();
                    break;
                case 4:
                    white1.walk();
                    break;
                case 5:
                    white1.smile();
                    break;
                case 6:
                    white1.scream();
                    break;
                case 7:
                    System.out.println("프로그램을 종료합니다.");
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");


            }

            if (no == 7) {
                break;

            }
        }
    }
}


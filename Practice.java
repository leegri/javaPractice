package calculator;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;
        char yes ;

        do{
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 수를 입력하세요 : ");
        num1 = sc.nextInt();

        System.out.print("연산자를 입력하세요 ex)+,-,*,/ : ");
        String str = sc.next();

        System.out.print("두번째 수를 입력하세요 : ");
        num2 = sc.nextInt();

            switch (str) {
                case "+":
                    num3 = num1 + num2;
                    System.out.printf("%f + %f = %f 입니다 .", num1, num2, num1 + num2);
                    break;
                case "-":
                    num3 = num1 - num2;
                    System.out.printf("%f - %f = %f 입니다 .", num1, num2, num1 - num2);
                    break;
                case "*":
                    num3 = num1 + num2;
                    System.out.printf("%f X %f = %f 입니다 .", num1, num2, num1 * num2);
                    break;
                case "/":
                    num3 = num1 / num2;
                    System.out.printf("%f / %f = %f 입니다 .", num1, num2, num1 / num2);
                    break;
                default:
                    System.out.println("유효하지않습니다");
            }
        System.out.println("계속하시겠습니까? y/n : ");
            yes = sc.next().charAt(0);
            if (yes == 'n'|| yes =='N'){
                System.out.println("종료");
            }



        }while(yes == 'y' || yes == 'Y');

    }
}








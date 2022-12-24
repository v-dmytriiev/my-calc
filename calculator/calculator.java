package Calculator;

import java.util.Scanner;

public class calculator {
    public static void answer(int a) {
        System.out.println("Answer : " + a);
    }

    public static void numbers() {
        System.out.println("Write numbers with you want to calc : ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        numbers();
        int num = scanner.nextInt();
        numbers();
        int num1 = scanner.nextInt();

        System.out.println("What to do?: +  ,  -  ,  *  ,  /  . ");
        String action = scanner.nextLine();
        action = scanner.nextLine();
        int res;
        switch (action) {
            case "+":
                res = num + num1;
                System.out.println(num + "+" + num1 + "=" + res);
                answer(res);
                break;
            case "-":
                res = num - num1;
                System.out.println(num + "-" + num1 + "=" + res);
                answer(res);
                break;

            case "*":
                res = num * num1;
                System.out.println(num + "*" + num1 + "=" + res);
                answer(res);
                break;

            case "/":
                if (num1 == 0) {
                    System.out.println("Error");
                } else {
                    res = num / num1;
                    System.out.println(num + "/" + num1 + "=" + res);
                    answer(res);
                    break;
                }

            default :
                    System.out.println("Wrong parameter!");
        }
    }
}





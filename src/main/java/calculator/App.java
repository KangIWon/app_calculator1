package calculator;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String answer;
        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: "); //+, -, *, /
            char operator = sc.next().charAt(0);

            int result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            answer = sc.nextLine();
        } while (answer != "exit");


    }
}

package calculator;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        String answer;
        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: "); //+, -, *, /
            char operator = sc.next().charAt(0);

            int result = calculator.calculate(num1, num2, operator);
            calculator.getResults().add(result); //결과값 추가 getResults로 바꿈

            System.out.println(calculator.getResults().toString()); //출력 getResults로 바꿈


            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            answer = sc.next();
            if (answer.equals("remove")) {
                calculator.removeResult(0); //삭제 removeResult로 바꿈
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하였습니다");
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            answer = sc.next();
            if (answer.equals("inquiry")) {
                calculator.inquiryResults(); // inquiryResults로 출력
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            answer = sc.next();
            if (answer.equals("exit")) {
                System.out.println("반복을 종료합니다.");
                break;
            }
        } while (answer != "exit");


    }
}

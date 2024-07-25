package calculator;
import java.util.Scanner;
import java.util.ArrayList;
public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
//        calculator.calculate();

        Scanner sc = new Scanner(System.in);

//        ArrayList<Double> intList = new ArrayList<Double>(); // 선언 및 생성
        int cnt = 0; //카운트

        String answer;
        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: "); //+, -, *, /
            char operator = sc.next().charAt(0);

            int result = calculator.calculate(num1, num2, operator);


            System.out.println(calculator.results.toString()); //출력


            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            answer = sc.next();
            if (answer.equals("remove")) {
                calculator.results.remove(0); //삭제
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하였습니다");
                System.out.println(calculator.results.toString()); //확인 출력
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            answer = sc.next();
            if (answer.equals("inquiry")) {
                for (int number:calculator.results){
                    System.out.print(number + " ");
                }
                System.out.println(calculator.results.toString()); //출력
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

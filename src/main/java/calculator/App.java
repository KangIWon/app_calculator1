package calculator;
import java.util.Scanner;
import java.util.ArrayList;
public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
//        calculator.calculate();

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 및 생성
        int cnt = 0; //카운트

        String answer;
        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: "); //+, -, *, /
            char operator = sc.next().charAt(0);
//
//            int result = 0;
//            switch (operator) {
//                case '+':
//                    result = num1 + num2;
//                    break;
//                case '-':
//                    result = num1 - num2;
//                    break;
//                case '*':
//                    result = num1 * num2;
//                    break;
//                case '/':
//                    result = num1 / num2;
//                    break;
//                default:
//                    // 오류 메시지 출력
//                    System.out.println("기호 입력이 잘못됬습니다.");
//                    break;
//            }
//            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
//            System.out.println("결과: " + result);
//
//
//            intList.add(result); //결과값 추가

            System.out.println(intList.toString()); //출력


            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            answer = sc.next();
            if (answer.equals("remove")) {
                intList.remove(0); //삭제
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하였습니다");
                System.out.println(intList.toString()); //확인 출력
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            answer = sc.next();
            if (answer.equals("inquiry")) {
                for (int number:intList){
                    System.out.print(number + " ");
                }
                System.out.println(intList.toString()); //출력
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

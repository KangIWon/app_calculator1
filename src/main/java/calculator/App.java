package calculator;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 산술 연산
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(new ArrayList<>());
        // 원 넓이 연산
        CircleCalculator circleCalculator = new CircleCalculator(new ArrayList<>());
        Scanner sc = new Scanner(System.in);

        String answer;
        do {
            /* 사칙연산을 진행할지 원의 너비를 구할지 선택 구현 */
            System.out.print("1. 사칙 연산을 진행하시겠습니까? / 2. 원의 너비를 구하시겠습니까? :");
            int num = sc.nextInt();
            if (num==1) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: "); //+, -, *, /
                char operator = sc.next().charAt(0);
                // double 타입으로 바꿔주고 calculator->arithmeticCalculator로 바꿔줌
                double result = arithmeticCalculator.calculate(num1, num2, operator);
                arithmeticCalculator.getResults().add(result); //결과값 추가 getResults로 바꿈

                System.out.println(arithmeticCalculator.getResults().toString()); //출력 getResults로 바꿈


                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                answer = sc.next();
                if (answer.equals("remove")) {
                    arithmeticCalculator.removeResult(0); //삭제 removeResult로 바꿈
                    System.out.println("가장 먼저 저장된 연산 결과를 삭제하였습니다");
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                answer = sc.next();
                if (answer.equals("inquiry")) {
                    arithmeticCalculator.inquiryResults(); // inquiryResults로 출력
                }
            }
            // calculator->circleCalculator 로 바꿔줌
            // calculateCircleArea->calculate
            // getcircleResults->getResults
            // inquirycircleResults->inquiryResults
            else if (num==2) {
                /* 원의 넓이를 구하는 경우 반지름을 입력받아 원의 넓이를 구한 후 출력*/
                System.out.print("반지름을 입력하세요: ");
                int r = sc.nextInt();
                double circleResults = circleCalculator.calculate(r);
                /* 원의 넓이 저장 */
                circleCalculator.getResults().add(circleResults); //결과값 추가

                System.out.println(circleCalculator.getResults().toString()); //출력

                /* 저장된 원의 넓이 값들 바로 전체 조회 */
                System.out.println("저장된 원의 넓이를 조회하시겠습니까? (inquiry 입력 시 조회)");
                answer = sc.next();
                if (answer.equals("inquiry")) {
                    circleCalculator.inquiryResults(); // inquiryResults 출력
                }
            }
            else {
                System.out.println("정확한 숫자를 선택해주세요. (1과 2 중에 하나를 선택해주세요.)");
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

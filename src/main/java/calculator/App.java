package calculator;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intArray = new int[10];    // 정수 배열
        int cnt = 0; //카운트

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
                default:
                    // 오류 메시지 출력
                    System.out.println("기호 입력이 잘못됬습니다.");
                    break;
            }
            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            System.out.println("결과: " + result);

            if (cnt<=9){
                intArray[cnt] = result;
                cnt++;
            } else if (cnt>9) {
                for (int i=0;i<9;i++){
                    intArray[i] = intArray[i+1];
                }
                intArray[9]= result;
            }

            for (int i=0;i<9;i++){
                System.out.println(intArray[i]);
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

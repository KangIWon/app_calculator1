package calculator;
import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> results = new ArrayList<>();
    double result = 0;
    public int calculate(int num1, int num2, char operator) {

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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new ArithmeticException("나눗셈에서 분모에 0이 입력될 수 없습니다.");
                    //ArithmeticException는 나눗셈에서 분모에 0이 입력될 수 없음을 나타내는 예외처리
                }
                break;
            default:
                // 오류 메시지 출력
                System.out.println("기호 입력이 잘못됬습니다.");
                //throw new Exception("기호 입력이 잘못됬습니다.");
                break;
        }

        /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
        System.out.println("결과: " + result);


        results.add(result); //결과값 추가

        System.out.println(results.toString()); //출력

        return result;
        }
    }

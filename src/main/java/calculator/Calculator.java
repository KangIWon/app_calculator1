package calculator;
import java.util.ArrayList;

public class Calculator {

    double result = 0;
    public double calculate(double num1, double num2, char operator) {
        ArrayList<Double> intList = new ArrayList<>(); // 선언 및 생성

        double result = 0;
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
                    //throw new Exception("나눗셈에서 분모에 0이 입력될 수 없습니다.");
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


        intList.add(result); //결과값 추가

        System.out.println(intList.toString()); //출력

        return result;
    }
}

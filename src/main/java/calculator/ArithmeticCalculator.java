package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator { // 상속 받음
    public ArithmeticCalculator(ArrayList<Double> results) { // results를 super로 생성자 호출함
        super(results);
    }

    @Override
    void inquiryResults() {
        for (Double number: getResults()){
            System.out.println("연산 결과 : "+number + " "); // 줄바꿈이 있게 나올 수 있도록 함
        }
        System.out.println(getResults().toString()); // 연산 결과 results에 잘 들어가있는지 한 번 더 확인
    }

    public double calculate(int num1, int num2, char operator) { // return 값이 있어야함

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

        return result;
    }

}

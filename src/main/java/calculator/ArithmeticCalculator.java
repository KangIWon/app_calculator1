package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {
    // 선언
    private AddOperator addOperator;
    private SubtractOperator subtractOperator;
    private MultiplyOperator multiplyOperator;
    private DivideOperator divideOperator;
    private ModOperator modOperator;

    // 상속 받음
    public ArithmeticCalculator(ArrayList<Double> results, AddOperator addOperator, SubtractOperator subtractOperator,
                                MultiplyOperator multiplyOperator, DivideOperator divideOperator,
                                ModOperator modOperator) {
        // 연산자 넣음
        // results를 super로 생성자 호출함
        super(results);
        // super 먼저 선언하고 this를 해야함
        this.addOperator = addOperator;
        this.subtractOperator = subtractOperator;
        this.multiplyOperator = multiplyOperator;
        this.divideOperator = divideOperator;
        this.modOperator = modOperator;
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

        // result 값 각각 받기
        switch (operator) {
            case '+':
                result = addOperator.operate(num1, num2);
                break;
            case '-':
                result = subtractOperator.operate(num1, num2);
                break;
            case '*':
                result = multiplyOperator.operate(num1, num2);
                break;
            case '/':
                if (num2 != 0) {
                    result = divideOperator.operate(num1, num2);
                } else {
                    throw new ArithmeticException("나눗셈에서 분모에 0이 입력될 수 없습니다.");
                    //ArithmeticException는 나눗셈에서 분모에 0이 입력될 수 없음을 나타내는 예외처리
                }
                break;
            // 나머지 연산
            case '%':
                result = modOperator.operate(num1, num2);
                break;
            default:
                // 오류 메시지 출력
                System.out.println("기호 입력이 잘못됬습니다.");
                throw new UnsupportedOperationException("기호 입력이 잘못됬습니다.");
                //UnsupportedOperationException
        }

        return result;
    }

}

package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator {
    public CircleCalculator(ArrayList<Double> results) { // results를 super로 생성자 호출함
        super(results);
    }

    @Override
    void inquiryResults() {
        /* 구현 */
        for (double n: getResults()){
            System.out.println("원 넓이 계산 결과 : "+ n); // 줄바꿈이 있게 나올 수 있도록 함
            // 줄바꿈을 하기 때문에 원래 뒤에 붙어있던 ""부분을 지움
        }
        System.out.println(getResults().toString()); // 연산 결과 circleResults에 잘 들어가있는지 한 번 더 확인
    }
    public double calculate(int r) {
        return pi * r * r;
    }
}

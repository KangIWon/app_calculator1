package calculator;
import java.util.ArrayList;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드가 생성자를 통해 초기화 되도록 변경 */
    private ArrayList<Integer> results;

    /* static, final 활용 */
    private static final double pi = 3.14; // 파이를 상수로 선언 파이값은 바뀌지 않으니까.
    /* 원의 넓이 결과를 저장하는 컬렉션 타입의 필드 선언 및 생성 */
    private ArrayList<Double> circleResults; // 원 넓이 결과 저장
    /* 생성자 수정 */
    public Calculator(ArrayList<Integer> results, ArrayList<Double> circleResults) {
        this.results = results;
        this.circleResults = circleResults;
        // 생성자를 선언하는데 매개변수명과 객체의 필드명이 동일하므로 this를 써줌.
    }

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

        return result;
        }
    public double calculateCircleArea(int r) { // 반지름 r로 설정
        /* 원의 넓이 계산 구현 */
        return pi * r * r;
    }
    /* 원의 넓이 저장 필드 Getter, Setter, 조회 메서드 구현 */
    public ArrayList<Double> getcircleResults() { // getcircleResults circleResults값 가져오기
        return circleResults;
    }

    public void setcircleResults(ArrayList<Double> circleResults) { // setcircleResults circleResults값 수정하기
        this.circleResults = circleResults;
    }

    public void inquirycircleResults() { // inquirycircleResults 결과 조회
        /* 구현 */
        for (double n: getcircleResults()){
            System.out.println("원 넓이 계산 결과 : "+ n + " "); // 줄바꿈이 있게 나올 수 있도록 함
        }
        System.out.println(getcircleResults().toString()); // 연산 결과 circleResults에 잘 들어가있는지 한 번 더 확인
    }

    /* Getter 메서드 구현 */
    /* Setter 메서드 구현 */
    public ArrayList<Integer> getResults() { // getResults로 results값 가져오기
        return results;
    }

    public void setResults(ArrayList<Integer> results) { // setResults로 results값 수정하기
        this.results = results;
    }

    public void removeResult(int idx) { // removeResult로 App에서 remove 삭제 연산하는 곳
        this.results.remove(idx);
    }

    public void inquiryResults() { // inquiryResults로 결과 조회
        /* 구현 */
        for (int number: getResults()){
            System.out.println("연산 결과 : "+number + " "); // 줄바꿈이 있게 나올 수 있도록 함
        }
        System.out.println(getResults().toString()); // 연산 결과 results에 잘 들어가있는지 한 번 더 확인
    }
}
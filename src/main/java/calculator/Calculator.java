package calculator;
import java.util.ArrayList;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정*/
    private ArrayList<Integer> results = new ArrayList<>(); //private로 수정

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
}
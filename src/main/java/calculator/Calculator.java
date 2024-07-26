package calculator;
import java.util.ArrayList;

public abstract class Calculator { // 추상 클래스로 만듬
    /* 연산 결과를 저장하는 컬렉션 타입 필드가 생성자를 통해 초기화 되도록 변경 */
    private ArrayList<Double> results; // Double타입으로 변환

    /* static, final 활용 */
    public static final double pi = 3.14; // 파이를 상수로 선언 파이값은 바뀌지 않으니까. //private로 하니까 참조가 안되서 public으로 바꿈
    /* 원의 넓이 결과를 저장하는 컬렉션 타입의 필드 선언 및 생성 */
//    private ArrayList<Double> circleResults; // 원 넓이 결과 저장 // 결과값 나오는 걸 하나로 씀
    /* 생성자 수정 */
    public Calculator(ArrayList<Double> results) { // 결과값을 하나에 저장 // Double타입으로 변환
        this.results = results;
//        this.circleResults = circleResults;
        // 생성자를 선언하는데 매개변수명과 객체의 필드명이 동일하므로 this를 써줌.
    }
// 산술 연산이랑 원 넓이 연산을 각각의 클래스에서 선언해주면 될 듯

    /* Getter 메서드 구현 */
    /* Setter 메서드 구현 */
    public ArrayList<Double> getResults() { // getResults로 results값 가져오기
        return results;
    }

    public void setResults(ArrayList<Double> results) { // setResults로 results값 수정하기
        this.results = results;
    }

    public void removeResult(int idx) { // removeResult로 App에서 remove 삭제 연산하는 곳
        this.results.remove(idx);
    }

    abstract void inquiryResults(); // 추상 메서드 선언 // 이거는 산술 결과랑, 원 넓이 결과
}
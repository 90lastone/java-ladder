package domain;

public class Result {
    private String result;

    public Result(String result) {
        if (result.length() > 5) {
            throw new IllegalArgumentException("결과는 최대 5글자까지만 입력 가능합니다.");
        }
        this.result = result;
    }

    public String getResult() {
        return this.result;
    }
}

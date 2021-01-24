package domain;

public class Name {
    private String name;

    public Name() {

    }

    public Name(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("최대 5글자까지만 입력 가능합니다.");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

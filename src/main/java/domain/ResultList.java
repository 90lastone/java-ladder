package domain;

import java.util.Collections;
import java.util.List;

public class ResultList {
    private List<Person> resultList;

    public ResultList(String results, int personListSize) {
        this.resultList = Util.split(results);
        if (this.resultList.size() != personListSize) {
            throw new IllegalArgumentException("실행결과가 참여자 수와 일치하지 않습니다.");
        }
    }

    public List<Person> getList() {
        return Collections.unmodifiableList(this.resultList);
    }

    public int size() {
        return resultList.size();
    }
}

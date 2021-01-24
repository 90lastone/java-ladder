import domain.PersonList;
import domain.ResultList;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ResultListTest {
    @Test
    void 참여자수_결과수_입력_일치여부_success() {
        PersonList personList = new PersonList("pobi,honux,crong,jk");
        ResultList resultList = new ResultList("꽝,5000,꽝,3000", personList.size());
        assertThat(personList.size()).isEqualTo(4);
        assertThat(resultList.size()).isEqualTo(4);
    }

    @Test
    void 참여자수_결과수_입력_일치여부_fail() {
        assertThatThrownBy(() -> {
            PersonList personList = new PersonList("pobi,honux,crong,jk");
            ResultList resultList = new ResultList("꽝,5000,꽝", personList.size());
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("실행결과가 참여자 수와 일치하지 않습니다.");
    }
}

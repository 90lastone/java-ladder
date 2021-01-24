import domain.NameList;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class NameListTest {
    @Test
    void split() {
        NameList personList = new NameList("pobi,honux,crong,jk");

        assertThat(personList.size()).isEqualTo(4);
    }
}

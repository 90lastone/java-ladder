import domain.Name;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {
    @Test
    void NameTest() {
        assertThatThrownBy(() -> {
            new Name("test12");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("최대 5글자까지만 입력 가능합니다.");
    }
}

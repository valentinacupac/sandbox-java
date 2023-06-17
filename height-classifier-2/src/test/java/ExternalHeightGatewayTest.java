import com.optivem.sandbox.adapters.ExternalHeightGateway;
import com.optivem.sandbox.core.Constants;
import com.optivem.sandbox.core.Height;
import com.optivem.sandbox.core.HeightGateway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;

import static org.assertj.core.api.Assertions.assertThat;

public class ExternalHeightGatewayTest {

    private HeightGateway heightGateway;

    @BeforeEach
    void setup() {
        this.heightGateway = new ExternalHeightGateway();
    }

    @Test
    void should_return_height_for_existent_ssn() {
        // NOTE: In real applications, we wouldn't be hardcoding values for third party systems
        // instead we would be using techniques such as contract testing
        var ssn = "247582352";
        var height = heightGateway.getHeight(ssn);
        var expectedHeight = Height.ofInches(BigDecimal.valueOf(40));
        assertThat(height).isEqualTo(expectedHeight);
    }
}

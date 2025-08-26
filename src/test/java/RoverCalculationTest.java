import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RoverCalculationTest {

    @Test
    void it_should_calculate_initial_position() {
        RoverCalculation roverCalculation = new RoverCalculation();
        var response = roverCalculation.calculate(null);
        assertThat(response).isEqualTo("0:0:N");
    }

}

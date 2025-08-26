import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RoverCalculationTest {

    @Test
    void it_should_thrown_error_for_null_command() {
        RoverCalculation roverCalculation = new RoverCalculation();
        assertThrows(
                IllegalArgumentException.class,
                () -> roverCalculation.calculate(null),
                "Command must not be a null"
        );
    }

    @Test
    void it_should_thrown_error_for_unexpected_command() {
        RoverCalculation roverCalculation = new RoverCalculation();
        assertThrows(
                IllegalArgumentException.class,
                () -> roverCalculation.calculate("SGT"),
                "Direction must be L or R!"
        );
    }

    @Test
    void it_should_rotate_left_for_initial_position_should_be_west() {
        RoverCalculation roverCalculation = new RoverCalculation();
        var response = roverCalculation.calculate("L");
        assertThat(response).isEqualTo("0:0:W");
    }

    @Test
    void it_should_rotate_right_for_initial_position_should_be_east() {
        RoverCalculation roverCalculation = new RoverCalculation();
        var response = roverCalculation.calculate("R");
        assertThat(response).isEqualTo("0:0:E");
    }

    @Test
    void it_should_move_for_initial_position_should_be_north() {
        RoverCalculation roverCalculation = new RoverCalculation();
        var response = roverCalculation.calculate("M");
        assertThat(response).isEqualTo("0:1:N");
    }

}

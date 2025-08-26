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
                "Command must be L or R or M!"
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

    @Test
    void it_should_move_east_when_command_is_Right_and_Move() {
        RoverCalculation roverCalculation = new RoverCalculation();
        var response = roverCalculation.calculate("RM");
        assertThat(response).isEqualTo("1:0:E");
    }


    @Test
    void it_should_result_in_2_1_W_when_command_is_Right_Move_Move_Left_Move_Left() {
        RoverCalculation roverCalculation = new RoverCalculation();
        var response = roverCalculation.calculate("RMMLML");
        assertThat(response).isEqualTo("2:1:W");
    }

    @Test
    void it_should_return_to_north_when_command_is_Left_Left_Left_Left() {
        RoverCalculation roverCalculation = new RoverCalculation();
        var response = roverCalculation.calculate("LLLL");
        assertThat(response).isEqualTo("0:0:N");
    }
}

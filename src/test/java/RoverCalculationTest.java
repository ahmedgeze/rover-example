import models.RoverCalculationRequest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RoverCalculationTest {

    @Test
    void it_should_calculate_initial_position() {
        RoverCalculation roverCalculation = new RoverCalculation();
        var request = new RoverCalculationRequest();
        request.setDirections("");
        var response = roverCalculation.calculate(request);
        assertThat(response).isEqualTo("0:0:N");
    }

    @Test
    void it_should_calculate_for_left_commant_for_initial_position() {
        RoverCalculation roverCalculation = new RoverCalculation();
        var request = new RoverCalculationRequest();
        request.setDirections("L");
        var response = roverCalculation.calculate(request);
        assertThat(response).isEqualTo("0:0:W");
    }

    @Test
    void it_should_calculate_for_right_commant_for_initial_position() {
        RoverCalculation roverCalculation = new RoverCalculation();
        var request = new RoverCalculationRequest();
        request.setDirections("R");
        var response = roverCalculation.calculate(request);
        assertThat(response).isEqualTo("0:0:E");
    }


    @Test
    void it_should_calculate_for_multiple_right_commant_for_initial_position() {
        RoverCalculation roverCalculation = new RoverCalculation();
        var request = new RoverCalculationRequest();
        request.setDirections("RRRR");
        var response = roverCalculation.calculate(request);
        assertThat(response).isEqualTo("0:0:N");
    }


    @Test
    void it_should_calculate_correct_for_happy_path() {
        RoverCalculation roverCalculation = new RoverCalculation();
        var request = new RoverCalculationRequest();
        request.setDirections("RMMLML");
        var response = roverCalculation.calculate(request);
        assertThat(response).isEqualTo("2:1:W");
    }

/*
    N: Up
    S: Down
    E: Right
    W: Left


 */


}

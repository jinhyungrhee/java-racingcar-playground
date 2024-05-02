import org.junit.jupiter.api.Test;
import racingcar.Car;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class RacingcarTest {

    @Test
    public void 각_자동차는_스스로_움직일_수_있는지_없는지_판단할_수_있다() {
        Car car = new Car("ford");

        Random random = new Random();
        int number = random.nextInt(9) + 1;

        System.out.println(number);
        boolean actual = car.canMove(number);
        if (number < 4) assertThat(actual).isFalse();
        if (number >= 4) assertThat(actual).isTrue();
    }


}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.Car;
import racingcar.Race;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class RacingcarTest {

    public static Car ford;
    public static Car lamborghini;
    public static Car ferrari;
    public static Race race;

    @BeforeEach
    void setUpCars() {
        ford = new Car("ford");
        lamborghini = new Car("lamborghini");
        // ferrari = new Car("ferrari");
    }

    @BeforeEach
    void setUpRace() {
        // List<Car> cars = Arrays.asList(ford, lamborghini, ferrari);
        List<Car> cars = Arrays.asList(ford, lamborghini);
        race = new Race(5, cars);
    }

    @Test
    public void 각_자동차는_스스로_움직일_수_있는지_없는지_판단할_수_있다() {

        Random random = new Random();
        int number = random.nextInt(9) + 1;

        System.out.println(number);
        boolean actual = ford.canMove(number);
        if (number < 4) assertThat(actual).isFalse();
        if (number >= 4) assertThat(actual).isTrue();
    }

    @Test
    public void 각_자동차는_매_라운드가_지나면_위치값을_변경시킨다() {

        assertThat(ford.getLocation()).isEqualTo(0);

        ford.move();

        Integer actual = ford.getNumber();
        if (ford.canMove(actual)) {
            assertThat(ford.getLocation()).isEqualTo(1);
        }
        if (!ford.canMove(actual)) {
            assertThat(ford.getLocation()).isEqualTo(0);
        }

        System.out.println(ford.getName());
        System.out.println(ford.getLocation());
        System.out.println(ford.getNumber());

    }

    @Test
    public void 매_라운드_마다_각_자동차의_이름과_위치를_출력한다() {
        // 라운드 진행
        ford.move();
        ford.showMessage();

        // 실행결과 출력
        Integer actual = ford.getNumber();
        System.out.println(actual);
        if (ford.canMove(actual)) {
            assertThat(ford.getMessage()).isEqualTo("ford : -");
        }
        if (!ford.canMove(actual)) {
            assertThat(ford.getMessage()).isEqualTo("ford : ");
        }

    }

    @Test
    public void race는_사용자로부터_시도휫수와_참가자들을_입력받아_Car들에게_메시지를_보내_결과를_출력한다() {
        race.start();
    }

    @Test
    public void race는_car들에게_메시지를_보내_움직이게_한_뒤_최종_결과를_출력한다() {
        race.start();
        race.getResult();

        race.getWinners().stream().forEach(elem -> System.out.println(elem.getName()));

        if (ford.getLocation() > lamborghini.getLocation()) {
            assertThat(race.getWinners().stream().findFirst().get().getName()).isEqualTo("ford");
        }

        if (lamborghini.getLocation() > ford.getLocation()) {
            assertThat(race.getWinners().stream().findFirst().get().getName()).isEqualTo("lamborghini");
        }

        if (ford.getLocation() == lamborghini.getLocation()) {
            assertThat(race.getWinners().stream().findFirst().get().getName()).isEqualTo("ford\nlamborghini");
        }

    }


}

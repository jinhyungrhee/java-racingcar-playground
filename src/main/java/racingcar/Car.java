package racingcar;

import java.util.Random;

public class Car {

    private String name;
    private Integer location;

    public Car(String name) {
        this.name = name;
        this.location = 0;
    }

    public void move() {
        Random random = new Random();
        int number = random.nextInt(9 ) + 1;

    }

    public Boolean canMove(int number) {
        return number >= 4;
    }
}

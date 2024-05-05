package racingcar;

import java.util.Random;

public class Car {

    private String name;
    private Integer location;
    private Integer number;
    private String message;

    public Car(String name) {
        this.name = name;
        this.location = 0;
    }

    public String getName() {
        return name;
    }

    public Integer getLocation() {
        return location;
    }

    public Integer getNumber() {
        return number;
    }

    public String getMessage() {
        return message;
    }

    // methods

    public void move() {

        Random random = new Random();
        int number = random.nextInt(9 ) + 1;
        this.number = number;
        if (canMove(number)) this.location++;
        // showMessage();

    }

    public Boolean canMove(int number) {
        return number >= 4;
    }

    public void showMessage() {
        String locationString = "";
        for (int i = 0; i < this.location; i++) {
            locationString += "-";
        }

        this.message = this.name + " : " + locationString;
        System.out.println(this.message);
    }
}

package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class racingcarApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String input = scanner.nextLine();
        String[] names = input.split(",");
        List<Car> participants = setCars(names);


        System.out.println("시도할 횟수는 몇회인가요?");
        int round = scanner.nextInt();

        Race race = new Race(round, participants);

        race.start();
        race.getResult();

    }

    public static List<Car> setCars(String[] names) {
        List<Car> cars = new ArrayList<>();
        for (String name : names) {
            cars.add(new Car(name));
        }
        return cars;
    }
}

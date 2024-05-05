package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private int round;
    private List<Car> participants;
    private List<Car> winners;
    private int farthestLocation;

    public Race(int round, List<Car> participants) {
        this.round = round;
        this.participants = participants;
        this.winners = new ArrayList<>();
        this.farthestLocation = 0;
    }

    public List<Car> getWinners() {
        return winners;
    }

    // methods
    public void start() {
        for (int i = 0; i < round; i++) {
            procced();
        }
    }

    public void procced() {
        for (int i = 0; i < this.participants.size(); i++) {
            this.participants.get(i).move();
            this.participants.get(i).showMessage();
        }
        System.out.println();
    }

    public void getResult() {
        int winnerLocation = getfarthestLocation(participants);
        for (int i = 0; i < this.participants.size(); i++) {
            findWinner(participants.get(i), winnerLocation);
        }

        String winners = "";
        for (int i = 0; i < this.winners.size(); i++) {
            winners += this.winners.get(i).getName() + " ";
        }

        System.out.println(winners + "가 최종 우승했습니다.");
    }

    public Integer getfarthestLocation(List<Car> cars) {
        for (int i = 0; i <  cars.size() ; i++) {
            findFarthestLocation(cars.get(i).getLocation());
        }
        System.out.println("FARTHEST LOCATION: " + this.farthestLocation);
        return this.farthestLocation;
    }

    public void findFarthestLocation(Integer location) {
        if (this.farthestLocation <= location) {
            this.farthestLocation = location;
        }
    }

    public void findWinner(Car car, int winnerLocation) {
        if (car.getLocation() == winnerLocation) {
            winners.add(car);
        }

    }

}

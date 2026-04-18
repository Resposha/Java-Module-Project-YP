public class Race {
    String winner = ""; // победитель
    int distance = 0; // дистанция

    public void chooseWinner(Car car) {
        int currentDistance = 24 * car.velocity;

        if (distance < currentDistance) {
            distance = currentDistance;
            winner = car.name;
        } else {
            if (distance == currentDistance) {
                winner = winner + ", " + car.name;
            }
        }
    }
}

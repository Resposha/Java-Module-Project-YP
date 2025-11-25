import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        System.out.println("Добро пожаловать на гонку '24 часа Ле-Мана'!");
        System.out.println("Вы можете предложить к участию троих претендентов");
        System.out.println("Для этого поочередно введите название и скорость каждого автомобиля");

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название автомобиля №" + (i + 1));
            String name = scanner.next();

            System.out.println("Введите скорость автомобиля №" + (i + 1) + " (допустимые значения: от 0 до 250 км/ч)");
            while (true) {
                if (!scanner.hasNextInt()) {
                    System.out.println("Недопустимое значение. Введите скорость от 0 до 250 км/ч");
                    scanner.next();
                } else {
                    break;
                }
            }
            int velocity = scanner.nextInt();
            while (true) {
                if (velocity > 0 && velocity <= 250) {
                    break;
                } else {
                    System.out.println("Недопустимое значение. Введите скорость от 0 до 250 км/ч");
                    velocity = scanner.nextInt();
                }
            }

            Car car = new Car(name, velocity);
            System.out.println("Участник №" + (i + 1) + " с названием '" + name + "' и скоростью " + velocity + " км/ч успешно зарегистрирован");
            race.chooseWinner(car);
        }

        scanner.close();

        System.out.println("Все претенденты прошли регистрацию. Гонка начинается!");
        System.out.println("Побеждает автомобиль c названием '" + race.winner + "', преодолевший дистанцию в " + race.distance + " км");
        System.out.println("Поздравляем победителя!");
    }
}
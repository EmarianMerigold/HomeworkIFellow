import java.util.Scanner;

public class ClockAngle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Задать часы
        System.out.print("Введите кол-во часов: ");
        int hours = scanner.nextInt();
        if ( hours < 0 || hours > 23){
            System.err.println("Значение кол-ва часов допускается в промежутке от 0 до 23");
            return;
        }

        // Задать минуты
        System.out.print("Введите кол-во минут: ");
        int minutes = scanner.nextInt();
        if ( minutes < 0 || minutes > 59){
            System.err.println("Значение кол-ва минут допускается в промежутке от 0 до 59");
            return;
        }

        // Вызов метода вычисления угла и вывод результата
        double angle = calculateAngle(hours, minutes);
        System.out.println("Угол между часовой и минутной стрелками равен: " + angle + "°");
    }

    public static double calculateAngle(int hours, int minutes) {

        // Преобразование часов в 12-часовой формат
        hours = hours % 12;

        // Вычисление угла минутной стрелки. Одна минута равна 6°
        double angleMinutes = 6 * minutes;

        // Вычисление угла часовой стрелки. Однин час равен 30°. Также угол часовой стрелки зависит от минутной
        // Часовая стрелка проходит 0.5° в минуту
        double angleHours = 30 * hours + 0.5 * minutes;

        // Рассчет разницы между углами стрелок
        double angleBetweenHands = Math.abs(angleHours - angleMinutes);

        // Получение наименьшего угла
        if (angleBetweenHands > 180) {
            angleBetweenHands = 360 - angleBetweenHands;
        }

        return angleBetweenHands;
    }

}

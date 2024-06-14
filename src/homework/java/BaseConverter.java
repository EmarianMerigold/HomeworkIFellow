import java.util.Scanner;

class BaseConverter {

    // Метод для конвертации градусов Цельсия в Кельвины
    public double toKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Метод для конвертации градусов Цельсия в Фаренгейты
    public double toFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Метод конвертации. Перевод принимаемой строки в нижний регистр для более универсального ввода
    public double convert(double celsius, String targetUnit) {
        switch (targetUnit.toLowerCase()) {
            case "кельвин":
                return toKelvin(celsius);
            case "фаренгейт":
                return toFahrenheit(celsius);
            default:
                throw new IllegalArgumentException("Данное значение не предусмотрено: " + targetUnit);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод градусов Цельсия
        System.out.print("Введите температуру в Цельсиях: ");
        double celsius = scanner.nextDouble();

        // Ввод типа конвертации
        System.out.print("Выберите единицу измерения для конвертации (Кельвин/Фаренгейт): ");
        String targetUnit = scanner.next();

        // Создание объекта конвертера
        BaseConverter converter = new BaseConverter();

        // Реализация конвертации и вывод результата
        try {
            double result = converter.convert(celsius, targetUnit);
            System.out.print("Температура в " + targetUnit + "ах: " + result);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
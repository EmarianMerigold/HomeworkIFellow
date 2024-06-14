import java.util.Arrays;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args){

        // Задать размер массива
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        if (arraySize <= 0 || arraySize > 99 ) {
            System.err.println("Размер массива всегда должен быть положительным числом и не должен превышать ограничение в 99 чисел.");
            return;
        }

        // Создание и заполнение массива случайными числами
        double[] arrayValues = new double[arraySize];
        for (int i = 0; i < arraySize; i++){
            arrayValues[i] = Math.random();
        }

        //Преобразование массива в строку для вывода
        String array = Arrays.toString(arrayValues);

        // Нахождение максимального значения
        double maxValue = Arrays.stream(arrayValues).max().getAsDouble();

        // Нахождение минимального значения
        double minValue = Arrays.stream(arrayValues).min().getAsDouble();

        // Нахождение среднего значения всего массива
        double averageValue = Arrays.stream(arrayValues).average().getAsDouble();

        // Вывод значений
        System.out.println("Массив: " + array);
        System.out.println("Максимальное значение массива: " + maxValue);
        System.out.println("Минимальное значение массива: " + minValue);
        System.out.println("Среднее значение массива: " + averageValue);

    }
}

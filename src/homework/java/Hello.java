import java.util.HashSet;
import java.util.Set;

public class Hello {
    public static void main(String[] arg) {
        // Инициализируется значение "Hello"
        String word = "Hello";
        // Преобразование строки в массив
        char[] array = word.toCharArray();
        // Подсчет размера массива
        int length = word.length();

        // Объявление коллекции для хранения уникальных символов
        Set<Character> duplicatedChars = new HashSet<>();

        // Цикл проверки каждого символа на повторение. Повторяемый символ сохраняется
        // в единственном экземпляре в переменную коллекции "duplicatedChars"
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    duplicatedChars.add(array[j]);
                    break;
                }
            }
        }

        // Вывод значений
        System.out.print("Повторяющиеся символы: ");
        for (Character duplicatedChar : duplicatedChars) {
            System.out.print(duplicatedChar + " ");
        }

    }
}

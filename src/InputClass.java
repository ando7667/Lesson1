import java.util.Scanner;

/**
 * Класс для взаимодействия с пользователем.
 *
 */
public class InputClass {
    static Scanner scaner = new Scanner(System.in);

    /**
     *  Метод для вывода сообщения пользователю
     *  и получения от него строки
     *
     * @param msg строка сообщения
     * @return введенная строка
     */
    public static String inputData(String msg) {

        System.out.printf(msg);
        return scaner.nextLine();
    }

    /**
     * Метод Вывода пользавателю вопросов и ожидания ввода ответа на них
     */
    public static void run() {

        String name = inputData("Введите ваше имя: ");
        String age_str = inputData("Введите ваш возраст: ");
        int age = 0;
        try {
            age = Integer.parseInt(age_str);
        } catch (NumberFormatException ex) {
            System.out.println("\nВвели неправльный возраст!");
            run();
        }
        Decorator.helloUser(name, age);
    }

}

/**
 * Декоратор. Придает результату более привлекательный вид
 */
public class Decorator {
    /**
     * Метод оформления приветственной фразы пользователя
     *
     * @param name имя пользователя
     * @param age возраст пользователя
     */
    public static void helloUser(String name, int age) {
        System.out.printf("Приветствую тебя %s !\nВаш возраст : %d", name, age);
    }
}

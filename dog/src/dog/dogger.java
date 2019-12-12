package dog;

import java.util.Scanner;

public class dogger {
    public static void main(String[] args) {
        System.out.println("Введите окрас песеля");
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        System.out.println("Цвет песеля: + number");
        dog ourdog = new dog();
        ourdog.eat();
        ourdog.sleep();
        String say = ourdog.speak("Поиграй со мной");
        System.out.println(say);
    }

}

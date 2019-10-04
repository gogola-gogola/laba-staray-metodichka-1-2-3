package dog;

public class dogger {
    public static void main(String[] args) {
        dog ourdog = new dog();
        ourdog.eat();
        ourdog.sleep();
        String say = ourdog.speak("Поиграй со мной");
        System.out.println(say);
    }

}

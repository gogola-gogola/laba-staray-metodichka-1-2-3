package dog;

public class dog {
    public int weight;
    public String name;
    public String color;

        public void eat () {
            System.out.println ("Кушает...");
        }

    public void sleep() {
        System.out.println ("Спит...хр...хр...хр");
    }
    public String  speak (String words) {
            String phrase = words + "...гав-гав...\n";
            return phrase;
    }
}

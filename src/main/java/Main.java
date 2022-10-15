import ru.netology.Radio.Radio;

public class Main {
    public static void main (String [] args) {
        Radio radio = new Radio();

        radio.setStation(-1);
        System.out.println(radio.currentStation);
    }
}

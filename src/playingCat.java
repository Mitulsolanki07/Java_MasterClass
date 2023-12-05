public class playingCat {
    public static void main(String[] args) {

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (!summer) {
            return (25 <= temperature && temperature <= 35);
        } else return (temperature >= 25 && temperature <= 45);
    }
}

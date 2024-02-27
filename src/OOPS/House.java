package OOPS;

public class House {
    private String Color;
    public static String defaultColor = "Blue";
    public static int rooms = 4;

    public House(String Color) {
        this.setColor(Color);
    }

    public void setColor(String Color) {
        System.out.println(Color + " Color set for House! with " + rooms + " rooms.");
        this.Color = Color;
    }

    public String getColor() {
        return this.Color;
    }
}

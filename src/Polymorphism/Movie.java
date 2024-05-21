package Polymorphism;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void WatchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String movieType, String title) {
        return switch (movieType.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'S' -> new ScienceFiction(title);
            case 'C' -> new Comedy(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {
    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void WatchMovie() {
        super.WatchMovie();
        System.out.printf(".. %s%n".repeat(3), "Pleasant Scene", "Scary", "Nature Lover");
    }

    public static void WatchAdventure() {
        System.out.println("Watching Adventure");
    }
}

class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void WatchMovie() {
        super.WatchMovie();
        System.out.printf(".. %s%n".repeat(3), "Something very Funnier", "LoL", "Amazing");
    }

    public static void watchComedy() {
        System.out.println("Watching Comedy movie");
    }
}

class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void WatchMovie() {
        super.WatchMovie();
        System.out.printf(".. %s%n".repeat(4), "Bad Aliens Do Bad Stuff", "Milky Galaxy", "Space Ship", "Moon & Shining Stars");
    }

    public static void ScienceFictionMovie() {
        System.out.println("Watching Science Fiction Movie");
    }
}
public class Movie {
    private final String title;
    private final boolean isVIP;
    private final boolean is3D;

    public Movie(String title, boolean isVIP, boolean is3D) {
        this.title = title;
        this.isVIP = isVIP;
        this.is3D = is3D;
    }

    public String getTitle() {
        return title;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public boolean is3D() {
        return is3D;
    }
}

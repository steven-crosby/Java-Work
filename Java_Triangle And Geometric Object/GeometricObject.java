import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;
    public GeometricObject(){

    };

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "GeometricObject [color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + "]";
    }

}
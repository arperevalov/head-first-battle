import java.util.ArrayList;
import java.util.List;

public class SimpleFigure {
    private int[] locationCells;
    private int health;

    public SimpleFigure (int health) {
        setHealth(health);
    }

    public int[] getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public void setHealth(int health) {
        this.health = this.health + health;
    }

    public int getHealth() {
        return health;
    }

    public String checkSelf (int cell) {
        for (int location : locationCells) {
            if (location == cell) {
                setHealth(-1);
                return "Correct";
            }
        }
        return "Missed";
    }
}

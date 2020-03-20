package sample;

public class Tile {
    private boolean value;

    public Tile () {
        this.value = false;
    }

    public boolean isValue () {
        return value;
    }

    public void toggle() {
        value =! value;
    }
}

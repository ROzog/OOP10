package oop.tasks.boxes;

public class Box {
    private int width;
    private int height;

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Box(int height){
        this.height = height;
        this.width = 2 * height;
    }

    public Box joinDiagonal(Box box){
        return new Box(getWidth() + box.getWidth(), getHeight() + box.getHeight());
    }

    public Box joinHorizontally(Box box){
        return new Box(getWidth() + box.getWidth(), Math.max(getHeight(), box.getHeight()));
    }

    public Box joinVerticaly(Box box){
        return new Box(Math.max(getWidth(), box.getWidth()),  getHeight() + box.getHeight());
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

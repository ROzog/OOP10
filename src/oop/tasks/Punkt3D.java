package oop.tasks;

public class Punkt3D extends Punkt2D {
    private int z;

    public Punkt3D(int y, int x, int z) {
        super(y, x);
        this.z = z;
    }

    public Punkt3D(){
        super();
        this.z = 0;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }


}

package pojo;

public class Punto3d extends Punto {
    private int z;

    public Punto3d(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Punto3d punto3D() {
        super.punto();
        this.z = 0;
        return this;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}

package utils;

import java.io.Serializable;

public class Position implements Serializable {
    private static final long serialVersionUID = -2001232313615923575L;

    private float x;
    private float y;
    private float z;

    public Position() {

    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public Position(float x, float y, float z) {
        set(x, y, z);
    }

    // Deep copy
    public Position set(Position pos) {
        return this.set(pos.getX(), pos.getY(), pos.getZ());
    }

    public Position set(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }

    public Position add(Position add) {
        this.x += add.getX();
        this.y += add.getY();
        this.z += add.getZ();
        return this;
    }

    public Position addX(float d) {
        this.x += d;
        return this;
    }

    public Position addY(float d) {
        this.y += d;
        return this;
    }

    public Position addZ(float d) {
        this.z += d;
        return this;
    }

    public Position clone() {
        return new Position(x, y, z);
    }

    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ", " + this.getZ() + ")";
    }

    /**
     * To XYZ array for Spatial Index
     */
    public double[] toDoubleArray() {
        return new double[]{ x, y, z};
    }
    /**
     * To XZ array for Spatial Index (Blocks)
     */
    public double[] toXZDoubleArray() {
        return new double[]{x, z};
    }
}

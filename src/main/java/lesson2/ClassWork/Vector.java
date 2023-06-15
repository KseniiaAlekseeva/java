package lesson2.ClassWork;

import static java.lang.Math.sqrt;

public class Vector {
    public double x;
    public double y;
    public double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return Vector length
     * @apiNote
     */
    public double length() {
        return sqrt(x * x + y * y + z * z);
    }

    /**
     * @param vec Second vector
     * @return
     * @apiNote Scalar multiplication
     */
    public double scalar(Vector vec) {
        return x * vec.x + y * vec.y + z * vec.z;
    }

    /**
     * @param vec Second vecto
     * @return
     * @apiNote Vector multiplication
     */
    public Vector multiVec(Vector vec) {
        return new Vector(
                y * vec.z - z * vec.y,
                z * vec.x - x * vec.z,
                x * vec.y - y * vec.x
        );
    }

    /**
     * @apiNote Angle between vectors
     * @param vec Second vector
     * @return cos(Angle)
     */
    public double angle(Vector vec){
        return scalar(vec)/length()/vec.length();
    }
}

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // method that calculates the length of the vector
    public double vectorlength() {
        return Math.sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z));
    }

    // method that calculates the scalar product
    public double scalarProduct(Vector vector) {
        return this.x * vector.x + this.y * vector.y + this.z * vector.z;
    }

    // method that calculates the vector product with another vector
    public Vector crossProduct(Vector vector) {
        return new Vector(
                this.y * vector.z - this.z * vector.y,
                this.z * vector.x - this.x * vector.z,
                this.x * vector.y - this.y * vector.x
        );
    }

    // method that calculates the angle between the vectors
    public double cosineAngle(Vector vector) {
        return scalarProduct(vector) / vectorlength() * vector.vectorlength();
    }

    // methods for sum and difference
    public Vector sum(Vector vector) {
        return new Vector(
          this.x + vector.x,
          this.y + vector.y,
          this.z + vector.z
        );
    }

    public Vector difference(Vector vector) {
        return new Vector(
                this.x - vector.x,
                this.y - vector.y,
                this.z - vector.z
        );
    }

    public static Vector[] createVectorArr(int size) {
        Vector[] arr = new Vector[size];
        for (int i = 0; i < size; i++) {
            arr[i] = new Vector(Math.random(), Math.random(), Math.random());
        }

        return arr;
    }
}

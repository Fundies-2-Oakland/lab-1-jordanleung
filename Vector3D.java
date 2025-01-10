public class Vector3D {
    private double x;
    private double y;
    private double z;
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getZ(){
        return this.z;
    }
    public String toString(){
        return "(" + String.format("%.2f",this.x) + ", " + String.format("%.2f",this.y) + ", " + String.format("%.2f",this.z) + ")";
    }
    public double getMagnitude(){
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2)+Math.pow(this.z,2));
    }
    public Vector3D normalize(){
        if (getMagnitude() == 0){
            throw new IllegalStateException("Magnitude is zero");
        }
        return new Vector3D(this.x/getMagnitude(), this.y/getMagnitude(), this.z/getMagnitude());
    }

    public Vector3D add(Vector3D v){
        return new Vector3D(this.x + v.getX(), this.y + v.getY(), this.z + v.getZ());
    }
    public Vector3D multiply(int scalar){
        return new Vector3D(this.x * scalar, this.y * scalar, this.z * scalar);
    }

}


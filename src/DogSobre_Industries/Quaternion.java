package DogSobre_Industries;

import java.io.Serializable;

final class Quaternion implements Serializable {
    public static final Quaternion IDENTIFY = new Quaternion(1,0,0,0);
    public static final Quaternion Zero = new Quaternion(0, 0, 0, 0);
    public static final Quaternion i = new Quaternion(0, 1, 0, 0);
    public static final Quaternion j = new Quaternion(0, 0, 1, 0);
    public static final Quaternion k = new Quaternion(0, 0, 0, 1);


    public void Rotation(float Var1){

    }

    public Quaternion(int w, int i, int j, int k) {
    }
}
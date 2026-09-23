import java.math.*;


public class Main {
    public static boolean incl(short a) {
        short[] b = {7, 11, 13, 15, 16, 18, 19};

        for (int i = 0; i < 7; i++) {
            if (a == b[i]) {
                return true;
            }
        }

        return false;
    }

    public static double val(float[] x, short[] l, int j, int i) {
        double y;
        if (l[i] == 17) {
            y = Math.asin(Math.cos(x[j])*Math.cos(x[j]));
        }
        else if(incl(l[i])) {
            y = Math.sin(Math.tan(Math.asin((x[j] + 0.5)/29.0)));
        }
        else {
            double step = Math.log(Math.abs(x[j])) + 3.0 / 4;
            step = Math.cos(Math.pow(Math.asin((x[j] + 0.5)/29.0), step));

            double z = Math.pow(0.5*Math.atan((x[j] + 0.5)/29.0), 2);
            z = Math.pow(z/Math.PI, 3);
            z += 2.0/3;
            z = 4.0/z;
            y = Math.pow(z, step);
        }

        return y;
    }

    public static void main(String[] args) {
        short[] l = new short[19-5 + 1];

        for (int i = 0; i < 19-5 + 1; i++) {
            l[i] = (short)(i+5);
        }

        float[] x = new float[19];

        for (int i = 0; i < 19; i++){
            float y = (float)(-14 + (15 + 14) * Math.random());
            x[i] = y;
        }

        double[][] y = new double[15][19];

        for (int i = 0; i<15; i++) {
            for (int j = 0; j <19; j++) {
                y[i][j] = val(x, l, j, i);
            }
        }

        for (int i = 0; i<15; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(Math.ceil(y[i][j]*100)/100.0 + " ");
            }
            System.out.println();
        }
    }
}

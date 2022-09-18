 public class Main {

    public static void main(String[] args) {
        int m=2;
        long [] t = new long[9];
        for (int i=0; i<9;i++) {
            t[i]=m;
            m=m+2;
        }

        float [] x = new float[12];
        for (int i = 0; i<x.length; i++) {
            x[i] = (float) (Math.random()*(7.0f-(-5.0f)))+(-5.0f); // от -5 до 7
        }
        double [][] d = new double[9][12];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 12; j++) {
                if (t[i]==18) {
                    d[i][j]=Math.atan(Math.exp(Math.cbrt(-1*Math.pow(Math.cos(x[j]),2))));
                }
                else if (t[i] == 6 || t[i] == 8|| t[i] == 12 || t[i] == 16) {
                    d[i][j]=Math.pow((0.5)/(Math.pow(x[j],4.0*x[j])),2.0)+1.0;
                }
                else {
                    d[i][j]=Math.exp(Math.pow(Math.pow((1.0/4.0)*Math.cbrt(x[j]), 2),(Math.log(Math.abs(x[j]))/(1-Math.asin((x[j]+1)/12)))));
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%.5f", d[i][j]);
                System.out.print("  ");
            }
            System.out.println("\n");
        }



    }
}

import java.util.Arrays;

public class Bound {

    public static double calculate(double  [] benefits, double [] weights, double max){

        Data[] qp = new Data[benefits.length];
        double w = 0;
        double bound = 0;

        // Creating b/w ratio array
        for(int i = 0 ; i < benefits.length ; i++){
            qp[i] = new Data(weights[i], benefits[i]);
        }

        Arrays.sort(qp);

        int j = qp.length-1;

        while(w < max && j != -1) {

            // w + qp[j].W corresponds to current weight
            // plus weight of the next item
            if(w  + qp[j].W > max){
                // Calculating portion that fits with max capacity
                double rest = w + qp[j].W - max;
                // Add that portion
                bound += ((qp[j].W - rest) / qp[j].W) * qp[j].B;
                w = max;
            }
            else {
                bound += qp[j].B;
                w += qp[j].W;
            }
            j--;
        }
        return bound;

    }

    public static void main(String[] args){
        double [] benefits = {45, 30, 45, 10};
        double [] weights = {3, 5, 9, 5};
        int max = 16;
        System.out.println(calculate(benefits, weights, max));
    }
}

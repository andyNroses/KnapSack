public class Data implements Comparable<Object> {
    /*
    Represents items with weight, benefit
    and b/w ratio
     */
    public double W;
    public double B;
    public double BW;

    public Data(double w, double b) {
        W = w;
        B = b;
        BW = b/w;
    }

    @Override
    // Useful to sort according to bw ratio
    public int compareTo(Object o) {
        Data  d = (Data) o;
        return (int)(this.BW - d.BW);
    }
}
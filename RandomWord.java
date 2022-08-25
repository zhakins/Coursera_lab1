import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
public class RandomWord {
    public static void main(String[] args) {
        String res ="";
        String tmp = "";
        double p =1;
        while (!StdIn.isEmpty()) {
            String value = StdIn.readString();

            if (StdRandom.bernoulli((double) 1 / p)){
                res = value;
            }
            p++;
            if (!res.isEmpty()){
                StdOut.println(res);
                break;
            }


        }
        //StdOut.println(res);
    }
}

package _01or;

import org.junit.Assert;

public class _06FloatNumberRepresentation {

    public static void main(String[] args) {
        double n1 = 0.625;
        double n2 = 0.624;
        Assert.assertEquals("0.101", m(n1));
        Assert.assertThrows(RuntimeException.class, () -> m(n2));
    }

    public static String m(double n){
        StringBuilder sb = new StringBuilder("0.");
        while (n > 0){
            double r = n * 2;
            if(r>=1){
                sb.append("1");
                n = r - 1;
            }else {
                sb.append("0");
                n = r;
            }
            if(sb.length() > 34){
                throw new RuntimeException("Unable to convert the given number");
            }
        }

        return sb.toString();
    }
}

public class basicmath
{
    public static void main(String[] args)
    {
        double a = 5.4;
        int b = 10;
        double q = -6.6;
        int t = 64;

        double c = Math.max(a, b);
        double d = Math.min(a, b);
        double e = Math.abs(q);
        double f = Math.sqrt(t);
        double g = Math.round(a);
        double h = Math.ceil(a);        // round up
        double i = Math.floor(a);       // round down

        System.out.println("The maximum number is: "+c);
        System.out.println("The minimum number is: "+d);
        System.out.println("The absolute value is: "+e);
    
    }    
}

public class array
{
    public static void main(String[] args)
    {
        int[] salary = {10000, 25000, 50000, 80000, 100000};

        System.out.println(salary[0]);
        System.out.println(salary[1]);
        System.out.println(salary[2]);
        System.out.println(salary[3]);
        System.out.println(salary[4]);

        System.out.println();
        System.out.println();

        for(int i = 0; i < salary.length; i++)
        {
            System.out.println(salary[i]);
        }
    }    
}

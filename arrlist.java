import java.util.ArrayList;

public class arrlist
{
    public static void main(String[] args)
    {
        ArrayList<String> car = new ArrayList<String>();

        car.add("Honda");
        car.add("Suzuki");

        car.set(1, "Lambo");

        car.remove(1);

        car.clear();

        for(int i = 0; i < car.size(); i++)
        {
            System.out.println(car.get(i));
        }
    }
}

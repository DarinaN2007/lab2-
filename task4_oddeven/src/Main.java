//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в поле.
import java.util.ArrayList;

//4 задание
public class Main
{
    public static void main(String[] args)
    {
        OddEvenSeparator sep = new OddEvenSeparator();
        sep.addNumber(67);
        sep.addNumber(52);
        sep.addNumber(14);
        sep.addNumber(5);
        sep.addNumber(15);
        sep.addNumber(13);

        System.out.println("Чётные:");
        sep.even();

        System.out.println("Нечётные:");
        sep.odd();
    }
}

class OddEvenSeparator
{
    private ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
    private ArrayList<Integer> oddNumbers = new ArrayList<Integer>();

    public void addNumber(int number)
    {
        if (number % 2 == 0)
        {
            evenNumbers.add(number);
        }
        else
        {
            oddNumbers.add(number);
        }
    }

    public void even()
    {
        for (int i = 0; i < evenNumbers.size(); i++)
        {
            System.out.println(evenNumbers.get(i));
        }
    }

    public void odd()
    {
        for (int i = 0; i < oddNumbers.size(); i++)
        {
            System.out.println(oddNumbers.get(i));
        }
    }
}
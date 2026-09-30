//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в поле.
public class Balance
{
    private int leftWeight = 0;
    private int rightWeight = 0;

    public void addLeft(int weight)
    {
        leftWeight += weight;
    }

    public void addRight(int weight)
    {
        rightWeight += weight;
    }

    public void result() {
        if (leftWeight == rightWeight)
        {
            System.out.println("=");
        } else if (rightWeight > leftWeight)
        {
            System.out.println("R");
        } else
        {
            System.out.println("L");
        }
    }

    public static void main(String[] args)
    {
        Balance b1 = new Balance();
        b1.addLeft(6);
        b1.addRight(7);
        b1.result();

        Balance b2 = new Balance();
        b2.addLeft(2);
        b2.addRight(2);
        b2.result();

        Balance b3 = new Balance();
        b3.addLeft(5);
        b3.addRight(2);
        b3.result();
    }
}
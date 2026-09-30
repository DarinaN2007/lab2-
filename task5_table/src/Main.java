//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в поле.
//5задание
public class Main
{
    public static void main(String[] args)
    {
        Table t = new Table(2, 3);

        t.setValue(0, 0, 7);
        t.setValue(0, 1, 10);
        t.setValue(1, 2, 1);

        System.out.println("Таблица:");
        System.out.println(t.toString());

        System.out.println("Строк: " + t.rows());
        System.out.println("Столбцов: " + t.cols());
        System.out.println("Среднее арифметическое: " + t.average());
    }
}

class Table
{
    private int[][] data;
    private int rowCount;
    private int colCount;

    public Table(int rows, int cols)
    {
        rowCount = rows;
        colCount = cols;
        data = new int[rows][cols];
    }

    public int getValue(int row, int col)
    {
        return data[row][col];
    }

    public void setValue(int row, int col, int value)
    {
        data[row][col] = value;
    }

    public int rows()
    {
        return rowCount;
    }

    public int cols()
    {
        return colCount;
    }

    public String toString()
    {
        String result = "";
        for (int i = 0; i < rowCount; i++)
        {
            for (int j = 0; j < colCount; j++)
            {
                result = result + data[i][j] + " ";
            }
            result = result + "\n";
        }
        return result;
    }

    public double average()
    {
        int sum = 0;
        int count = rowCount * colCount;
        for (int i = 0; i < rowCount; i++)
        {
            for (int j = 0; j < colCount; j++)
            {
                sum = sum + data[i][j];
            }
        }
        return (double) sum / count;
    }
}
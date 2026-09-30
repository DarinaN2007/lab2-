//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в поле.
import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;
import exceptions.InvalidFigureException;
import exceptions.InvalidCylinderException;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Circle c = new Circle(5);
            Rectangle r = new Rectangle(6, 7);

            System.out.println(c);
            System.out.println("Площадь круга: " + c.area());
            System.out.println("Периметр круга: " + c.perimeter());
            System.out.println();

            System.out.println(r);
            System.out.println("Площадь прямоугольника: " + r.area());
            System.out.println("Периметр прямоугольника: " + r.perimeter());
            System.out.println();

            Cylinder cyl1 = new Cylinder(c, 13);
            System.out.println(cyl1);
            System.out.println("Объём цилиндра с круглым основанием: " + cyl1.volume());
            System.out.println();

            Cylinder cyl2 = new Cylinder(r, 3);
            System.out.println(cyl2);
            System.out.println("Объём цилиндра с прямоугольным основанием: " + cyl2.volume());

        } catch (InvalidFigureException e)
        {
            System.out.println("Ошибка фигуры: " + e.getMessage());
        } catch (InvalidCylinderException e)
        {
            System.out.println("Ошибка цилиндра: " + e.getMessage());
        }

        System.out.println("\n Проверка исключений:");
        try
        {
            Circle bad = new Circle(-5);
        } catch (InvalidFigureException e)
        {
            System.out.println("Поймано: " + e.getMessage());
        }

        try
        {
            Cylinder badCyl = new Cylinder(new Circle(1), 0);
        } catch (InvalidFigureException | InvalidCylinderException e)
        {
            System.out.println("Поймано: " + e.getMessage());
        }
    }
}
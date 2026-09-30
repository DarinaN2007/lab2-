package geometry2d;

import exceptions.InvalidFigureException;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) throws InvalidFigureException
    {
        if (radius <= 0)
        {
            throw new InvalidFigureException("Радиус должен быть положительным: " + radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() throws InvalidFigureException
    {
        if (radius <= 0)
        {
            throw new InvalidFigureException("Нельзя вычислить площадь: радиус = " + radius);
        }
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString()
    {
        return "Circle{radius=" + radius + "}";
    }
}
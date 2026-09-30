package geometry2d;

import exceptions.InvalidFigureException;

public class Rectangle implements Figure
{
    private double width;
    private double height;

    public Rectangle(double width, double height) throws InvalidFigureException
    {
        if (width <= 0 || height <= 0)
        {
            throw new InvalidFigureException("Стороны должны быть положительными: width=" + width + ", height=" + height);
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() throws InvalidFigureException
    {
        if (width <= 0 || height <= 0)
        {
            throw new InvalidFigureException("Нельзя вычислить площадь прямоугольника");
        }
        return width * height;
    }

    @Override
    public double perimeter()
    {
        return 2 * (width + height);
    }

    @Override
    public String toString()
    {
        return "Rectangle{width=" + width + ", height=" + height + "}";
    }
}
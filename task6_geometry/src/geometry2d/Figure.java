package geometry2d;

import exceptions.InvalidFigureException;

public interface Figure {
    public double area() throws InvalidFigureException;
    public double perimeter();
}
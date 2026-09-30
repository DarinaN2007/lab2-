package geometry3d;

import geometry2d.Figure;
import exceptions.InvalidFigureException;
import exceptions.InvalidCylinderException;

public class Cylinder {
    private Figure base;
    private double height;

    public Cylinder(Figure base, double height) throws InvalidCylinderException
    {
        if (height <= 0)
        {
            throw new InvalidCylinderException("Высота должна быть положительной: " + height);
        }
        this.base = base;
        this.height = height;
    }

    public double volume() throws InvalidFigureException
    {
        return base.area() * height;
    }

    @Override
    public String toString()
    {
        return "Cylinder{base=" + base + ", height=" + height + "}";
    }
}
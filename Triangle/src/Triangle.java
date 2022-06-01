public class Triangle

{
    private double base;
    private double height;

    public void setBase(double b)

    {
        base = b;
    }

    public void setHeight(double h)

    {
        height = h;
    }

    public double getBase()
    {
        return base;
    }

    public double getHeight()
    {
        return height;
    }

    public String toString()

    {
        return "Base of the triangle is: "+ base+ "\n" + "Height of the triangle is: "+ height;
    }

    public void area()

    {

        double area=(base * height);
        area = area/2;

        System.out.println("The Area of the triangle is: " + area);

    }

}
public class Rectangle
{
    private int width;
    private int height;
    
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    
    public int getArea()
    {
        return width * height;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
    
    public void pog()
    {
        System.out.println ("Pog");
    }
    
    public class PointTester extends ConsoleProgram
{
    public void run()
    {
        Point p = new Point(10, 5);
        System.out.println(p);
        p.move(3, 4);
        
        System.out.println(p);
        
        // Make a new point here at position (2, 4)
        Point a = new Point (4, 6);
        // Then print it out
        a.move(2, 4);
        System.out.println(a);
    }
}
    
    public class StudentTester extends ConsoleProgram

{

    public void run()

    {

        Student alan = new Student("Alan", "Turing", 11);

        Student ada = new Student("Ada", "Lovelace", 12);

        // Add an entry for yourself here!

        Student gladys = new Student ("Gladys", "Lee", 11);

        System.out.println(alan);

        System.out.println(ada);

        // Print out your student object

        System.out.println(gladys);

    }

}
    
}

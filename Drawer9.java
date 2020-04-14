import java.awt.*;
import becker.robots.icons.*;

public class Drawer9 extends Icon
{
    public Drawer9()
    {
        // Constructor
        super();
    }
    public void paintIcon(Graphics g)
    {

        // Draw body
        g.setColor(Color.BLUE);
        g.fillOval(30, 30, 40, 40);
        
        g.setColor(Color.PINK);
        g.fillOval(37, 35, 10, 10);
        
        g.setColor(Color.PINK);
        g.fillOval(53, 35, 10, 10);
       
        g.setColor(Color.PINK);
        g.fillOval(37, 50, 10, 10);
    }
}
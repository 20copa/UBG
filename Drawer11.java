import java.awt.*;
import becker.robots.icons.*;

public class Drawer11 extends Icon
{
    public Drawer11()
    {
        // Constructor
        super();
    }
    public void paintIcon(Graphics g)
    {

        // Draw body
        g.setColor(Color.PINK);
        g.fillOval(30, 30, 40, 40);
        
        g.setColor(Color.BLUE);
        g.fillOval(40, 35, 10, 10);
        
    }
}
import java.awt.*;
import becker.robots.icons.*;

public class Drawer8 extends Icon
{
    public Drawer8()
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
        
    }
}
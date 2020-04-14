import java.awt.*;
import becker.robots.icons.*;

public class Drawer3 extends Icon
{
    public Drawer3()
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
        g.fillRect(40, 35, 7, 25);
        
        g.setColor(Color.PINK);
        g.fillRect(55, 35, 4, 25);
    }
}
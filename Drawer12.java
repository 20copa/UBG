import java.awt.*;
import becker.robots.icons.*;

public class Drawer12 extends Icon
{
    public Drawer12()
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
        
        g.setColor(Color.BLUE);
        g.fillOval(53, 35, 10, 10);
        
    }
}
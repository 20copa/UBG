import java.awt.*;
import becker.robots.icons.*;

public class Drawer7 extends Icon
{
    public Drawer7()
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
        g.fillOval(40, 35, 10, 10);
        
    }
}
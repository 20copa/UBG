import java.awt.*;
import becker.robots.icons.*;

public class Drawer1 extends Icon
{
    public Drawer1()
    {
        
        super();
    }
    public void paintIcon(Graphics g)
    {

        g.setColor(Color.PINK);
        g.fillOval(30, 30, 40, 40);
        
        g.setColor(Color.BLUE);
        g.fillRect(40, 37, 5, 20);
        
        g.setColor(Color.BLUE);
        g.fillOval(40, 33, 20, 15);
    }
}
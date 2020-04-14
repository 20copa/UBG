import java.awt.*;
import becker.robots.icons.*;

public class Drawer2 extends Icon
{
    public Drawer2()
    {
        
        super();
    }
    public void paintIcon(Graphics g)
    {

        
        g.setColor(Color.BLUE);
        g.fillOval(30, 30, 40, 40);
        
        g.setColor(Color.PINK);
        g.fillRect(40, 37, 5, 20);
        
        g.setColor(Color.PINK);
        g.fillOval(40, 33, 20, 15);
        
        g.setColor(Color.PINK);
        g.fillOval(40, 50, 20, 15);
    }
}
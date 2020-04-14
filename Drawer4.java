import java.awt.*;
import becker.robots.icons.*;

public class Drawer4 extends Icon
{
    public Drawer4()
    {
        
        super();
    }
    public void paintIcon(Graphics g)
    {

        
        g.setColor(Color.PINK);
        g.fillOval(30, 30, 40, 40);
        
        g.setColor(Color.BLUE);
        g.fillRect(40, 35, 7, 25);
        
        g.setColor(Color.BLUE);
        g.fillRect(55, 35, 4, 25);
    }
}
 
import becker.robots.*;
import java.awt.*;

public class SetIcon3 extends RobotSE
{
    public SetIcon3(City aCity, int str, int ave, Direction dir)
    {
        super(aCity, str, ave, dir);
        setIcon(new Drawer3());
    }
}
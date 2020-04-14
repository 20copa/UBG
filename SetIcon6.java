 
import becker.robots.*;
import java.awt.*;

public class SetIcon6 extends RobotSE
{
    public SetIcon6(City aCity, int str, int ave, Direction dir)
    {
        super(aCity, str, ave, dir);
        setIcon(new Drawer6());
    }
}
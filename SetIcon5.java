 
import becker.robots.*;
import java.awt.*;

public class SetIcon5 extends RobotSE
{
    public SetIcon5(City aCity, int str, int ave, Direction dir)
    {
        super(aCity, str, ave, dir);
        setIcon(new Drawer5());
    }
}
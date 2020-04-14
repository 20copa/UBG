 
import becker.robots.*;
import java.awt.*;

public class SetIcon2 extends RobotSE
{
    public SetIcon2(City aCity, int str, int ave, Direction dir)
    {
        super(aCity, str, ave, dir);
        setIcon(new Drawer2());
    }
}
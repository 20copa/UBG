 
import becker.robots.*;
import java.awt.*;

public class SetIcon4 extends RobotSE
{
    public SetIcon4(City aCity, int str, int ave, Direction dir)
    {
        super(aCity, str, ave, dir);
        setIcon(new Drawer4());
    }
}
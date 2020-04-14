 
import becker.robots.*;
import java.awt.*;

public class SetIcon extends RobotSE
{
    public SetIcon(City City, int str, int ave, Direction dir)
    {
        super(City, str, ave, dir);
        setIcon(new Drawer1());
    }
}
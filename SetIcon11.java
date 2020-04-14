
import becker.robots.*;
import java.awt.*;

public class SetIcon11 extends RobotSE
{
    public SetIcon11(City City, int str, int ave, Direction dir)
    {
        super(City, str, ave, dir);
        setIcon(new Drawer11());
    }
}
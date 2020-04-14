
import becker.robots.*;
import java.awt.*;

public class SetIcon14 extends RobotSE
{
    public SetIcon14(City City, int str, int ave, Direction dir)
    {
        super(City, str, ave, dir);
        setIcon(new Drawer14());
    }
}
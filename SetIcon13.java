
import becker.robots.*;
import java.awt.*;

public class SetIcon13 extends RobotSE
{
    public SetIcon13(City City, int str, int ave, Direction dir)
    {
        super(City, str, ave, dir);
        setIcon(new Drawer13());
    }
}
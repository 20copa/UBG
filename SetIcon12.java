
import becker.robots.*;
import java.awt.*;

public class SetIcon12 extends RobotSE
{
    public SetIcon12(City City, int str, int ave, Direction dir)
    {
        super(City, str, ave, dir);
        setIcon(new Drawer12());
    }
}
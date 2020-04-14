
import becker.robots.*;
import java.awt.*;

public class SetIcon7 extends RobotSE
{
    public SetIcon7(City City, int str, int ave, Direction dir)
    {
        super(City, str, ave, dir);
        setIcon(new Drawer7());
    }
}
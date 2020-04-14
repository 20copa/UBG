
import becker.robots.*;
import java.awt.*;

public class SetIcon8 extends RobotSE
{
    public SetIcon8(City City, int str, int ave, Direction dir)
    {
        super(City, str, ave, dir);
        setIcon(new Drawer8());
    }
}

import becker.robots.*;
import java.awt.*;

public class SetIcon9 extends RobotSE
{
    public SetIcon9(City City, int str, int ave, Direction dir)
    {
        super(City, str, ave, dir);
        setIcon(new Drawer9());
    }
}
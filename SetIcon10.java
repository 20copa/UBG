
import becker.robots.*;
import java.awt.*;

public class SetIcon10 extends RobotSE
{
    public SetIcon10(City City, int str, int ave, Direction dir)
    {
        super(City, str, ave, dir);
        setIcon(new Drawer10());
    }
}
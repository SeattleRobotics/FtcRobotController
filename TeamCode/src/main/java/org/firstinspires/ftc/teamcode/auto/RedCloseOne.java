package org.firstinspires.ftc.teamcode.auto;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

/**
 */
@Autonomous(name="Red Close One InDeep", group="AAAInDeep")
public class RedCloseOne extends AutoDriveTest {

    @Override
    public void ratCrewGo() {
        encoderDrive(-1);
        turnLeft(90);
        ratCrewWaitSecs(2);

        encoderDrive(-22);
        plopThePurplePixel();

        //encoderDrive(22);
        //turnRight(90);
        //encoderDrive(-65);
        //turnRight(90);
        //encoderDrive(-5);

        //turnRight(90);
        //encoderDrive(-48);
        //turnRight(90);
        //encoderDrive(-27);
    }

}
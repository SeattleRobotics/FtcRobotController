package org.firstinspires.ftc.teamcode.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

/**
 */
@Autonomous(name="Maze One", group="DanceDemo")
public class MazeOne extends AutoDriveTest {

    @Override
    public void ratCrewGo() {
        encoderDrive(29); //  drives forward X inches

        // turnLeft(90); // not far enough! crashed right pole
        //turnLeft(105); //tooo far! crashed into left pole!
        //turnLeft(97); //still too far, hit the pole
        turnLeft(94); // turns x degrees   <-------


        //encoderDrive(72); // did not drive far enough!
        encoderDrive(93); //  drives forward X inches;
        ratCrewWaitSecs(1);
        // turnRight(105); turned to much
        turnRight(94);

        // up til here works

        encoderDrive(96); //72 was too far 54 was too short
        turnRight(94);


        encoderDrive(71); // 59 was not far enough didn't cross the truss
        turnRight(58);
        encoderDrive(60);

        // test change.
    }
}

package org.firstinspires.ftc.teamcode.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

/**
 */
@Autonomous(name="Straight 20flynn", group="AutoTest")
public class AutoStraight24 extends AutoBase {

    @Override
    public void ratCrewGo() {
        encoderDrive(24);
    }
}

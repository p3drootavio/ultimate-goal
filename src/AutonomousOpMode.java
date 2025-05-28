package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "Autonomous OpMode", group = "Alpha")
public class AutonomousOpMode extends LinearOpMode {

    private RobotHardware robot = new RobotHardware();
    private FuzzyController fuzzy = new FuzzyController();
    private VisionRecognition vision = new VisionRecognition();

    @Override
    public void runOpMode() {
        robot.init(hardwareMap);
        fuzzy.init(robot.shooterMotor);
        vision.init(hardwareMap, telemetry);

        waitForStart();

        int ringCount = vision.detectRings();

        if (ringCount == 0) {
            goToZoneA();
        } else if (ringCount == 1) {
            goToZoneB();
        } else {
            goToZoneC();
        }

        fuzzy.setShooterSpeed(6000);  // Fuzzy logic to maintain RPM
        launchRings(3);

        deliverWobbleGoal();
        parkOnWhiteLine();
    }

    private void goToZoneA() {
        moveForward(24);
    }

    private void goToZoneB() {
        moveForward(36);
    }

    private void goToZoneC() {
        moveForward(48);
    }

    private void moveForward(double distanceInInches) {
        // Basic encoder-based movement
    }

    private void launchRings(int count) {
        for (int i = 0; i < count; i++) {
            robot.launcherServo.setPosition(1);
            sleep(500);
            robot.launcherServo.setPosition(0);
            sleep(1000);
        }
    }

    private void deliverWobbleGoal() {
        robot.armServo.setPosition(0.5);
        sleep(1000);
    }

    private void parkOnWhiteLine() {
        while (opModeIsActive() && robot.colorSensor.alpha() < 200) {
            // Drive slowly forward
        }
    }
}

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@TeleOp(name = "TeleOp Mode", group = "Alpha")
public class TeleOpMode extends LinearOpMode {

    private RobotHardware robot = new RobotHardware();
    private boolean intakeToggle = false;

    @Override
    public void runOpMode() {
        robot.init(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {
            // Drivetrain
            double drive = -gamepad1.left_stick_y;
            double strafe = gamepad1.left_stick_x;
            double turn = gamepad1.right_stick_x;

            robot.leftFront.setPower(drive + strafe + turn);
            robot.rightFront.setPower(drive - strafe - turn);
            robot.leftBack.setPower(drive - strafe + turn);
            robot.rightBack.setPower(drive + strafe - turn);

            // Intake Toggle
            if (gamepad1.a) {
                intakeToggle = !intakeToggle;
                sleep(300); // debounce
            }
            robot.intakeMotor.setPower(intakeToggle ? 1.0 : 0.0);

            // Arm Servo (wobble goal)
            if (gamepad1.b) robot.armServo.setPosition(1);
            if (gamepad1.x) robot.armServo.setPosition(0);

            // Launcher servo with delay reset
            if (gamepad1.right_bumper) {
                robot.launcherServo.setPosition(1);
                sleep(500);
                robot.launcherServo.setPosition(0);
            }
        }
    }
}

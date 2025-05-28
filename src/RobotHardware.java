package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.CRServo;

public class RobotHardware {
    public DcMotor leftFront, leftBack, rightFront, rightBack;
    public DcMotor intakeMotor, shooterMotor;
    public Servo armServo, launcherServo;
    public ColorSensor colorSensor;

    public void init(HardwareMap hwMap) {
        leftFront = hwMap.get(DcMotor.class, "leftFront");
        leftBack = hwMap.get(DcMotor.class, "leftBack");
        rightFront = hwMap.get(DcMotor.class, "rightFront");
        rightBack = hwMap.get(DcMotor.class, "rightBack");

        intakeMotor = hwMap.get(DcMotor.class, "intakeMotor");
        shooterMotor = hwMap.get(DcMotor.class, "shooterMotor");

        armServo = hwMap.get(Servo.class, "armServo");
        launcherServo = hwMap.get(Servo.class, "launcherServo");

        colorSensor = hwMap.get(ColorSensor.class, "colorSensor");

        DcMotor[] motors = {leftFront, leftBack, rightFront, rightBack};
        for (DcMotor motor : motors) {
            motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        }
    }
}

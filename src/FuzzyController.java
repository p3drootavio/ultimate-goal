package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class FuzzyController {
    private DcMotor motor;
    private double targetRPM = 6000;

    public void init(DcMotor shooterMotor) {
        this.motor = shooterMotor;
    }

    public void setShooterSpeed(double desiredRPM) {
        // Simulação de controle fuzzy: mapeia variações simples em RPM para ajuste de potência
        double currentRPM = getRPM();
        double error = desiredRPM - currentRPM;

        double powerAdjustment;
        if (Math.abs(error) < 100) {
            powerAdjustment = 0.01;
        } else if (Math.abs(error) < 300) {
            powerAdjustment = 0.05;
        } else {
            powerAdjustment = 0.1;
        }

        double currentPower = motor.getPower();
        double newPower = currentPower + (error > 0 ? powerAdjustment : -powerAdjustment);
        motor.setPower(Math.min(Math.max(newPower, 0), 1));
    }

    private double getRPM() {
        // Simulação: retornar valor aleatório ou fixo para testes (substituir com sensor real em ambiente físico)
        return 5800 + Math.random() * 400;
    }
}

# Ultimate Goal – FTC Robotics Project

This repository contains the autonomous and teleoperated control code for Team Alpha Technology #17739, developed during the FIRST Tech Challenge (FTC) *Ultimate Goal* season.

##  Overview

The robot code is written in Java using the FTC SDK and supports multiple subsystems:
- **Autonomous navigation and scoring**
- **TeleOp driving and mechanism control**
- **Vision processing with OpenCV**
- **PID and Fuzzy logic controllers**

##  Project Structure
```
src/
├── AutonomousOpMode.java # Autonomous routine using custom movement logic
├── FuzzyController.java # Fuzzy logic controller for smoother motion handling
├── Main.java # Entry point or utility class (e.g., test runner)
├── PIDController.java # Standard PID controller for precise feedback loops
├── RobotHardware.java # Hardware mapping and initialization for all components
├── TeleOpMode.java # Driver-controlled mode with gamepad input handling
├── VisionRecognition.java # Image processing pipeline for object detection (OpenCV)
```

## Technologies Used

- Java + FTC SDK
- OpenCV (EasyOpenCV)
- Android Studio / IntelliJ IDEA
- Object-Oriented Programming
- PID and Fuzzy Control Algorithms

## Key Features

- Modular pipeline for vision-based object detection
- Dynamic hardware abstraction layer
- Reliable teleop with joystick controls and servo mechanisms
- Tunable PID control for autonomous precision
- Experimental fuzzy controller for adaptive decisions

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/ultimate-goal.git
2. Open the project using Android Studio or IntelliJ IDEA.

3. Make sure the FTC SDK dependencies and OpenCV libraries are properly configured.

4. Build and deploy to your Robot Controller phone.

## Authors
Pedro Otávio Nascimento Campos de Oliveira

Team Alpha Technology #17739
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.SerialPort;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static class Buttons {
    public static class ButtonBox {
      public static int
        ButtonBoxJoystickId = 1,          
        hatchJoystickButtonId = 1,
        ballJoystickButtonId = 2,
        mediumHeightJoystickButtonId = 3,
        activateJoystickButtonId = 4,
        lowHeightJoystickButtonId = 5,
        frontJoystickButtonId = 6,
        backJoystickButtonId = 7,
        rocketJoystickButtonId = 8,
        cargoShipJoystickButtonId = 9,
        highHeightJoystickButtonId = 10,
        cancelJoystickButtonId = 11,
        intakeJoystickButtonId = 12,
        AJoystickButtonId = 13,
        BJoystickButtonId = 14,
        XJoystickButtonId = 15,
        leftJoystickHatAngle = 315,
        centerJoystickHatAngle = 0,
        rightJoystickHatAngle = 45;      
    }
    public static int

      GamePad1 = 0,
      buttonA = 1,
      buttonB = 2,
      buttonX = 3,            // TODO: Need to check this
      buttonY = 4,            // TODO: Need to check this
      buttonLeftShoulder = 5,       // TODO: Need to check this
      buttonRightShoulder = 6,      // TODO: Need to check this
      buttonLeftThumbstick = 9,     // TODO: Need to check this
      buttonRightThumbstick = 10,    // TODO: Need to check this
      buttonLeftTrigger = 9,        // TODO: Need to check this
      buttonRightTrigger = 10,      // TODO: Need to check this
      buttonBack = 7,

      //AXIS PORTS
      leftXAxis = 0,
      leftYAxis = 1,
      rightXAxis = 4,
      rightYAxis = 5,

      end_of_buttons;
  }

  public static class Ports {
    public static final SerialPort.Port AHRS = SerialPort.Port.kUSB;
    public static int
      //TALON PORTS
      leftTalon = 4,
      rightTalon = 1,

      //VICTOR PORTS
      leftVictor1 = 5,
      leftVictor2 = 6,
      rightVictor1 = 2,
      rightVictor2 = 3,

      //SENSOR PORTS
      lineSensorFrontLeft = 4,  
      lineSensorFrontCenter = 5,
      lineSensorFrontRight = 6,
      frontUltrasonicSensor = 0, 
      frontInfraredSensor = 2,  

      lineSensorBackLeft = 1,    
      lineSensorBackCenter = 2,  
      lineSensorBackRight = 3,   
      backInfraredSensor = 3,  



      //BALL PORTS
      ballMotor = 9,
      // ball sensor on the arm canifier rev limit switch connection 

      //HATCH PORTS
      hatchSolenoid = 1,
  
      //ARM PORTS
      discBrake = 2, 
      armSpark = 10,
      armCanifier = 23,

      // ELEVATOR PORTS
      elevatorCanifier = 29, // TODO: need to change this to the correct value!
      masterElevatorMotor= 7,
      followerElevatorMotor = 8,

      //LANDING GEAR PORTS
      landingGearPiston = 0,
      landingGearFloorSensor = 1,

      //CAMERA PORTS
      panservo = 9,
      tiltservo = 8,

      // placeholder so we can always just end with commas :-)
      end_of_ports = 999;
  }

  public static class Values {
    // TODO: PID values should be reduced across classes unless different values are needed.
    // In that case, these names should be changed to indicate who the consumer is.
    public static final double

      P = 0.0002,
      I = 0.0,
      D = 0.0,

      driveDistanceP = .00025, //placeholders
      driveDistanceI = 0.0,
      driveDistanceD = 0.0,
      protobotTickPerFoot= 2449,

      inchesPerTick = (3.954*Math.PI)/4096, //inches per encoder tick
      ticksPerFoot = ((49152/(3.97*Math.PI)))*.9,//3940, //encoder ticks per foot

      //INFRARED DISTANCES
      frontUltrasonicSensorHatchCargoship = 91,     //TODO: Need to check this      
      frontInfraredSensorHatchCargoship = 5,  //TODO: Need to check this      
      frontUltrasonicSensorHatchRocket = 5,        //TODO: Need to check this   
      frontInfraredSensorHatchRocket = 5,     //TODO: Need to check this 
  
      frontUltrasonicSensorBallCargoship = 5,     //TODO: Need to check this      
      frontInfraredSensorBallCargoship = 5,  //TODO: Need to check this      
      frontUltrasonicSensorBallRocket = 5,        //TODO: Need to check this   
      frontInfraredSensorBallRocket = 5,     //TODO: Need to check this   
  
      backInfraredSensorHatchCargoship = 5,   //TODO: Need to check this  
  
      backInfraredSensorBallRocket = 5,      //TODO: Need to check this
      backInfraredSensorBallCargoship = 5,   //TODO: Need to check this 

      // Drive to Distance PID values
      driveToDistance_kP = 0.0002,
      driveToDistance_kI = 0.0,
      driveToDistance_kD = 0.0,

      // Arm and Elevator Values
      elevatorPidP = 655520, // all placeholders
      elevatorPidI = 123456,
      elevatorPidD = 123456789,
      elevatorPidF = 1234567,
      elevatorTopHeight = 10000,

      armSwitchHeight= 9002, //placeholer for height in order for arm to switch
      armEncoderCenter= 9002,//another place holder
      armFrontLimit = 9002, //encoder ticks @ the front limit. placeholder.
      armBackLimit = 9002, //encoder ticks @ the back limit. placeholder.

      armPidP = 0.1,
      armPidI = 0,
      armPidD = 0,
      armPidK = 0,
      armMaxPidF = 0,
      ticksToRadiansArm= 3.14159268/(Math.abs(armBackLimit-armFrontLimit)),

      // Camera values
      leftAngleInDegrees = 75,
      rightAngleInDegrees = 115;
  }

  public static class ElevatorHeights {
    public static int
      elevatorBackTopHatchHeight = 1, //hey, placeholders.
      elevatorBackMiddleHatchHeight = 1, 
      elevatorBackBottomHatchHeight = 2,
      elevatorBackShipHatchHeight = 3,

      elevatorBackTopCargoHeight = 5,
      elevatorBackMiddleCargoHeight = 8,
      elevatorBackBottomCargoHeight = 13,
      elevatorBackShipCargoHeight = 21,

      elevatorFrontTopHatchHeight = 34,
      elevatorFrontMiddleHatchHeight = 55,
      elevatorFrontBottomHatchHeight = 89,
      elevatorFrontShipHatchHeight = 135,

      elevatorFrontTopCargoHeight = 224,
      elevatorFrontMiddleCargoHeight = 359,
      elevatorFrontBottomCargoHeight = 583,
      elevatorFrontShipCargoHeight = 912;

      public static int[]
      elevatorFrontHatchHeightArray = {
        elevatorFrontTopHatchHeight, 
        elevatorFrontMiddleHatchHeight, 
        elevatorFrontBottomHatchHeight 
      },
    
      elevatorBackHatchHeightArray = {
        elevatorBackTopHatchHeight, 
        elevatorBackMiddleHatchHeight,
        elevatorBackBottomHatchHeight
      },

      elevatorFrontCargoHeightArray = {
        elevatorFrontTopCargoHeight,
        elevatorFrontMiddleCargoHeight,
        elevatorFrontBottomCargoHeight
      },

      elevatorBackCargoHeightArray = {
        elevatorBackTopCargoHeight,
        elevatorBackMiddleCargoHeight,
        elevatorBackBottomCargoHeight
      };
  }
}

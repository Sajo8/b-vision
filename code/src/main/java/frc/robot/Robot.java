/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTableEntry;

import edu.wpi.first.wpilibj.TimedRobot;

import java.util.Arrays;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends TimedRobot {

  NetworkTable table;
  NetworkTableInstance table2;

  public Robot() {
    
    NetworkTableInstance nti = NetworkTableInstance.getDefault();
    table = nti.getTable("GRIP");
  }

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    // System.out.println("tostring: " + table.toString());
    // System.out.println("the keys: " + table.getKeys());

    double[] defaultValue = new double[0];
    
    NetworkTableEntry nt = table.getEntry("area");
    double[] dbArr = nt.getDoubleArray(defaultValue);
    System.out.println(dbArr);
    System.out.println(Arrays.toString(dbArr));
    
    /* code copied, all deprecated funcs */

    // double[] x = table.getNumberArray("centerX", defaultValue);
    // double[] y = table.getNumberArray("centerY", defaultValue);
    // double[] h = table.getNumberArray("height", defaultValue);
    // double[] w = table.getNumberArray("width", defaultValue);
    // double[] a = table.getNumberArray("area", defaultValue);
    
    // table = NetworkTable.getTable("GRIP/myCountoursReport");
  }

  /**
   * This function is run once each time the robot enters autonomous mode.
   */
  @Override
  public void autonomousInit() {
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
  }

  /**
   * This function is called once each time the robot enters teleoperated mode.
   */
  @Override
  public void teleopInit() {
  }

  /**
   * This function is called periodically during teleoperated mode.
   */
  @Override
  public void teleopPeriodic() {
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
  }
}

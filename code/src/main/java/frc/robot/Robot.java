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

  // NetworkTable table;
  // NetworkTableInstance table2;

  public Robot() {
    
    // NetworkTableInstance nti = NetworkTableInstance.getDefault();
    // table = nti.getTable("GRIP");
  }

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    // // System.out.println("tostring: " + table.toString());
    // // System.out.println("the keys: " + table.getKeys());

    // double[] defaultValue = new double[0];
    
    // NetworkTableEntry nt = table.getEntry("area");
    // double[] dbArr = nt.getDoubleArray(defaultValue);
    // System.out.println(dbArr);
    // System.out.println(Arrays.toString(dbArr));

    /*
    tv 	Whether the limelight has any valid targets (0 or 1)
    tx 	Horizontal Offset From Crosshair To Target (LL1: -27 degrees to 27 degrees | LL2: -29.8 to 29.8 degrees)
    ty 	Vertical Offset From Crosshair To Target (LL1: -20.5 degrees to 20.5 degrees | LL2: -24.85 to 24.85 degrees)
    ta 	Target Area (0% of image to 100% of image)
    ts 	Skew or rotation (-90 degrees to 0 degrees)
    tl 	The pipeline’s latency contribution (ms) Add at least 11ms for image capture latency.
    tshort 	Sidelength of shortest side of the fitted bounding box (pixels)
    tlong 	Sidelength of longest side of the fitted bounding box (pixels)
    thor 	Horizontal sidelength of the rough bounding box (0 - 320 pixels)
    tvert 	Vertical sidelength of the rough bounding box (0 - 320 pixels)
    getpipe 	True active pipeline index of the camera (0 .. 9)
    camtran 	Results of a 3D position solution, 6 numbers: Translation (x,y,y) Rotation(pitch,yaw,roll)*/
    
    NetworkTableInstance.getDefault().getTable("limelight").getEntry("tv").getDouble(0);
  }
}

/**
 * @(#)RobotArm.java
 *
 *
 * @Author: nmessa 
 * @version 1.00 2024/12/4
 */


public interface RobotArm {
    void moveUp( double rate, double howFar );
	void moveDown( double rate, double howFar );
	void twistLeft(double deg);
	void twistRight(double deg);   
}
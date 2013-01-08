package team170;

import battlecode.common.RobotController;

public class Soldier implements Bot {
	
	RobotController rc;
	
	public Soldier(RobotController rc) {
		this.rc = rc;
	}

	@Override
	public void run() {
		// TODO implement Soldier behavior
		rc.yield();
	}
}

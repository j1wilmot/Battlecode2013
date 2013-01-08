package team170;

import battlecode.common.RobotController;

public class HeadQuarters implements Bot {
	
	RobotController rc;
	
	public HeadQuarters(RobotController rc) {
		this.rc = rc;
	}
	
	@Override
	public void run() {
		// TODO implement HQ behavior
		rc.yield();
	}
}

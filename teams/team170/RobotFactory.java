package team170;

import battlecode.common.RobotController;
import battlecode.common.RobotType;

public class RobotFactory {

	public static Bot create(RobotController rc) {
		RobotType type = rc.getType();
		switch(type) {
		case HQ:
			return new HeadQuarters(rc);
		case SOLDIER:
			return new Soldier(rc);
		default:
			// TODO will need to replace this as we are penalized for exceptions
			throw new RuntimeException("No case for type: " + type);
		}
	}
}

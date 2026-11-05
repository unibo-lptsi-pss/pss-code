package it.unibo.advancedmechanisms.enums.en3;

import java.util.*;

public enum Zone {
	NORTH, CENTER, SOUTH;
	
	public List<Region> getRegions() {
		final ArrayList<Region> list = new ArrayList<>();
		for (final Region r : Region.values()) {
			if (r.getZone() == this) {
				list.add(r);
			}
		}
		return list;
	}
}

package it.unibo.advancedmechanisms.enums.en2;

import java.util.*;
import java.io.IO;

public class UseEnum {
	public static void main(String[] args) {
		final List<Region> list = new ArrayList<>();
		
		list.add(Region.LOMBARDIA);
		list.add(Region.PIEMONTE);
		list.add(Region.EMILIA_ROMAGNA);
		
		for (final Region r : list) {
			IO.println(r.toString());
		}
	}
}

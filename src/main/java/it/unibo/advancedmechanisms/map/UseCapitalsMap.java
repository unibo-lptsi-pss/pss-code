package it.unibo.advancedmechanisms.map;

import java.util.*;
import java.io.IO;

public class UseCapitalsMap {
	public static void main(String[] args){
		CapitalsMap cmap = new CapitalsMap();
		IO.println("Capital of Italy: "+cmap.get("Italy"));
		IO.println("Capital of Spain: "+cmap.get("Spain"));
		IO.println("All CapitalsMap: "+cmap);
		
		// Iterazione "lenta" su una mappa
		for (final String key: cmap.keySet()){
			IO.println("K,V: "+key+" "+cmap.get(key));
		}
		
		// Iterazione veloce su una mappa
		for (final Map.Entry<String, String> entry: cmap.entrySet()){
			IO.println("E: "+entry+" "+entry.getKey()+" "+entry.getValue());
		}
	}
}

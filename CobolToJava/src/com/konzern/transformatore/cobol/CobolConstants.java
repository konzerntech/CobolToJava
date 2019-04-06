package com.konzern.transformatore.cobol;

import java.util.ArrayList;
import java.util.List;

public class CobolConstants {
	
	public static  List<String> divisionIdentifier = null;
	
	static {
		divisionIdentifier = new ArrayList<>();
		divisionIdentifier.add("IDENTIFICATION DIVISION.");
		divisionIdentifier.add("DATA DIVISION.");
		divisionIdentifier.add("PROCEDURE DIVISION.");
//		divisionIdentifier.add("IDENTIFICATION DIVISION");
//		divisionIdentifier = {"IDENTIFICATION DIVISION","DATA DIVISION","PROCEDURE DIVISION"};
	}

}

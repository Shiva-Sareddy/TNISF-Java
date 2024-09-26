package com.kalki.Package.b;
import com.kalki.Package.a.ArtificialIntelligence;
import com.kalki.Package.a.ComputerScience;
import com.kalki.Package.a.CyberSecurity;
public class EngineeringBranches {

	public static void main(String[] args) {
		
		ArtificialIntelligence ai = new ArtificialIntelligence();
		ComputerScience cse = new ComputerScience();
		CyberSecurity cs = new CyberSecurity();
		com.kalki.Package.a.DataScience ds = new com.kalki.Package.a.DataScience(); // Fully Qualified Name -- Another Way to import the class name
		ai.batchID();
		cse.batchID();
		cs.batchID();
		ds.batchID();
	}

}

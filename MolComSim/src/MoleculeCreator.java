/**
 * Creates molecules according to molParams
 * and places them at a starting point
 */

import java.io.*;
import java.util.*;

public class MoleculeCreator {

	private ArrayList<MoleculeParams> molParams;
	private MolComSim simulation;
	private NanoMachine source;
	private Position position;

	public MoleculeCreator(ArrayList<MoleculeParams> mParams, MolComSim sim) {
		this.molParams = mParams;
		this.simulation = sim;
	}

	public MoleculeCreator(ArrayList<MoleculeParams> mParams, MolComSim sim, NanoMachine src) {
		this.molParams = mParams;
		this.simulation = sim;
		this.source = src;
		this.position = src.getPosition();
	}
	
	public void createMolecules() {
		for (MoleculeParams mp : molParams){
			for (int i = 0; i < mp.getNumMolecules(); i++){
				//source is not set for a molecule?
				//How do we set movement controller type?
				/*Molecule tempMol = new Molecule(new MovementController(mp.getMoleculeMovementControllerType()),
				position, mp.getRadius(), simulation, mp.getMoleculeMovementType());
				*/
			}
/*		 * basing the type to be created on moleculeParam.getMoleculeType() 
		set msgId using source.getCurrentMsgId().  The molecules 
		need to be given a movement controller based on the 
		getMolecule().getMoleculeMovementType().
		If this is none, then install null movement controller.  If this 
		is passive, then install DiffusiveRandomMovementController.  
		If this is active we need to check if there are
		any microtubules close enough to the starting position, and, if 
		there are, install the onMicrotubuleMovementController.  If not, 
		install the random movement one.

		We need to install the appropriate collision handler into the 
		movement controller as well.  This is based on whether or not 
		we want to handle collisions at all (should be a parameter, 
			just use null collision handler if no), whether or not we 
			are on a tubule (should auto-derail if get collision), 
			whether or not we want decomposing collsions (params file), etc.  
	sim.addMolecules(the molecules created);*/
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}
}
}
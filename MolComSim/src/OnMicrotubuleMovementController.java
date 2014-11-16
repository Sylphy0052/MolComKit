//package MComSim.OnMicrotubuleMovementController;

import java.io.*;
import java.util.*;

public class OnMicrotubuleMovementController extends MovementController{

	private Microtubule microtubule;

	public OnMicrotubuleMovementController(CollisionHandler collHandle, MolComSim sim, Molecule mol, Microtubule tubule) {
		super(collHandle, sim, mol);
		microtubule = tubule;
	}

	protected Position decideNextPosition() {
		/*decide next position based on microtubule, getMolecule().getPosition() and getSimulation().getSimParams.getVelRail().  Use algorithm similar to current code.
	if(molecule gets derailed) // check using getSimulation().getSimParams().getProbDRail() and random number generator, as per current code.
	{
		molecule.setMoleculeMovementController(new DiffusiveRandomMovementController(new StandardCollisionHandler(), getSimulation(), getMolecule()));		
	} 
	return the next position*/
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

}

/**
 * Moves molecules according to passive transport,
 * using a random walk
 *
 */

public class DiffusiveRandomMovementController extends MovementController{

	
	public DiffusiveRandomMovementController(CollisionHandler collHandle, MolComSim sim, Molecule mol) {
		super(collHandle, sim, mol);
	}
	
	/** Randomly selects where to move molecule based on simulation step length parameters
	 *  @param molecule The molecule to move
	 *  @return the position to move to
	 * 
	 */
	protected Position decideNextPosition(Molecule molecule) {
		//Randomly decide the next position based on current position + some delta.
		Position currentPosition = molecule.getPosition();
		double nextX = currentPosition.getX() + getSimulation().getSimParams().getMolRandMoveX();
		double nextY = currentPosition.getY() + getSimulation().getSimParams().getMolRandMoveY();
		double nextZ = currentPosition.getZ() + getSimulation().getSimParams().getMolRandMoveZ();
		Position nextPosition = new Position(nextX, nextY, nextZ);
		if (molecule.getMoleculeMovementType() == MoleculeMovementType.ACTIVE){
			for (Microtubule mt : getSimulation().getMicrotubules()){
				/*if(molecule touches the microtubule at new position){ //  use current code to determine
					MovementController tubuleMovement = new OnMicroTubuleMovementController(new OnTubuleCollisionHandler(), getSimulation(), getMolecule(), currentMicrotubule);
					molecule.setMoleculeMovementController(tubuleMovement);
					break;
				}*/
			}
		}
		return nextPosition;
	}

}

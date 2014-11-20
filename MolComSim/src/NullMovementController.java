//package MComSim.NullMovementController;

public class NullMovementController extends MovementController{

	protected Position decideNextPosition(Molecule molecule) {
		return getMolecule().getPosition();
	}

	public NullMovementController(CollisionHandler collHandle, MolComSim sim, Molecule mol) {
		super(collHandle, sim, mol);
	}

}
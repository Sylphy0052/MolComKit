/** Stores the parameters needed
 * to create a particular type of molecule
 *
 */

public class MoleculeParams {

	private int numMolecules;
	private double radius;
	private MoleculeType moleculeType;
	private MoleculeMovementType moleculeMovementType;

	public MoleculeParams(MoleculeType mType, MoleculeMovementType mMovementType, int numMols, double r) {
		this.numMolecules = numMols;
		this.moleculeMovementType = mMovementType;
		this.moleculeType = mType;
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public int getNumMolecules() {
		return numMolecules;
	}

	public MoleculeType getMoleculeType() {
		return moleculeType;
	}

	public MoleculeMovementType getMoleculeMovementType() {
		return moleculeMovementType;
	}

}

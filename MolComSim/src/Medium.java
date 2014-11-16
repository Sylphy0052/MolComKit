//package MComSim.Medium;

import java.util.*;

public class Medium {

	private double length;
	private double height;
	private double width;
	private NoiseMoleculeCreator mCreator;
	private MolComSim simulation;

	public double getLength() {
		return length;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public Medium(double l, double h, double w, ArrayList<MoleculeParams> noiseMoleculeParams, MolComSim sim) {
		this.length = l;
		this.height = h;
		this.width = w;
		this.simulation = sim;
		this.mCreator = new NoiseMoleculeCreator(noiseMoleculeParams, this.simulation);
	}

	public void createMolecules() {
		mCreator.createMolecules();
	}

	public MolComSim getSimulation() {
		return simulation;
	}

}

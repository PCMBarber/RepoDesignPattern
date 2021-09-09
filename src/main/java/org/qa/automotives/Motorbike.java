package org.qa.automotives;

public class Motorbike extends Vehicle {

	private int cubicCapacity;
	private boolean sidecar;

	public Motorbike(String maker, String colour, int cubicCapacity, boolean sidecar) {
		super("Motorbike", maker, colour);
		this.cubicCapacity = cubicCapacity;
		this.sidecar = sidecar;
	}

	public int getCubicCapacity() {
		return cubicCapacity;
	}

	public void setCubicCapacity(int cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}

	public boolean isSidecar() {
		return sidecar;
	}

	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}

	@Override
	public double calculateCost() {
		// TODO Auto-generated method stub
		return 70;
	}

}
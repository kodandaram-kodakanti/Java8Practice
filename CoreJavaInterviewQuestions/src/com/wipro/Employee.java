package com.wipro;

public class Employee {
	private int empdID;
	private String eName;
	private String eDept;

	public Employee(int empdID, String eName, String eDept) {
		super();
		this.empdID = empdID;
		this.eName = eName;
		this.eDept = eDept;
	}

	/**
	 * @return the empdID
	 */
	public int getEmpdID() {
		return empdID;
	}

	/**
	 * @param empdID the empdID to set
	 */
	public void setEmpdID(int empdID) {
		this.empdID = empdID;
	}

	/**
	 * @return the eName
	 */
	public String geteName() {
		return eName;
	}

	/**
	 * @param eName the eName to set
	 */
	public void seteName(String eName) {
		this.eName = eName;
	}

	/**
	 * @return the eDept
	 */
	public String geteDept() {
		return eDept;
	}

	/**
	 * @param eDept the eDept to set
	 */
	public void seteDept(String eDept) {
		this.eDept = eDept;
	}

	@Override
	public String toString() {
		return "Employee [empdID=" + empdID + ", eName=" + eName + ", eDept=" + eDept + "]";
	}

}

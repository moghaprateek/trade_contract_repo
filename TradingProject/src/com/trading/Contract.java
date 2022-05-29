/**
 * 
 */
package com.trading;

/**
 * @author Patrick-pc
 *
 */
public class Contract {

	private String contractId;
	private String description;
	private boolean assignedFlag;

	/**
	 * 
	 */
	public Contract() {

	}

	/**
	 * @param contractId
	 * @param description
	 * @param assignedFlag
	 */
	public Contract(String contractId, String description, boolean assignedFlag) {
		super();
		this.contractId = contractId;
		this.description = description;
		this.assignedFlag = assignedFlag;
	}

	/**
	 * @return the contractId
	 */
	public String getContractId() {
		return contractId;
	}

	/**
	 * @param contractId the contractId to set
	 */
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the assignedFlag
	 */
	public boolean isAssignedFlag() {
		return assignedFlag;
	}

	/**
	 * @param assignedFlag the assignedFlag to set
	 */
	public void setAssignedFlag(boolean assignedFlag) {
		this.assignedFlag = assignedFlag;
	}

	@Override
	public String toString() {
		return "Contract [contractId=" + contractId + ", description=" + description + "]";
	}

}

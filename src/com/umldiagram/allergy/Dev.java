package com.umldiagram.allergy;


public class Dev implements Core {
	
	private String commiterName;
	
	private String moduleEnv;
	
	private int encounterCommit;
	
	/**
	 * @return the commiterName
	 */
	public String getCommiterName() {
		return commiterName;
	}
	
	/**
	 * @param commiterName the commiterName to set
	 */
	public void setCommiterName(String commiterName) {
		this.commiterName = commiterName;
	}
	
	/**
	 * @return the moduleEnv
	 */
	public String getModuleEnv() {
		return moduleEnv;
	}
	
	/**
	 * @param moduleEnv the moduleEnv to set
	 */
	public void setModuleEnv(String moduleEnv) {
		this.moduleEnv = moduleEnv;
	}
	
	/**
	 * @return the encounterCommit
	 */
	public int getEncounterCommit() {
		return encounterCommit;
	}
	
	/**
	 * @param encounterCommit the encounterCommit to set
	 */
	public void setEncounterCommit(int encounterCommit) {
		this.encounterCommit = encounterCommit;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dev [commiterName=" + commiterName + ", moduleEnv=" + moduleEnv + ", encounterCommit=" + encounterCommit
		        + "]";
	}
	
	@Override
	public void numberofencounter() {
		System.out.println("He has commited to the codebase");
		
	}
	
	@Override
	public String patientDept() {
		String patientName="Henry Canter";
		return patientName;
	}
	
}

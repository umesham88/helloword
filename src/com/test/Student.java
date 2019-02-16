package com.test;

import java.util.Objects;

public class Student {

	private String swtudentId;
	
	private Integer swtudenMarks;
	
	private String medalType;

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(swtudentId);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return Objects.equals(swtudentId, other.swtudentId);
	}

	/**
	 * @return the swtudentId
	 */
	public String getSwtudentId() {
		return swtudentId;
	}

	/**
	 * @param swtudentId the swtudentId to set
	 */
	public void setSwtudentId(String swtudentId) {
		this.swtudentId = swtudentId;
	}

	/**
	 * @return the swtudenMarks
	 */
	public Integer getSwtudenMarks() {
		return swtudenMarks;
	}

	/**
	 * @param swtudenMarks the swtudenMarks to set
	 */
	public void setSwtudenMarks(Integer swtudenMarks) {
		this.swtudenMarks = swtudenMarks;
	}

	/**
	 * @return the medalType
	 */
	public String getMedalType() {
		return medalType;
	}

	/**
	 * @param medalType the medalType to set
	 */
	public void setMedalType(String medalType) {
		this.medalType = medalType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [swtudentId=" + swtudentId + ", swtudenMarks=" + swtudenMarks + ", medalType=" + medalType
				+ "]";
	}
}

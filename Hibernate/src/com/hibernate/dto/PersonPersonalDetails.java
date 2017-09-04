/**
 * 
 */
package com.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Ashish
 *
 */
@Entity
public class PersonPersonalDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ppd;
	private String SSN;
	private String email;
	/**
	 * @return the ppd
	 */
	public int getPpd() {
		return ppd;
	}
	/**
	 * @param ppd the ppd to set
	 */
	public void setPpd(int ppd) {
		this.ppd = ppd;
	}
	/**
	 * @return the sSN
	 */
	public String getSSN() {
		return SSN;
	}
	/**
	 * @param sSN the sSN to set
	 */
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}

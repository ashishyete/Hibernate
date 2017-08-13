/**
 * 
 */
package com.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Ashish
 *
 */

@Entity
public class UserDetails {
	
	@Id
	private int userId;
	private String username;
	
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

}

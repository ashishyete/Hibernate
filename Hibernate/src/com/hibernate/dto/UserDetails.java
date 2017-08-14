/**
 * 
 */
package com.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ashish
 *
 */

@Entity(name="userDetails")
@Table (name="USER_DETAIL")
public class UserDetails {
	
	@Id
	@Column(name="USER_ID")
	private int userId;
	@Column(name="USER_NAME")
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

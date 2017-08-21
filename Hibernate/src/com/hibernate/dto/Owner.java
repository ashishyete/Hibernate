/**
 * 
 */
package com.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author Ashish
 *
 */
@Entity
public class Owner {

	@Id
	@Column(name="OWNER_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int ownerId;
	@Column(name="OWNER_NAME")
	private String ownerName;
	@Column(name="OWNER_DESC")
	private String ownerDescription;
	@Temporal(TemporalType.DATE)
	@Column(name="OWNER_ENTRY_DATE")
	private Date ownerEntryDate;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name ="carName",column =@Column(name="CAR_NAME")),
		@AttributeOverride(name ="carType",column =@Column(name="CAR_TYPE")),
		@AttributeOverride(name ="carValue",column =@Column(name="CAR_VALUE")),
		
	})
	private OwnerCars ownerCars;
	
	@ElementCollection
	@GenericGenerator(name="sequence-gen",strategy="sequence")
	@JoinTable(name="OWNER_CARS",joinColumns=@JoinColumn(name="CARS_ID"))
	@CollectionId(columns = { @Column(name="CAR_PRI_ID") }, generator = "sequence-gen", type = @Type(type="long"))
	Collection<OwnerCars> ownerCarsSet = new ArrayList<>();
	
	
	/**
	 * @return the ownerId
	 */
	public int getOwnerId() {
		return ownerId;
	}
	/**
	 * @param ownerId the ownerId to set
	 */
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}
	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	/**
	 * @return the ownerDescription
	 */
	public String getOwnerDescription() {
		return ownerDescription;
	}
	/**
	 * @param ownerDescription the ownerDescription to set
	 */
	public void setOwnerDescription(String ownerDescription) {
		this.ownerDescription = ownerDescription;
	}
	/**
	 * @return the ownerEntryDate
	 */
	public Date getOwnerEntryDate() {
		return ownerEntryDate;
	}
	/**
	 * @param ownerEntryDate the ownerEntryDate to set
	 */
	public void setOwnerEntryDate(Date ownerEntryDate) {
		this.ownerEntryDate = ownerEntryDate;
	}
	/**
	 * @return the ownerCars
	 */
	public OwnerCars getOwnerCars() {
		return ownerCars;
	}
	/**
	 * @param ownerCars the ownerCars to set
	 */
	public void setOwnerCars(OwnerCars ownerCars) {
		this.ownerCars = ownerCars;
	}
	/**
	 * @return the ownerCarsSet
	 */
	public Collection<OwnerCars> getOwnerCarsSet() {
		return ownerCarsSet;
	}
	/**
	 * @param ownerCarsSet the ownerCarsSet to set
	 */
	public void setOwnerCarsSet(Collection<OwnerCars> ownerCarsSet) {
		this.ownerCarsSet = ownerCarsSet;
	}

	
}

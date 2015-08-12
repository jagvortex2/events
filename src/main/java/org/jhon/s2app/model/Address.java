/**
 * 
 */
package org.jhon.s2app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author Jhonatan
 *
 */
@Entity @Table(name="ADDRESS", schema="s2app")
@PrimaryKeyJoinColumn(name="LOCATION_PK")
public class Address extends Location implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	String zipCode;
	String address;
	/**
	 * @return the zipCode
	 */
	@Column(name="ZIPCODE")
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * @return the address
	 */
	@Column(name="ADDRESS")
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the zipCode
	 */

	
	
}

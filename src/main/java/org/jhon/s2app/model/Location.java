/**
 * 
 */
package org.jhon.s2app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;


/**
 * @author Jhonatan
 *
 */

@Entity @Table(name="LOCATION", schema="s2app")
@Inheritance(strategy=InheritanceType.JOINED)
public class Location implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	long id;
	String city;
	String name;
	String state;
	/**
	 * @return the id
	 */
	@Id @GeneratedValue(strategy=GenerationType.AUTO) @Column(name="ID")
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the city
	 */
	@Column(name="CITY")
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the name
	 */
	@Column(name="NAME")
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the state
	 */
	@Column(name="STATE", insertable=false, updatable=false)
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	

}

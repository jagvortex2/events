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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * @author Jhonatan
 *
 */
@Entity @Table(name="CONTESTANT", schema="s2app")
public class Contestant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	long id;
	String name;
	String description;
	 Event event;
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
	 * @return the description
	 */
	@Column(name="DESCRIPTION")
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
	 * @return the eventFK
	 */
	@ManyToOne @JoinColumn(name="EVENT_FK")
	public Event getEvent() {
		return event;
	}
	/**
	 * @param eventFK the eventFK to set
	 */
	public void setEvent(Event event) {
		this.event = event;
	}
	
	

}

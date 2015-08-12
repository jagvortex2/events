/**
 * 
 */
package org.jhon.s2app.model;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author Jhonatan
 *
 */
@Entity @Table(name="VOTER", schema="s2app")
public class Voter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	long id;
	Date enrollmentTime;
	Date votedRecordedTime;
	Contestant votedForOption;
	User user;
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
	 * @return the enrollmentTime
	 */
	@Column(name="ENROLLMENT_TIME") @Temporal(TemporalType.TIMESTAMP)
	public Date getEnrollmentTime() {
		return enrollmentTime;
	}
	/**
	 * @param enrollmentTime the enrollmentTime to set
	 */
	public void setEnrollmentTime(Date enrollmentTime) {
		this.enrollmentTime = enrollmentTime;
	}
	/**
	 * @return the votedRecordedTime
	 */
	@Column(name="VOTED_ON", nullable=true) @Temporal(TemporalType.TIMESTAMP)
	public Date getVotedRecordedTime() {
		return votedRecordedTime;
	}
	/**
	 * @param votedRecordedTime the votedRecordedTime to set
	 */
	public void setVotedRecordedTime(Date votedRecordedTime) {
		this.votedRecordedTime = votedRecordedTime;
	}
	/**
	 * @return the votedForOption
	 */
	@ManyToOne @JoinColumn(name="CONTESTANT_FK", nullable=true)
	public Contestant getVotedForOption() {
		return votedForOption;
	}
	/**
	 * @param votedForOption the votedForOption to set
	 */
	public void setVotedForOption(Contestant votedForOption) {
		this.votedForOption = votedForOption;
	}
	/**
	 * @return the user
	 */
	@ManyToOne @JoinColumn(name="USER_FK")
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @return the event
	 */
	
	@ManyToOne @JoinColumn(name="EVENT_FK")
	public Event getEvent() {
		return event;
	}
	/**
	 * @param event the event to set
	 */
	public void setEvent(Event event) {
		this.event = event;
	}
	
	
	
	
	
	
}

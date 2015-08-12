/**
 * 
 */
package org.jhon.s2app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author Jhonatan
 *
 */
@Entity @Table(name="EVENT", schema="s2app")
public class Event implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	long id;
	int duration;
	Date lastUpdate;
	int tzOffset;
	Date votingStarts;
	String name;
	Date startTime;
	String state;
	Location locationFK;
	
	Set<Voter> voters = new HashSet<Voter>();
	List<Contestant> options = new ArrayList<Contestant>();
	Progress status;
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
	 * @return the duration
	 */
	@Column(name="DURATION")
	public int getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	/**
	 * @return the lastUpdate
	 */
	@Column(name="LAST_UPDATE") @Temporal(TemporalType.TIMESTAMP)
	public Date getLastUpdate() {
		return lastUpdate;
	}
	/**
	 * @param lastUpdate the lastUpdate to set
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	/**
	 * @return the tzOffset
	 */
	@Column(name="TZ_OFFSET")
	public int getTzOffset() {
		return tzOffset;
	}
	/**
	 * @param tzOffset the tzOffset to set
	 */
	public void setTzOffset(int tzOffset) {
		this.tzOffset = tzOffset;
	}
	/**
	 * @return the votingStarts
	 */
	@Column(name="VOTING_STARTS") @Temporal(TemporalType.TIMESTAMP)
	public Date getVotingStarts() {
		return votingStarts;
	}
	/**
	 * @param votingStarts the votingStarts to set
	 */
	public void setVotingStarts(Date votingStarts) {
		this.votingStarts = votingStarts;
	}
	
	@OneToMany(mappedBy="event", cascade=CascadeType.ALL)
	Set<Voter> getVoters(){
		return voters;
	}
	
	public void setVoters(Set<Voter> voters){
		this.voters = voters;
	}
	
	
	public void addVoter(Voter v){
		v.setEvent(this);
		voters.add(v);
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
	 * @return the startTime
	 */
	@Column(name="START_TIME") @Temporal(TemporalType.TIMESTAMP)
	public Date getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return the state
	 */
	@Column(name="STATE")
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the locationFK
	 */
	@ManyToOne(cascade=CascadeType.ALL) @Column(name="LOCATION_FK")
	public Location getLocationFK() {
		return locationFK;
	}
	/**
	 * @param locationFK the locationFK to set
	 */
	public void setLocationFK(Location locationFK) {
		this.locationFK = locationFK;
	}
	
	@OneToMany(mappedBy="event", cascade=CascadeType.ALL)
	public List<Contestant> getOptions(){
		return options;
	}
	
	public void setOptions(List<Contestant> options){
		this.options = options;
	}
	
	public void addOption(Contestant c){
		c.setEvent(this);
		options.add(c);
	}
	
	@Column(name="STATE") @Enumerated(EnumType.STRING)
	public Progress getStatus(){
		return status;
	}
	
	
	public void setStatus(Progress status){
		this.status = status;
	}
}

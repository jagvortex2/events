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
import javax.persistence.JoinColumn;
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

	   
	    private Set<Voter> voters = new HashSet<Voter>();
	    private Location location;
	    private List<Contestant> options = new ArrayList<Contestant>();
	    private Progress status;

	    @Id @GeneratedValue(strategy=GenerationType.AUTO) @Column(name="ID")
	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }

	    @Column(name="NAME")
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    @Column(name="START_TIME") @Temporal(TemporalType.TIMESTAMP)
	    public Date getStartTime() {
	        return startTime;
	    }

	    public void setStartTime(Date startTime) {
	        this.startTime = startTime;
	    }

	    @Column(name="DURATION")
	    public int getDuration() {
	        return duration;
	    }

	    public void setDuration(int duration) {
	        this.duration = duration;
	    }

	    @Column(name="TZ_OFFSET")
	    public int getTzOffset() {
	        return tzOffset;
	    }

	    public void setTzOffset(int timeZoneOffset) {
	        this.tzOffset = timeZoneOffset;
	    }

	    @Column(name="VOTING_STARTS") @Temporal(TemporalType.TIMESTAMP)
	    public Date getVotingStarts() {
	        return votingStarts;
	    }

	    public void setVotingStarts(Date votingStartTime) {
	        this.votingStarts = votingStartTime;
	    }

	    @Column(name="LAST_UPDATE") @Temporal(TemporalType.TIMESTAMP)
	    public Date getLastUpdate() {
	        return lastUpdate;
	    }

	    public void setLastUpdate(Date lastUpdateTime) {
	        this.lastUpdate = lastUpdateTime;
	    }

	    @OneToMany(mappedBy="event",cascade=CascadeType.ALL)
	    public Set<Voter> getVoters() {
	        return voters;
	    }

	    public void setVoters(Set<Voter> voters) {
	        this.voters = voters;
	    }

	    public void addVoter( Voter v ) {
	        v.setEvent(this);
	        voters.add(v);
	    }

	    @ManyToOne(cascade=CascadeType.ALL) @JoinColumn(name="LOCATION_FK")
	    public Location getLocation() {
	        return location;
	    }

	    public void setLocation(Location location) {
	        this.location = location;
	    }

	    @OneToMany(mappedBy="event",cascade=CascadeType.ALL)
	    public List<Contestant> getOptions() {
	        return options;
	    }

	    public void setOptions(List<Contestant> options) {
	        this.options = options;
	    }

	    public void addOption( Contestant c ) {
	        c.setEvent(this);
	        options.add(c);
	    }

	    @Column(name="STATE") @Enumerated(EnumType.STRING)
	    public Progress getStatus() {
	        return status;
	    }

	    public void setStatus(Progress status) {
	        this.status = status;
	    }
}

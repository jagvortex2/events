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
@Entity @Table(name="BROADCAST", schema="s2app")
@PrimaryKeyJoinColumn(name="LOCATION_PK")
public class Broadcast extends Location implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String stationIdentifier;
	String network;
	/**
	 * @return the stationIdentifier
	 */
	@Column(name="CALLSIGN")
	public String getStationIdentifier() {
		return stationIdentifier;
	}
	/**
	 * @param stationIdentifier the stationIdentifier to set
	 */
	public void setStationIdentifier(String stationIdentifier) {
		this.stationIdentifier = stationIdentifier;
	}
	/**
	 * @return the network
	 */
	@Column(name="NETWORK")
	public String getNetwork() {
		return network;
	}
	/**
	 * @param network the network to set
	 */
	public void setNetwork(String network) {
		this.network = network;
	}
	
	
	
	
	

}

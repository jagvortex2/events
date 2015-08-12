/**
 * 
 */
package org.jhon.s2app.model;





import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * @author Jhonatan
 *
 */
@Entity @Table(name="APP_USER", schema="s2app")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//data fields
	String email; 
	String firstName; 
	String lastName;
	String password;
	byte[] portrait;
	
	
	/**
	 * @return the portrait
	 */
	@Lob @Column(name="PORTRAIT")
	public byte[] getPortrait() {
		return portrait;
	}



	/**
	 * @param portrait the portrait to set
	 */
	public void setPortrait(byte[] portrait) {
		this.portrait = portrait;
	}



	@Column(name="FIRST_NAME") 
	public String getFirstName() {
		return firstName;
	}


	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
    @Column(name="LAST_NAME")
	public String getLastName() {
		return lastName;
	}


	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
    @Column(name="USER_PASSWORD")  
	public String getPassword() {
		return password;
	}


	
	public void setPassword(String password) {
		this.password = password;
	}

	

	public void setEmail(String email) {
		this.email = email;
	}


	@Id @Column(name="EMAIL")
	public String getEmail(){
		return email;
	}
}

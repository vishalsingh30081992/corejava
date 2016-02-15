package com.xebia.training;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {
	private int id;
	private int houseno,sector;
	private String city;
	private int pincode;
	private String state;
	private String landmark;
	addresstype t;
	private String email_id;
	enum addresstype
	{
		CORRESPONDANCE,
		PERMANENT,
		TEMPORARY;
	}

	public Address() {
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the houseno
	 */
	public int getHouseno() {
		return houseno;
	}
	/**
	 * @param houseno the houseno to set
	 */
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	/**
	 * @return the sector
	 */
	public int getSector() {
		return sector;
	}
	/**
	 * @param sector the sector to set
	 */
	public void setSector(int sector) {
		this.sector = sector;
	}
	/**
	 * @return the city
	 */
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
	 * @return the pincode
	 */
	public int getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	/**
	 * @return the state
	 */
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
	 * @return the landmark
	 */
	public String getLandmark() {
		return landmark;
	}
	/**
	 * @param landmark the landmark to set
	 */
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	/**
	 * @return the phone
	 */
	
	/**
	 * @return the email_id
	 */
	public String getEmail_id() {
		return email_id;
	}
	/**
	 * @param email_id the email_id to set
	 */
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [id=" + id + ", houseno=" + houseno + ", sector="
				+ sector + ", city=" + city + ", pincode=" + pincode
				+ ", state=" + state + ", " + ", landmark="
				+ landmark +  ", email_id=" + email_id+", address type="
				+ t.name()+"]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Address address = (Address) o;

		if (id != address.id) return false;
		if (houseno != address.houseno) return false;
		if (sector != address.sector) return false;
		if (pincode != address.pincode) return false;
		if (!city.equals(address.city)) return false;
		if (!state.equals(address.state)) return false;
		if (!landmark.equals(address.landmark)) return false;
		if (t != address.t) return false;
		return email_id.equals(address.email_id);

	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + houseno;
		result = 31 * result + sector;
		result = 31 * result + city.hashCode();
		result = 31 * result + pincode;
		result = 31 * result + state.hashCode();
		result = 31 * result + landmark.hashCode();
		result = 31 * result + t.hashCode();
		result = 31 * result + email_id.hashCode();
		return result;
	}

	public Address(int id, int houseno, int sector, String city, int pincode,
				   String state, String landmark,
				   String email_id, addresstype add) {
		super();
		this.id = id;
		this.houseno = houseno;
		this.sector = sector;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		
		this.landmark = landmark;
		
		this.email_id = email_id;
		this.t=add;
		
	}

}
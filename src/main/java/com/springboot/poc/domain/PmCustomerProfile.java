package com.springboot.poc.domain;

// Generated Aug 24, 2015 10:31:44 AM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * PmCustomerProfile generated by hbm2java
 */
public class PmCustomerProfile implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3496495812866476343L;
	private long pmCustomerProfileId;
	private PmCustomerLogin pmCustomerLogin;
	private String pmCustomerAddress;
	private String pmCustomerSex;
	private Integer pmCustomerAge;
	private Date pmCustomerBirthdate;
	private Date pmCustomerAnniversary;
	private String pmCustomerLocality;
	private String pmCustomerCity;
	private String pmCustomerState;
	private String pmCustomerCountry;

	public PmCustomerProfile() {
	}

	public PmCustomerProfile(long pmCustomerProfileId, PmCustomerLogin pmCustomerLogin) {
		this.pmCustomerProfileId = pmCustomerProfileId;
		this.pmCustomerLogin = pmCustomerLogin;
	}

	public PmCustomerProfile(long pmCustomerProfileId, PmCustomerLogin pmCustomerLogin, String pmCustomerAddress,
			String pmCustomerSex, Integer pmCustomerAge, Date pmCustomerBirthdate, Date pmCustomerAnniversary,
			String pmCustomerLocality, String pmCustomerCity, String pmCustomerState,
			String pmCustomerCountry) {
		this.pmCustomerProfileId = pmCustomerProfileId;
		this.pmCustomerLogin = pmCustomerLogin;
		this.pmCustomerAddress = pmCustomerAddress;
		this.pmCustomerSex = pmCustomerSex;
		this.pmCustomerAge = pmCustomerAge;
		this.pmCustomerBirthdate = pmCustomerBirthdate;
		this.pmCustomerAnniversary = pmCustomerAnniversary;
		this.pmCustomerLocality = pmCustomerLocality;
		this.pmCustomerCity = pmCustomerCity;
		this.pmCustomerState = pmCustomerState;
		this.pmCustomerCountry = pmCustomerCountry;
	}

	public long getPmCustomerProfileId() {
		return this.pmCustomerProfileId;
	}

	public void setPmCustomerProfileId(long pmCustomerProfileId) {
		this.pmCustomerProfileId = pmCustomerProfileId;
	}

	public PmCustomerLogin getPmCustomerLogin() {
		return this.pmCustomerLogin;
	}

	public void setPmCustomerLogin(PmCustomerLogin pmCustomerLogin) {
		this.pmCustomerLogin = pmCustomerLogin;
	}

	public String getPmCustomerAddress() {
		return this.pmCustomerAddress;
	}

	public void setPmCustomerAddress(String pmCustomerAddress) {
		this.pmCustomerAddress = pmCustomerAddress;
	}

	public String getPmCustomerSex() {
		return this.pmCustomerSex;
	}

	public void setPmCustomerSex(String pmCustomerSex) {
		this.pmCustomerSex = pmCustomerSex;
	}

	public Integer getPmCustomerAge() {
		return this.pmCustomerAge;
	}

	public void setPmCustomerAge(Integer pmCustomerAge) {
		this.pmCustomerAge = pmCustomerAge;
	}

	public Date getPmCustomerBirthdate() {
		return this.pmCustomerBirthdate;
	}

	public void setPmCustomerBirthdate(Date pmCustomerBirthdate) {
		this.pmCustomerBirthdate = pmCustomerBirthdate;
	}

	public Date getPmCustomerAnniversary() {
		return this.pmCustomerAnniversary;
	}

	public void setPmCustomerAnniversary(Date pmCustomerAnniversary) {
		this.pmCustomerAnniversary = pmCustomerAnniversary;
	}

	public String getPmCustomerLocality() {
		return this.pmCustomerLocality;
	}

	public void setPmCustomerLocality(String pmCustomerLocality) {
		this.pmCustomerLocality = pmCustomerLocality;
	}

	public String getPmCustomerCity() {
		return this.pmCustomerCity;
	}

	public void setPmCustomerCity(String pmCustomerCity) {
		this.pmCustomerCity = pmCustomerCity;
	}

	public String getPmCustomerState() {
		return this.pmCustomerState;
	}

	public void setPmCustomerState(String pmCustomerState) {
		this.pmCustomerState = pmCustomerState;
	}

	public String getPmCustomerCountry() {
		return this.pmCustomerCountry;
	}

	public void setPmCustomerCountry(String pmCustomerCountry) {
		this.pmCustomerCountry = pmCustomerCountry;
	}

}
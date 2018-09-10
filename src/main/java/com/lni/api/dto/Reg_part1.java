package com.lni.api.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Reg_part1 {

	

	@Id
	@Column(name="Reporter_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;

	@Column(name="reporter_firstname")
	private String userFirstName;
	
	@Column(name="reporter_lastname")
	private String userLastName;
	
	@Column(name="reporter_fathername")
	private String userFather;
	
	@Column(name="reporter_email")
	private String userEmail;
	
	@Column(name="reporter_contact")
	private long userContact;

	@Column(name="reporter_dob")
	@Temporal(TemporalType.DATE)
	private Date userDob;
	
	@Column(name="reporter_gender")
	private String userGender;
	
	@Column(name="reporter_marital")
	private String userMarital;
	
	@Column(name="reporter_education")
	private String userEducation;
	
	@Column(name="reporter_Experience")
	private String userExperience;
	
	@Column(name="reporter_aadhar")
	private long userAadhar;
	
	@Column(name="reporter_pan")
	private String userPan;
	
	
	
}

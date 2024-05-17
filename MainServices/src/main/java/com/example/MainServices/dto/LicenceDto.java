package com.example.MainServices.dto;

import java.util.UUID;

import com.example.MainServices.enumuration.ExpiredStatus;
import com.example.MainServices.enumuration.Status;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LicenceDto {

	private UUID id;
	
	private String companyName;
	
	private String companyAddress;
	
	private long contactNumber;
	
	private String mailId;
	
	private String graceperiod;
	
	private String expiryDate;
	
	private Status status;
	
	private ExpiredStatus expiredStatus;
	
	private String activeationDate ;
	
	private String licenceKey;
	
}

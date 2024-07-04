package com.idbiintech.visitormgmtsystem.model;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import org.springframework.stereotype.Component;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="tbl_refresh_token")
@Component
public class RefreshToken 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String token;
	
	private Instant expiry;
	
	private LocalDateTime curtime;
	
	private String user;
	
	private Integer empid; 
	
	private String emailid;




	
	
	

} 

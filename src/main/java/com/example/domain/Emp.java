package com.example.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {

	public enum Gender{
		M,F;
	}
	
	
	@Id										// @Entity + @Id 는 필수 사용할 것.
	@Column(precision=4, length=4)
 	private BigInteger empno;
	
	@Column(length=10, nullable=false)
 	private String ename;
	
	@Enumerated(EnumType.STRING)
	@Column(length=1)
 	private Gender gender;
	
 	@Column(length=9)
 	private String job;
 	
	@Column(precision=4, length=4)
 	private BigDecimal mgr;
	
	@Temporal(TemporalType.DATE)
 	@Column(nullable=false)
 	private Date hiredate;
	
 	@Column(precision=7, scale=2)
 	private BigDecimal sal;
 	
 	@Column(precision=7, scale=2)
 	private BigDecimal comm;
 	
 	@Column(precision=2, length=2)
 	private BigDecimal deptno; 
	
}

package com.example.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Emp;

public interface EmpRepository extends CrudRepository<Emp, BigInteger> 		// < Dept , Dept 의 @Id(Primary Key)의 Type > 
{

}

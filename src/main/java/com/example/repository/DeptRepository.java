package com.example.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Dept;

public interface DeptRepository extends CrudRepository<Dept, BigInteger> 		// < Dept , Dept 의 @Id(Primary Key)의 Type > 
{

}

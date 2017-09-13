package com.example.repository;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.List;
import java.util.function.Consumer;

import javax.inject.Inject;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Dept;


@RunWith(SpringRunner.class)				// JUnit Annotation
//@SpringBootTest
//@ActiveProfiles("oracle")					// Main Application 기동 옵션 중 프로필 사용 시 필요.
//@ActiveProfiles("mysql")					// Main Application 기동 옵션 중 프로필 사용 시 필요.
@DataJpaTest									// In Memory DataBase 필요. pom.xml
public class DeptRepositoryTest {

	@Inject
	DeptRepository deptRepository;
	
	@Test
	public void test1(){
		System.out.println(deptRepository.getClass());
		deptRepository.save(new Dept(new BigInteger("10"),"경리부","서울"));
		deptRepository.save(new Dept(new BigInteger("10"),"경리예쁘다","서울XXX"));
		
		System.out.println(deptRepository.findOne(new BigInteger("10")));
		
		assertEquals(new Dept(new BigInteger("10"),"경리예쁘다","서울XXX"),deptRepository.findOne(new BigInteger("10")));
	}

}

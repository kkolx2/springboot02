package com.example.repository;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.inject.Inject;

import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.hibernate.mapping.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Emp;
import com.example.domain.Emp.Gender;


@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("mysql-ec2")
//@DataJpaTest
public class EmpRepositoryTest {

	
	@Inject
	EmpRepository empRepository;
	
//	INSERT INTO EMP VALUES(1001, '김사랑','F', '사원', 1013, to_date('2007-03-01','yyyy-mm-dd'), 300, NULL, 20);
//	INSERT INTO EMP VALUES(1002, '한예슬','F', '대리', 1005, to_date('2007-04-02','yyyy-mm-dd'), 250,   80, 30);
//	INSERT INTO EMP VALUES(1003, '오지호','M', '과장', 1005, to_date('2005-02-10','yyyy-mm-dd'), 500,  100, 30);
//	INSERT INTO EMP VALUES(1004, '이병헌','M', '부장', 1008, to_date('2003-09-02','yyyy-mm-dd'), 600, NULL, 20);
//	INSERT INTO EMP VALUES(1005, '신동협','M', '과장', 1005, to_date('2005-04-07','yyyy-mm-dd'), 450,  200, 30);
//	INSERT INTO EMP VALUES(1006, '장동건','M', '부장', 1008, to_date('2003-10-09','yyyy-mm-dd'), 480, NULL, 30);
//	INSERT INTO EMP VALUES(1007, '이문세','M', '부장', 1008, to_date('2004-01-08','yyyy-mm-dd'), 520, NULL, 10);
//	INSERT INTO EMP VALUES(1008, '감우성','M', '차장', 1003, to_date('2004-03-08','yyyy-mm-dd'), 500,    0, 30);
//	INSERT INTO EMP VALUES(1009, '안성기','M', '사장', NULL, to_date('1996-10-04','yyyy-mm-dd'),1000, NULL, 20);
//	INSERT INTO EMP VALUES(1010, '이병헌','M', '과장', 1003, to_date('2005-04-07','yyyy-mm-dd'), 500, NULL, 10);
//	INSERT INTO EMP VALUES(1011, '조향기','F', '사원', 1007, to_date('2007-03-01','yyyy-mm-dd'), 280, NULL, 30);
//	INSERT INTO EMP VALUES(1012, '강혜정','F', '사원', 1006, to_date('2007-08-09','yyyy-mm-dd'), 300, NULL, 20);
//	INSERT INTO EMP VALUES(1013, '박중훈','M', '부장', 1003, to_date('2002-10-09','yyyy-mm-dd'), 560, NULL, 20);
//	INSERT INTO EMP VALUES(1014, '조인성','M', '사원', 1006, to_date('2007-11-09','yyyy-mm-dd'), 250, NULL, 10);
	@Before
	public void before() throws ParseException{
		SimpleDateFormat f = new SimpleDateFormat("yyyy-mm-dd");
		empRepository.save(new Emp(new BigInteger("1001"), "김사랑", Gender.F, "사원", 1013, f.parse("2007-03-01"),new BigDecimal("300"), null, 20));
		empRepository.save(new Emp(new BigInteger("1002"), "한예슬", Gender.F, "대리", 1005, f.parse("2007-04-02"),new BigDecimal("250"), new BigDecimal("80"), 30));
		empRepository.save(new Emp(new BigInteger("1003"), "오지호", Gender.M, "과장", 1005, f.parse("2005-02-10"),new BigDecimal("500"), new BigDecimal("100"), 30));
		empRepository.save(new Emp(new BigInteger("1004"), "이병헌", Gender.M, "부장", 1008, f.parse("2003-09-02"),new BigDecimal("600"), null, 20));
		empRepository.save(new Emp(new BigInteger("1005"), "신동엽", Gender.M, "과장", 1005, f.parse("2005-04-07"),new BigDecimal("450"), new BigDecimal("200"), 30));
		empRepository.save(new Emp(new BigInteger("1006"), "장동건", Gender.M, "부장", 1008, f.parse("2003-10-09"),new BigDecimal("480"), null, 30));
		empRepository.save(new Emp(new BigInteger("1007"), "이문세", Gender.M, "부장", 1008, f.parse("2004-01-08"),new BigDecimal("520"), null, 10));
		empRepository.save(new Emp(new BigInteger("1008"), "감우성", Gender.M, "차장", 1003, f.parse("2004-03-08"),new BigDecimal("500"), new BigDecimal("0"), 30));
		empRepository.save(new Emp(new BigInteger("1009"), "안성기", Gender.M, "사장", null, f.parse("1996-10-04"),new BigDecimal("1000"), null, 20));
		empRepository.save(new Emp(new BigInteger("1010"), "이병헌", Gender.M, "과장", 1003, f.parse("2005-04-07"),new BigDecimal("500"), null, 10));
		empRepository.save(new Emp(new BigInteger("1011"), "조향기", Gender.F, "사원", 1007, f.parse("2007-03-01"),new BigDecimal("280"), null, 30));
		empRepository.save(new Emp(new BigInteger("1012"), "강혜정", Gender.F, "사원", 1006, f.parse("2002-10-09"),new BigDecimal("300"), null, 20));
		empRepository.save(new Emp(new BigInteger("1013"), "박중훈", Gender.M, "부장", 1003, f.parse("2007-11-09"),new BigDecimal("560"), null, 20));
		empRepository.save(new Emp(new BigInteger("1014"), "조인성", Gender.M, "사원", 1006, f.parse("2007-03-01"),new BigDecimal("250"), null, 10));
		
	}
	
	@Test
	public void test() {
		empRepository.findAll().forEach(e -> {
			System.out.println(e);
		});
	}
	@Test
	public void deleteAll() {
		empRepository.deleteAll();
		
//		assertThat(empRepository.findAll(), CoreMatchers.is(Collection.)) );
	}

}

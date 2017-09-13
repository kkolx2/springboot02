package com.example.mapper;

import static org.junit.Assert.*;

import java.util.List;
import java.util.function.Consumer;

import javax.inject.Inject;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Dept;
import com.example.domain.Emp;


@RunWith(SpringRunner.class)				// JUnit Annotation
@SpringBootTest
@ActiveProfiles("oracle")					// Main Application 기동 옵션 중 프로필 사용 시 필요.
public class EmpMapperTest {

	@Inject
	EmpMapper empMapper;
	
	@Test
	public void selectAll() {
		
		List<Emp> list = empMapper.selectAll();
		assertThat(list, is(notNullValue()));
		
		System.out.println(empMapper.getClass());
//		list.forEach(new Consumer<Emp>() {
//			@Override
//			public void accept(Emp t) {
//				System.out.println(t);				
//			}
//		});
		list.forEach(e ->{
			System.out.println(e);
		});
	}

}

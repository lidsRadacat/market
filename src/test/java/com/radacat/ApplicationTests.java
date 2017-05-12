//package com.radacat;
//
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.radacat.dto.UserRolePermission;
//import com.radacat.mapper.UserRoleMapper;
//import com.radacat.service.AreaService;
//
///**
// * @Description: TODO
// * @author: 李大双
// * @date: 2017年5月6日 上午10:12:32
// * @version: V1.0
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
//public class ApplicationTests {
//	
//	@Autowired
//	private UserRoleMapper userRoleMapper;
//	
//	@Autowired
//	private AreaService areaService;
//	
//	@Test
//	public void findRolePermission(){
//		UserRolePermission findUserRolePermission = userRoleMapper.findUserRolePermission(1L);
//		System.out.println(findUserRolePermission);
//	}
//	
//	@Test
//	public void areaTest(){
//		areaService.findInMySQL();
//	}
//	
//}

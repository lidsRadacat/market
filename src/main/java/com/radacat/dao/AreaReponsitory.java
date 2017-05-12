package com.radacat.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.radacat.domain.Area;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月8日 下午10:31:52
 * @version: V1.0
 */
@Repository
public interface AreaReponsitory extends JpaRepository<Area,Long>{
	@Query("select DISTINCT a.province from Area a")
	List<String> findProvince();
	
	@Query("select DISTINCT a.city from Area a where a.province=:province")
	List<String> findCity(@Param("province") String province);
	
	@Query("select CONCAT(a.county,';',a.id) from Area a where a.city=:city")
	List<String> findCounty(@Param("city") String city);
//	List<Integer> findAreaId(@Param("city") String city);
}

package com.radacat.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.radacat.domain.Role;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月7日 上午11:47:44
 * @version: V1.0
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	@Query("from Role r where r.active='t'")
	List<Role> findAllListRole();
}

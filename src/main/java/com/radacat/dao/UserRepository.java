package com.radacat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.radacat.domain.User;


/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/3/23 下午2:34.
 * @blog http://blog.didispace.com
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("from User u where u.login=:login")
    User findUserByLogin(@Param("login") String login);
}

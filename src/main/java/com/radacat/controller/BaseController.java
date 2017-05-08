package com.radacat.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.radacat.vo.UserVo;

/**
 * @Description: TODO
 * @author: 李大双
 * @date: 2017年5月1日 上午1:18:28
 * @version: V1.0
 */
public abstract class BaseController {
	
	public void setSession(HttpSession session,String key,Object value){
		session.setAttribute(key, value);
	}
	
	public Object getSession(HttpSession session,String key){
		return session.getAttribute(key);
	}
	
	public void setUser(HttpSession session,UserVo userVo){
		setSession(session, "userVo", userVo);
	}
	
	public UserVo getUser(HttpSession session){
		return (UserVo)getSession(session, "userVo");
	}
	
	public Long getUid(HttpServletRequest request){
		return getUser(request.getSession()).getUser().getId();
	}
	
	public void invalidate(HttpSession session){
		session.invalidate();
	}

	public void removeUser(HttpSession session){
		session.removeAttribute("userVo");
	}
		
}

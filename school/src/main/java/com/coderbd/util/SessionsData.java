package com.coderbd.util;

import java.io.Serializable;
import java.net.InetAddress;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import com.coderbd.entity.User;
import com.coderbd.repository.UserRepository;

@ManagedBean
@Scope("session")
@Controller(value = "sessionsData")
public class SessionsData implements Serializable {

	private static final long serialVersionUID = 1L;


	private User beanUsers;



	@Autowired
	public UserRepository userRepository;
	
	
	public void findUserInfo() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		String username = auth.getName();

		FacesContext context = FacesContext.getCurrentInstance();

		try {
			beanUsers=userRepository.findByUsername(username);
			context.getExternalContext().getSessionMap().put("username", username);
		if(username != "" ) {
			context.getExternalContext().getSessionMap().put("nameOfUser",beanUsers.getName());

		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public String getIp() {
		FacesContext context1 = FacesContext.getCurrentInstance();

		HttpServletRequest request = (HttpServletRequest) context1.getExternalContext().getRequest();

		String ipAddress = request.getRemoteAddr();
		return ipAddress;

	}

	public String findIPAddress(String x) throws Exception {
		InetAddress addr = InetAddress.getByName(x);
		return addr.getHostAddress();
	}

	
	public User getBeanUsers() {
		return beanUsers;
	}

	public void setBeanUsers(User beanUsers) {
		this.beanUsers = beanUsers;
	}


	
}

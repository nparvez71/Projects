package com.coderbd.util;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * 
 * @author Mohammad Rajaul Islam
 *
 */

public class CommonUtility {
	
	public static String getUserNickName() {

		FacesContext context = FacesContext.getCurrentInstance();

		String nickname = context.getExternalContext().getSessionMap().get("nameOfUser").toString();

		return nickname;
	}
	
	
	
	
	public static String getInstituteID() {

		FacesContext context = FacesContext.getCurrentInstance();

		String institueID = context.getExternalContext().getSessionMap().get("InstituteId").toString();

		return institueID;

	}

	public static String getUserID() {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		String userID = auth.getName();
		;

		return userID;

	}

	public static String getInstituteAddress() {

		FacesContext context = FacesContext.getCurrentInstance();

		String institueAddress = context.getExternalContext().getSessionMap().get("InstituteAddress").toString();

		return institueAddress;

	}

	public static String getInstituteName() {

		FacesContext context = FacesContext.getCurrentInstance();

		String institueName = context.getExternalContext().getSessionMap().get("InstituteName").toString();

		return institueName;

	}

	public static String getInstitutLogo() {

		FacesContext context = FacesContext.getCurrentInstance();

		String institueLogo = context.getExternalContext().getSessionMap().get("InstituteLogo").toString();

		return institueLogo;

	}

	public static String getAcademicYear() {

		FacesContext context = FacesContext.getCurrentInstance();

		String academicYear = context.getExternalContext().getSessionMap().get("AcademicYear").toString();

		return academicYear;

	}

	public static String getIpexecuted() {

		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();

		String remothost = request.getRemoteHost();

		return remothost;

	}
}

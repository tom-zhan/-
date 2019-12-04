package cn.tedu.controller;

import javax.servlet.http.HttpSession;

public class ControllerBase {
	
	private final String URL="http://localhost:8001"; 
	
	public final Integer SUCCEES=200;
	
	public final Integer FAILED=500;
	
	/**
	 * ��Session��ȡ��ǰ��¼���û�id
	 * @param session HttpSession����
	 * @return ��ǰ��¼���û�id
	 */
	protected final Integer getUidFromSession(HttpSession session) {
		return Integer.valueOf(session.getAttribute("uid").toString());
	}

	public String getURL() {
		return URL;
	}
}

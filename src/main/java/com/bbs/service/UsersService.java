package com.bbs.service;

import com.bbs.vo.Authmail;

public interface UsersService {
	public int idCheck(String user_id) throws Exception;
	public int setAuthnum(String user_mail) throws Exception;
}

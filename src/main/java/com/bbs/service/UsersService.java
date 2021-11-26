package com.bbs.service;

import com.bbs.vo.Authmail;
import com.bbs.vo.Users;

public interface UsersService {
	public int idCheck(String user_id) throws Exception;
	public int setAuthnum(String user_mail) throws Exception;
	public int checkAuthnum(Authmail authmail) throws Exception;
	public void joinAction(Users users) throws Exception;
}

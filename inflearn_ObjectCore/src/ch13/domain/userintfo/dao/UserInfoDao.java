package ch13.domain.userintfo.dao;

import ch13.domain.userintfo.UserInfo;

public interface UserInfoDao {

	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}

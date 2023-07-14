package ch13.domain.userintfo.dao.oracle;

import ch13.domain.userintfo.UserInfo;
import ch13.domain.userintfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into ORACLE DB userId = "+userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update into ORACLE DB userId = "+userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete from ORACLE DB userId = "+userInfo.getUserId());
	}

}

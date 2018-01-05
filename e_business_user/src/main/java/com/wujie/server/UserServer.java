package com.wujie.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wujie.bean.T_MALL_ADDRESS;
import com.wujie.bean.T_MALL_USER_ACCOUNT;
import com.wujie.mapper.UserMapper;
import com.wujie.util.MyRoutingDataSource;

public class UserServer implements UserServerInf {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public T_MALL_USER_ACCOUNT selectUser1(String yh_mch, String yh_mm) {
		MyRoutingDataSource.setKey("ds1");
		T_MALL_USER_ACCOUNT account = userMapper.selectUserInfo(yh_mch, yh_mm);
		return account;
	}
	public T_MALL_USER_ACCOUNT selectUser2(String yh_mch, String yh_mm) {
		MyRoutingDataSource.setKey("ds2");
		T_MALL_USER_ACCOUNT account = userMapper.selectUserInfo(yh_mch, yh_mm);
		return account;
	}
	@Override
	public List<T_MALL_ADDRESS> selectAddressByUser(T_MALL_USER_ACCOUNT user) {
		List<T_MALL_ADDRESS> address = userMapper.selectAddressByUser(user);
		return address;
	}
	@Override
	public T_MALL_ADDRESS selectAddressById(Integer address_id) {
		T_MALL_ADDRESS address = userMapper.selectAddressById(address_id);
		return address;
	}

}

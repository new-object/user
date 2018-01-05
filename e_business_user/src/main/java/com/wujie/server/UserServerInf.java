package com.wujie.server;

import java.util.List;

import javax.jws.WebService;

import com.wujie.bean.T_MALL_ADDRESS;
import com.wujie.bean.T_MALL_USER_ACCOUNT;

@WebService
public interface UserServerInf {
	
	public T_MALL_USER_ACCOUNT selectUser1(String yh_mch, String yh_mm);
	
	public T_MALL_USER_ACCOUNT selectUser2(String yh_mch, String yh_mm);
	
	//地址的增删改查
	public List<T_MALL_ADDRESS> selectAddressByUser(T_MALL_USER_ACCOUNT user);
	public T_MALL_ADDRESS selectAddressById(Integer address_id);
}

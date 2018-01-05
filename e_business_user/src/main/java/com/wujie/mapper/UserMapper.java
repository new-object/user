package com.wujie.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wujie.bean.T_MALL_ADDRESS;
import com.wujie.bean.T_MALL_USER_ACCOUNT;

public interface UserMapper {

	public T_MALL_USER_ACCOUNT selectUserInfo(@Param("yh_mch") String yh_mch, @Param("yh_mm") String yh_mm);

	public List<T_MALL_ADDRESS> selectAddressByUser(T_MALL_USER_ACCOUNT user);

	public T_MALL_ADDRESS selectAddressById(Integer address_id);

}

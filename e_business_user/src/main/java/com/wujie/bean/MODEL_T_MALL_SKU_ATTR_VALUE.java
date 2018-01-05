package com.wujie.bean;

import java.util.ArrayList;
import java.util.List;

public class MODEL_T_MALL_SKU_ATTR_VALUE {
	private List<T_MALL_SKU_ATTR_VALUE> sav = new ArrayList<T_MALL_SKU_ATTR_VALUE>();

	public List<T_MALL_SKU_ATTR_VALUE> getSav() {
		return sav;
	}

	public void setSav(List<T_MALL_SKU_ATTR_VALUE> sav) {
		if(sav==null){
			sav=new ArrayList<T_MALL_SKU_ATTR_VALUE>();
		}else {
			this.sav = sav;
		}
	}
}

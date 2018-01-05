package com.wujie.bean;

import java.util.List;

public class SKU_SPU_IMAGE extends T_MALL_SKU {

	private T_MALL_PRODUCT spu;
	
	private List<T_MALL_PRODUCT_IMAGE> imageList;

	public T_MALL_PRODUCT getSpu() {
		return spu;
	}

	public void setSpu(T_MALL_PRODUCT spu) {
		this.spu = spu;
	}

	public List<T_MALL_PRODUCT_IMAGE> getImageList() {
		return imageList;
	}

	public void setImageList(List<T_MALL_PRODUCT_IMAGE> imageList) {
		this.imageList = imageList;
	}

	
	
}

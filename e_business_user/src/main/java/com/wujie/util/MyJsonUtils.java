package com.wujie.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;

import net.sf.json.JSONArray;

public class MyJsonUtils {

	/**
	 * json字符串转化为集合,使用Apache提供的cglib
	 */
	public static <T> List<T> json2List(String json,Class<T> t){
		String decode = "";
		if (StringUtils.isBlank(json)) {
			return new ArrayList<>();
		}else{
			try {
				decode = URLDecoder.decode(json, "utf-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			JSONArray fromObject = JSONArray.fromObject(decode);
			
			@SuppressWarnings("unchecked")
			List<T> list1 = (List<T>)JSONArray.toCollection(fromObject, t);
			return list1;
		}
		
		
		
	}

	public static <T> String list2Json(List<T> list_cart) {

		Gson gson = new Gson();
		String json = gson.toJson(list_cart);
		try {
			json = URLEncoder.encode(json,"utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return json;
	}
}

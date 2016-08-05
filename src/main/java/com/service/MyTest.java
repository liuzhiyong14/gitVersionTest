package com.service;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.utils.User;

public class MyTest {

	public static void main(String[] args) throws JsonProcessingException {

//		Date date = DateUtils.addDay(1);
//		System.out.println("date==" + date);
		
	    ObjectMapper mapper = new ObjectMapper();  
	    //通过该方法对mapper对象进行设置，所有序列化的对象都将按改规则进行系列化  
	    //Include.Include.ALWAYS 默认  
	    //Include.NON_DEFAULT 属性为默认值不序列化  
	    //Include.NON_EMPTY 属性为 空（“”）  或者为 NULL 都不序列化  
	    //Include.NON_NULL 属性为NULL 不序列化  
	    mapper.setSerializationInclusion(Include.NON_EMPTY);  
	    User user = new User(1,"",18);  
	    String outJson = mapper.writeValueAsString(user);  
	    System.out.println(outJson);
		
		
	}

}

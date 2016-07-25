package com.service;

import java.util.Date;

import com.utils.DateUtils;

public class MyTest {

	public static void main(String[] args) {

		Date date = DateUtils.addDay(1);
		
		System.out.println("date==" + date);
	}

}

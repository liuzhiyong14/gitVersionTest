package com.service;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class GuavaCache {
	public static void main(String args[]) throws ExecutionException, InterruptedException{
		LoadingCache<String, String> cahceBuilder = CacheBuilder.newBuilder().expireAfterWrite(10, TimeUnit.SECONDS)
				.build(new CacheLoader<String, String>() {
					@Override
					public String load(String key) throws Exception {
						String strProValue = "hello " + key + "-"+new Random().nextInt(100);
						return strProValue;
					}

				});

		
		while(true){
			System.out.println("word value:" + cahceBuilder.get("key1").toString());
			System.out.println("word value:" + cahceBuilder.get("key2").toString());
			System.out.println("word value:" + cahceBuilder.get("key3").toString());
			System.out.println("word value:" + cahceBuilder.get("key4").toString());
			System.out.println("word value:" + cahceBuilder.get("key5").toString());
			Thread.sleep(15000);
		}
	}
	
}

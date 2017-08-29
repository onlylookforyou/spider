package com.gs.spider.redis;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicInterface2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 封装redis db1 缓存服务器服务接口
 * 
 * @author edmond
 * @version 2017/5/15
 */
@Component
public class RedisDB3Service {

	@Autowired
	@Qualifier("redisDB3Template")
	private StringRedisTemplate redisDB3Template;// redis操作模板
	
	public void  setValue(String key,String value){
		if (key == null || "".equals(key)) {
			return;
		}

		//数据保留2个月
		redisDB3Template.opsForValue().set(key, value, 60,TimeUnit.DAYS);
		
	}
		
	public void  getValue(String key){
		redisDB3Template.opsForValue().get(key);
		
	}
	
	public boolean isExist(String key){
		
		return redisDB3Template.hasKey(key);
	}
}
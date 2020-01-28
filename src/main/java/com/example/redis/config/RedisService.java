package com.example.redis.config;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

@Service
public class RedisService {

	@Autowired
	private Gson gson;
	
	private HashOperations<String, String, String> hashOperations;
	
	public void add(String hashKey,String key,Object value) {
		hashOperations.put(hashKey,key,gson.toJson(value));
	}
	
	public String getValue(String hashKey,String key) {
		return hashOperations.get(hashKey, key);
	}
	
	public List<String> getAllValue(String hashKey){
		 List<String> list = hashOperations.values(hashKey);
		 return list;
	}
	
	
	public Set<String> getKey(String hashKey) {
		return hashOperations.keys(hashKey);
	}
	
	public Set<String> getAllKeys(String hashKey){
		Set<String> set =hashOperations.keys(hashKey);
		return set;
	}
	
	public void delete(String hashKey,String key) {
		hashOperations.delete(hashKey, key);
	}
	
}

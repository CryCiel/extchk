package com.flow.test.item.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ItemService {
	public List<HashMap<String, Object>> selectItemList(HashMap<String, Object> param);
	
	int insertItem(HashMap<String, Object> param);
	
	int updateItem(HashMap<String, Object> param);
	
	int deleteItem(HashMap<String, Object> param);
}

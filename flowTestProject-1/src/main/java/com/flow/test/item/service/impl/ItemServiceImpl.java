package com.flow.test.item.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flow.test.item.mapper.ItemMapper;
import com.flow.test.item.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	ItemMapper itemMapper;
	
	@Override
	public List<HashMap<String, Object>> selectItemList(HashMap<String, Object> param) {
		return itemMapper.selectItemList(param);
	}

	@Override
	public int insertItem(HashMap<String, Object> param) {
		return itemMapper.insertItem(param);
	}

	@Override
	public int updateItem(HashMap<String, Object> param) {
		return itemMapper.updateItem(param);
	}

	@Override
	public int deleteItem(HashMap<String, Object> param) {
		return itemMapper.deleteItem(param);
	}

}

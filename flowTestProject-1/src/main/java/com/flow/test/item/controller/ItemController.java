package com.flow.test.item.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flow.test.item.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@GetMapping("/item")
	public ResponseEntity<HashMap<String, Object>> getItemList(@RequestParam HashMap<String, Object> param){
		HashMap<String, Object> map = new HashMap<>();
		List<HashMap<String, Object>> itemList = itemService.selectItemList(param);
		map.put("itemList", itemList);		
		return new ResponseEntity<HashMap<String, Object>>(map, HttpStatus.OK);
	}
	
	@PostMapping("/item")
	public ResponseEntity<HashMap<String, Object>> postItem(@RequestParam HashMap<String, Object> param){
		HashMap<String, Object> map = new HashMap<>();
		int result = itemService.insertItem(param);
		map.put("result", result);
		return new ResponseEntity<HashMap<String, Object>>(map, HttpStatus.OK);
	}
	
	@PutMapping("/item")
	public ResponseEntity<HashMap<String, Object>> putItem(@RequestParam HashMap<String, Object> param){
		HashMap<String, Object> map = new HashMap<>();
		int result = itemService.updateItem(param);
		map.put("result", result);
		return new ResponseEntity<HashMap<String, Object>>(map, HttpStatus.OK);
	}
	
	@DeleteMapping("/item")
	public ResponseEntity<HashMap<String, Object>> deleteItem(@RequestParam HashMap<String, Object> param){
		HashMap<String, Object> map = new HashMap<>();
		int result = itemService.deleteItem(param);
		map.put("result", result);
		return new ResponseEntity<HashMap<String, Object>>(map, HttpStatus.OK);
	}
	
}

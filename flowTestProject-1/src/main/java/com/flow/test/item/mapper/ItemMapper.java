package com.flow.test.item.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemMapper {
    public List<HashMap<String, Object>> selectItemList(HashMap<String, Object> params);

    public int insertItem(HashMap<String, Object> params);

    public int updateItem(HashMap<String, Object> params);

    public int deleteItem(HashMap<String, Object> params);
}

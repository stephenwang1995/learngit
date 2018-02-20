package com.xaccp.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
       public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("CN", "�й�");
		map.put("UN", "����");
		map.put("JP", "�ձ�");
		Set<Entry<String, String>> set = map.entrySet();
		for (Entry<String, String> entry : set) {
			String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":"+value);
		}
		
	}
}

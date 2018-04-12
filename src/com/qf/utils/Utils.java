package com.qf.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qf.pojo.Tree;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.xml.internal.messaging.saaj.soap.impl.TreeException;

/**
* @author  果果 
* @date 创建时间：2017年7月31日 上午12:52:35 
* @version 1.0 
**/
public class Utils {
	private static Map<String,List<Tree>> map = new HashMap();
	static {
		List<Tree> list1 = new ArrayList<Tree>();
		for (int i = 0; i < 5; i++) {
			Tree tree =new Tree();
			tree.setId(i+100);
			tree.setText("第"+(i+100));
			tree.setState(i%2==0?"closed":"open");
			list1.add(tree);
		}
		map.put("1", list1);
		
		list1 = new ArrayList<Tree>();
		for (int i = 1; i < 5; i++) {
			Tree tree =new Tree();
			tree.setId(i);
			tree.setText("第"+i);
			tree.setState(i%2==0?"open":"closed");
			list1.add(tree);
		}
		map.put("root", list1);
	}
	public static List<Tree> getData(String id){
		return map.get(id);
	}
}

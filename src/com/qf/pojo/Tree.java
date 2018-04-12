package com.qf.pojo;
/**
* @author  果果 
* @date 创建时间：2017年7月31日 上午12:50:31 
* @version 1.0 
**/
public class Tree {
	private int id;
	private String text;
	private String state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Tree [id=" + id + ", text=" + text + ", state=" + state + "]";
	}
}

package com.taotao.common.pojo;

import java.io.Serializable;

/**
 * easyui展示的树性图
 * @author lquan
 *
 */
public class EasyUITreeNode implements Serializable{
	
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 4322820236075371983L;
	// 节点的Id
	private Long id;
	// 内容
	private String text;
	//状态
	private String state;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
}

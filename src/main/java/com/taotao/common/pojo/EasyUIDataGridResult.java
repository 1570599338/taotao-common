package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 分页处理器
 * @author lquan
 *
 */
public class EasyUIDataGridResult implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2415404292705867968L;

	private long total;
	
	private List rows;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}
	
	
	

}

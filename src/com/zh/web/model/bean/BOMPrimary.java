package com.zh.web.model.bean;

import com.zh.core.model.IDataObject;

/**
 * @Title: ProductStructure.java
 * @Package com.zh.web.model.bean
 * @Description: 产品结构清单
 * @date 2015年4月1日 下午2:32:40
 * @author taozhaoping 26078
 * @author mail taozhaoping@gmail.com
 * @version V1.0
 */
public class BOMPrimary extends IDataObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7931223535636799647L;

	/**
	 * 主键id 
	 */
	private Integer id;

	/**
	 * 主产品编号
	 */
	private Integer mainProductsId;
	
	private String descr;
	
	private String effdt;
	
	private String effStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMainProductsId() {
		return mainProductsId;
	}

	public void setMainProductsId(Integer mainProductsId) {
		this.mainProductsId = mainProductsId;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getEffdt() {
		return effdt;
	}

	public void setEffdt(String effdt) {
		this.effdt = effdt;
	}

	public String getEffStatus() {
		return effStatus;
	}

	public void setEffStatus(String effStatus) {
		this.effStatus = effStatus;
	}
	
}
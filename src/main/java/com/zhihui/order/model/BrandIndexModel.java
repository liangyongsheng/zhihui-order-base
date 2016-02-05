package com.zhihui.order.model;

import java.sql.Timestamp;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "brand_index")
@Access(AccessType.FIELD)
public class BrandIndexModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int brandIndexId;
	private String name;
	private Timestamp createTime;
	private String remark;

	public int getBrandIndexId() {
		return brandIndexId;
	}

	public void setBrandIndexId(int brandIndexId) {
		this.brandIndexId = brandIndexId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}

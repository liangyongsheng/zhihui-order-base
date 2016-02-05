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
@Table(name = "brand")
@Access(AccessType.FIELD)
public class BrandModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int brandId;
	private int partnerId;
	private String outerBrandSn;
	private String outerBrandName;
	private Integer brandIndexId;
	private Timestamp createTime;
	private Integer createOprtId;
	private Timestamp lastReviseTime;
	private Integer lastReviseOprtId;
	private String remark;

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public int getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(int partnerId) {
		this.partnerId = partnerId;
	}

	public String getOuterBrandSn() {
		return outerBrandSn;
	}

	public void setOuterBrandSn(String outerBrandSn) {
		this.outerBrandSn = outerBrandSn;
	}

	public String getOuterBrandName() {
		return outerBrandName;
	}

	public void setOuterBrandName(String outerBrandName) {
		this.outerBrandName = outerBrandName;
	}

	public Integer getBrandIndexId() {
		return brandIndexId;
	}

	public void setBrandIndexId(Integer brandIndexId) {
		this.brandIndexId = brandIndexId;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Integer getCreateOprtId() {
		return createOprtId;
	}

	public void setCreateOprtId(Integer createOprtId) {
		this.createOprtId = createOprtId;
	}

	public Timestamp getLastReviseTime() {
		return lastReviseTime;
	}

	public void setLastReviseTime(Timestamp lastReviseTime) {
		this.lastReviseTime = lastReviseTime;
	}

	public Integer getLastReviseOprtId() {
		return lastReviseOprtId;
	}

	public void setLastReviseOprtId(Integer lastReviseOprtId) {
		this.lastReviseOprtId = lastReviseOprtId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}

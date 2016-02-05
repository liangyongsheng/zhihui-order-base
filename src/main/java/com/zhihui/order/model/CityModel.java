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
@Table(name = "city")
@Access(AccessType.FIELD)
public class CityModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cityId;
	private int partnerId;
	private String outerCitySn;
	private String outerCityName;
	private Integer cityIndexId;
	private Timestamp createTime;
	private Integer createOprtId;
	private Timestamp lastReviseTime;
	private Integer lastReviseOprtId;
	private String remark;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(int partnerId) {
		this.partnerId = partnerId;
	}

	public String getOuterCitySn() {
		return outerCitySn;
	}

	public void setOuterCitySn(String outerCitySn) {
		this.outerCitySn = outerCitySn;
	}

	public String getOuterCityName() {
		return outerCityName;
	}

	public void setOuterCityName(String outerCityName) {
		this.outerCityName = outerCityName;
	}

	public Integer getCityIndexId() {
		return cityIndexId;
	}

	public void setCityIndexId(Integer cityIndexId) {
		this.cityIndexId = cityIndexId;
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

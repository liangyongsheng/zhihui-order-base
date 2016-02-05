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
@Table(name = "room_type")
@Access(AccessType.FIELD)
public class RoomTypeModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomTypeId;
	private int partnerId;
	private int chainId;
	private String outerRoomTypeSn;
	private String outerRoomTypeName;
	private Integer roomTypeIndexId;
	private Timestamp createTime;
	private Integer createOprtId;
	private Timestamp lastReviseTime;
	private Integer lastReviseOprtId;
	private String remark;

	public int getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(int roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public int getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(int partnerId) {
		this.partnerId = partnerId;
	}

	public int getChainId() {
		return chainId;
	}

	public void setChainId(int chainId) {
		this.chainId = chainId;
	}

	public String getOuterRoomTypeSn() {
		return outerRoomTypeSn;
	}

	public void setOuterRoomTypeSn(String outerRoomTypeSn) {
		this.outerRoomTypeSn = outerRoomTypeSn;
	}

	public String getOuterRoomTypeName() {
		return outerRoomTypeName;
	}

	public void setOuterRoomTypeName(String outerRoomTypeName) {
		this.outerRoomTypeName = outerRoomTypeName;
	}

	public Integer getRoomTypeIndexId() {
		return roomTypeIndexId;
	}

	public void setRoomTypeIndexId(Integer roomTypeIndexId) {
		this.roomTypeIndexId = roomTypeIndexId;
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

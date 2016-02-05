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
@Table(name = "room_type_index")
@Access(AccessType.FIELD)
public class RoomTypeIndexModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomTypeIndexId;
	private String name;
	private Timestamp createTime;
	private String remark;

	public int getRoomTypeIndexId() {
		return roomTypeIndexId;
	}

	public void setRoomTypeIndexId(int roomTypeIndexId) {
		this.roomTypeIndexId = roomTypeIndexId;
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

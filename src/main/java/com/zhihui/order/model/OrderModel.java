package com.zhihui.order.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`order`")
@Access(AccessType.FIELD)
public class OrderModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;
	private int partnerId;
	private String outerOrderSn;
	private String outerOrderName;
	private int chainId;
	private long mebId;
	private String mebName;
	private Integer mebGender;
	private String mebMobile;
	private int roomTypeId;
	private Integer num;
	private Date arrEndOfDay;
	private Date depEndOfDay;
	private Timestamp reserveTime;
	private Timestamp earlyArrTime;
	private Timestamp lastArrTime;
	private Integer channelSellerId;
	private Integer sellerId;
	private String message;
	private Integer flag;
	private Timestamp createTime;
	private Integer createOprtId;
	private Timestamp lastReviseTime;
	private Integer lastReviseOprtId;
	private String innRemark;
	private String remark;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public int getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(int partnerId) {
		this.partnerId = partnerId;
	}

	public String getOuterOrderSn() {
		return outerOrderSn;
	}

	public void setOuterOrderSn(String outerOrderSn) {
		this.outerOrderSn = outerOrderSn;
	}

	public String getOuterOrderName() {
		return outerOrderName;
	}

	public void setOuterOrderName(String outerOrderName) {
		this.outerOrderName = outerOrderName;
	}

	public int getChainId() {
		return chainId;
	}

	public void setChainId(int chainId) {
		this.chainId = chainId;
	}

	public long getMebId() {
		return mebId;
	}

	public void setMebId(long mebId) {
		this.mebId = mebId;
	}

	public String getMebName() {
		return mebName;
	}

	public void setMebName(String mebName) {
		this.mebName = mebName;
	}

	public Integer getMebGender() {
		return mebGender;
	}

	public void setMebGender(Integer mebGender) {
		this.mebGender = mebGender;
	}

	public String getMebMobile() {
		return mebMobile;
	}

	public void setMebMobile(String mebMobile) {
		this.mebMobile = mebMobile;
	}

	public int getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(int roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Date getArrEndOfDay() {
		return arrEndOfDay;
	}

	public void setArrEndOfDay(Date arrEndOfDay) {
		this.arrEndOfDay = arrEndOfDay;
	}

	public Date getDepEndOfDay() {
		return depEndOfDay;
	}

	public void setDepEndOfDay(Date depEndOfDay) {
		this.depEndOfDay = depEndOfDay;
	}

	public Timestamp getReserveTime() {
		return reserveTime;
	}

	public void setReserveTime(Timestamp reserveTime) {
		this.reserveTime = reserveTime;
	}

	public Timestamp getEarlyArrTime() {
		return earlyArrTime;
	}

	public void setEarlyArrTime(Timestamp earlyArrTime) {
		this.earlyArrTime = earlyArrTime;
	}

	public Timestamp getLastArrTime() {
		return lastArrTime;
	}

	public void setLastArrTime(Timestamp lastArrTime) {
		this.lastArrTime = lastArrTime;
	}

	public Integer getChannelSellerId() {
		return channelSellerId;
	}

	public void setChannelSellerId(Integer channelSellerId) {
		this.channelSellerId = channelSellerId;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
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

	public String getInnRemark() {
		return innRemark;
	}

	public void setInnRemark(String innRemark) {
		this.innRemark = innRemark;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}

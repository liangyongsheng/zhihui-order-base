package com.zhihui.order.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhihui.core.hibernate.DaoBase;
import com.zhihui.order.model.ChainModel;

@Repository
public class ChainDao extends DaoBase {
	private String selectText = " select "//
			+ "chainId,partnerId,outerChainSn,outerChainName,cityId,brandId,address,faxphone,telephone,"//
			+ "baiduX,baiduY,description,createTime,createOprtId,lastReviseTime,lastReviseOprtId,remark "//
			+ "from chain ";

	@SuppressWarnings("unchecked")
	@Override
	public ChainModel getById(long id) {
		String sql = this.selectText + " where chainId = " + id + "";
		List<ChainModel> tmp = this.executeFind(sql, ChainModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}

	public List<ChainModel> getByPartnerId(int partnerId) {
		// XXX 记得
		String sql = this.selectText + " where partnerId = " + partnerId + " and outerChainSn = '128'";
		List<ChainModel> rs = this.executeFind(sql, ChainModel.class);
		return rs;
	}

	public ChainModel getByOuterChainSn(int parnterId, String outerChainSn) {
		String sql = this.selectText + " where partnerId = " + parnterId + " and outerChainSn = '" + outerChainSn + "'";
		List<ChainModel> tmp = this.executeFind(sql, ChainModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}

	public List<ChainModel> getByCondt(Integer brandId, Integer cityId, Integer chainId, String nameRelated) {
		List<ChainModel> rs = new ArrayList<ChainModel>();
		String sql = this.selectText + " where  1 = 1 ";
		if (brandId != null)
			sql += "and brandId = " + brandId + " ";
		if (cityId != null)
			sql += "and brandId = " + brandId + " ";
		if (nameRelated != null)
			sql += "and outerChainName like '%" + nameRelated + "%' or '" + nameRelated + "' like concat('%',outerChainName,'%')";
		List<ChainModel> tmp = this.executeFind(sql, ChainModel.class);
		rs = tmp == null ? rs : tmp;
		return rs;
	}
}

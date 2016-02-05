package com.zhihui.order.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhihui.core.hibernate.DaoBase;
import com.zhihui.order.model.BrandModel;

@Repository
public class BrandDao extends DaoBase {
	private String selectText = " select "//
			+ "brandId,partnerId,outerBrandSn,outerBrandName,brandIndexId,createTime,createOprtId,lastReviseTime,lastReviseOprtId,remark "//
			+ "from brand ";

	@SuppressWarnings("unchecked")
	@Override
	public BrandModel getById(long id) {
		String sql = this.selectText + " where brandId = " + id + "";
		List<BrandModel> tmp = this.executeFind(sql, BrandModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}

	public BrandModel getByOuterBrandSn(int parnterId, String outerBrandSn) {
		String sql = this.selectText + " where partnerId = " + parnterId + " and outerBrandSn = '" + outerBrandSn + "'";
		List<BrandModel> tmp = this.executeFind(sql, BrandModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}
}

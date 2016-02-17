package com.zhihui.order.partner;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhihui.core.exception.PartnerServiceException;
import com.zhihui.order.model.ChainModel;
import com.zhihui.order.model.OrderGuestModel;
import com.zhihui.order.model.OrderModel;
import com.zhihui.order.model.OrderPriceModel;
import com.zhihui.order.model.RoomTypeModel;

@Service
public abstract class PartnerService {
	protected Throwable throwable;

	public Throwable getThrowable() {
		return this.throwable;
	}

	/**
	 * when (len <= 0) is original string
	 * 
	 * @param len
	 * @return
	 */
	public String getErrMsg(int len) {
		String rs = null;
		if (this.throwable == null)
			return rs;
		rs = this.throwable.getMessage();
		if (rs != null && len > 0 && rs.length() > len)
			rs = rs.substring(0, len);
		return rs;
	}

	public abstract String getDesc();

	public abstract String addBook(ChainModel chainModel, RoomTypeModel roomTypeModel, OrderModel orderModel, List<OrderGuestModel> orderGuestModels, List<OrderPriceModel> orderPriceModels) throws PartnerServiceException;

	public abstract void cancelBook(OrderModel orderModel) throws PartnerServiceException;
}

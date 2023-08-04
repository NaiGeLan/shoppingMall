
package com.yami.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.bean.model.OrderSettlement;

/**
 *
 * @author NaiGeLan 
 */
public interface OrderSettlementService extends IService<OrderSettlement> {

	/**
	 * 根据内部订单号更新order settlement
	 * @param outTradeNo 外部单号
	 * @param transactionId 支付单号
	 */
	void updateSettlementsByPayNo(String outTradeNo, String transactionId);
}

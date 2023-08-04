

package com.yami.shop.bean.event;

import com.yami.shop.bean.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *  取消订单的事件
 *  @author NaiGeLan
 */
@Data
@AllArgsConstructor
public class CancelOrderEvent {

    private Order order;
}

package task10;

import lombok.Getter;
import task8.CommercialUnit;

import java.math.BigDecimal;

@Getter
public class OrdersPerMonth {

    private Integer purchaseCount;
    private Double avgSum;
    private Double delivery;
    private Integer countErrors; // пока не реализовал

    public OrdersPerMonth(CommercialUnit commercialUnit) {
        this.purchaseCount = commercialUnit.getCountPositions();
        this.avgSum = getRoundDouble(commercialUnit.getSumPositions() / purchaseCount);
        this.delivery = commercialUnit.getDelivery();
    }

    private Double getRoundDouble(double number) {
        BigDecimal bigDecimal = new BigDecimal(number);
        return bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}

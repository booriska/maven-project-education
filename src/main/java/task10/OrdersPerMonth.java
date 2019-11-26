package task10;

import lombok.Getter;
import task8.CommercialUnit;
import task8.SelectionReport;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
public class OrdersPerMonth {

    private LocalDateTime mount;
    private Integer purchaseCount;
    private Double avgSum;
    private Double delivery;
    private Integer countErrors;

    public OrdersPerMonth(SelectionReport selectionReport, LocalDateTime mount) {
        CommercialUnit commercialUnit = selectionReport.commercialUnit;
        this.mount = mount;
        this.purchaseCount = commercialUnit.getCountPositions();
        this.avgSum = getRoundDouble(commercialUnit.getSumPositions() / purchaseCount);
        this.delivery = commercialUnit.getDelivery();
        this.countErrors = selectionReport.errors;
    }

    private Double getRoundDouble(double number) {
        BigDecimal bigDecimal = new BigDecimal(number);
        return bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
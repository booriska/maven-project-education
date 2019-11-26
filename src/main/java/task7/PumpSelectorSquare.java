package task7;

import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
public class PumpSelectorSquare implements PumpSelector {

    private List<PumpIMP> pumps = PumpCharacteristicsLoader.getPumps();
    private Double ratioPercent = 10.;

    public PumpSelectorSquare(Double ratioPercent) {
        this.ratioPercent = ratioPercent;
    }

    @Override
    public PumpIMP select(Double flow, Double pressure) {
        pumps.sort(Comparator.comparing(PumpIMP::getPrice));

        return getProfitablePump(pumps, flow, pressure);
    }

    public PumpIMP selectInPriceRange(Double flow, Double pressure, Double minPrice, Double maxPrice) {
        List<PumpIMP> filteredPumps = pumps.stream()
                .filter(i -> i.getPrice() >= minPrice && i.getPrice() <= maxPrice)
                .collect(Collectors.toList());
        filteredPumps.sort(Comparator.comparing(PumpIMP::getPrice));

        return getProfitablePump(filteredPumps, flow, pressure);
    }

    private PumpIMP getProfitablePump(List<PumpIMP> pumpsList, Double flow, Double pressure) {
        for (PumpIMP pump : pumpsList) {
            Double workPoint = pump.calculateWorkPoint(flow, pressure);
            if (workPoint < flow && ratioPercentIsNormal(flow, workPoint)) {
                return pump;
            }
        }

        throw new RuntimeExceptionImp(ErrorMessage.NOT_FOUND);
    }

    private Boolean ratioPercentIsNormal(Double flow, Double workPoint) {
        Double percent = workPoint / flow * 100;
        return percent > 0 && percent <= ratioPercent;
    }

    public PumpIMP selectPumpAVGPrice(Double avgPrice) {
        PumpIMP pumpIMP = null;

        for (PumpIMP pump : pumps) {
            if (pumpIMP == null) {
                pumpIMP = pump;
            } else {
                if (comparePrices(avgPrice, pumpIMP.getPrice(), pump.getPrice())) {
                    pumpIMP = pump;
                }
            }
        }

        return pumpIMP;
    }

    private Boolean comparePrices(Double avgPrice, Double oldPrice, Double newPrice) {
        return Math.abs(avgPrice - newPrice) < Math.abs(avgPrice - oldPrice);
    }
}
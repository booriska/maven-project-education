package task7;

import task6.LagrangePolynomial;

public class PumpIMP implements Pump {

    private String name;
    private Double price;
    private String function;
    private Double[] functionArgsX;
    private Double[] functionArgsY;

    public PumpIMP(String name, Double price, String function, Double[] functionArgsX) {
        this.name = name;
        this.price = price;
        this.function = function;
        this.functionArgsX = functionArgsX;
        this.functionArgsY = new Double[]{};
    }

    public PumpIMP(String name, Double price, String function, Double[] functionArgsX, Double[] functionArgsY) {
        this.name = name;
        this.price = price;
        this.function = function;
        this.functionArgsX = functionArgsX;
        this.functionArgsY = functionArgsY;
    }

    @Override
    public Double calculateConsumption(Double flow) {
        if (functionArgsY.length != 0 && functionArgsX.length == functionArgsY.length) {
            return LagrangePolynomial.getLagrangePolynomial(functionArgsX, functionArgsY, flow);
        } else {
            return LagrangePolynomial.getLagrangePolynomial(functionArgsX, flow);
        }
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getFunction() {
        return function;
    }

    public Double[] getFunctionArgs() {
        return functionArgsX;
    }
}
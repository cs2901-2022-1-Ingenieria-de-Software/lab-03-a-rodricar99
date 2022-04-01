package lab.demand;

import java.util.List;

public class ManageDemand {

    private Tax tax;

    public ManageDemand(Tax tax) {
        this.tax = tax;
    }

    public double calculateTotal(List<Order> orders){
        // Calculate Taxes
        double taxes=0.0,quantities = 0.0;
        for (Order order : orders) {
            double tax = this.tax.calculateTax(order.getCountry());
            double temp = order.getQuantity();
            taxes += tax;
            quantities += temp;
        }
        return quantities * taxes;
    }

    public double calculateTotalForWithAdditionalByCountry(List<Order> orders, double defaultAdditionalColombia, double defaultAdditionalPeru, double defaultAdditionalBrazil){
        // Calculate additionals by country
        double taxes = 0.0;
        for (Order order : orders) {
            double tax = this.tax.calculateTax(order.getCountry());

        }

        // Calculate Total
        double quantities = 0.0;
        for (Order order : orders) {
            double temp = order.getQuantity();
            quantities += temp;
        }

        return quantities * taxes;
    }

}

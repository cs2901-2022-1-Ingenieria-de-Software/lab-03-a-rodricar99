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
            double tax = this.tax.calculateTax(order.getCountry(),-1.0);
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
            taxes += this.tax.calculateTax(order.getCountry(),defaultAdditionalColombia);
            taxes += this.tax.calculateTax(order.getCountry(),defaultAdditionalPeru);
            taxes += this.tax.calculateTax(order.getCountry(),defaultAdditionalBrazil);
            double quantities = 0.0;
            double temp = order.getQuantity();
            quantities += temp;
        return quantities * taxes;
    }

}

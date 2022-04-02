package lab.demand;

public class Tax {
    
    public double calculateTax(String country,double z) {
        if (country.equals("PE") && z==-1.0) {
            return 0.18;
        } else if (country.equals("BR")&& z==-1.0) {
            return 0.12;
        } else if(z == -1.0){
            return 0.0;
        }
    }

}

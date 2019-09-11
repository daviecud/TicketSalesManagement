package ticketSales.Model;

import javafx.collections.ObservableList;
import org.jetbrains.annotations.Contract;

import java.util.List;

public class TicketSaleModel {

    List<CustomersModel> customers;
    VenueStandsModel stands;


    public TicketSaleModel() {
    }

    public Double getTicketPrice(CustomersModel cust, VenueStandsModel stand) {

        double ticketPrice = 0;
        for (int i = 0; i < customers.size(); i++) {
            if (cust.getAge() <= 16 || cust.getAge() >= 65 && stand.getCapacity() > 0) {
                ticketPrice = stand.getTicketCost() / 25;
            } else if (stand.getCapacity() > 0){
                ticketPrice = stand.getTicketCost();
            }

        }
        return ticketPrice;
    }

    public void getTicketSale() {}
}

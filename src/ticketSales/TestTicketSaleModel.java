package ticketSales;

import org.junit.Before;
import org.junit.Test;
import ticketSales.Model.CustomersModel;
import ticketSales.Model.TicketSaleModel;
import ticketSales.Model.VenueStandsModel;

import java.time.LocalDate;

public class TestTicketSaleModel {
    CustomersModel customersModel;
    VenueStandsModel venueStandsModel;
    TicketSaleModel sale;

    @Before
    public void setup() {
        CustomersModel cust = new CustomersModel("William", "Wallace", "The Castle, Stirling",
                "ST14 5JJ", 01222222, "willywallace@gmail.com", LocalDate.of(1151, 5, 12));
        VenueStandsModel stand = new VenueStandsModel("William Wallace Stand", 13000, 26.99, true);
    }

    @Test
    public void checkTicketSales() {
    }
}

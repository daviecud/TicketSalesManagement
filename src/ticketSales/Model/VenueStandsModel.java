package ticketSales.Model;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.List;

public class VenueStandsModel {

    private SimpleStringProperty standName;
    private SimpleIntegerProperty capacity;
    private SimpleDoubleProperty ticketCost;
    private SimpleBooleanProperty disabilityAccess;

    List<CustomersModel> customers;
    VenueStandsModel stands;
    CustomersModel customersModel;


    public VenueStandsModel(String standName, int capacity, double ticketCost, boolean disabilityAccess) {
        this.standName = new SimpleStringProperty(standName);
        this.capacity = new SimpleIntegerProperty(capacity);
        this.ticketCost = new SimpleDoubleProperty(ticketCost);
        this.disabilityAccess = new SimpleBooleanProperty(disabilityAccess);
    }

    public String getStandName() {
        return standName.get();
    }

    public void setStandName(String standName) {
        this.standName = new SimpleStringProperty(standName);
    }

    public int getCapacity() {
        return capacity.get();
    }

    public SimpleIntegerProperty capacityProperty() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = new SimpleIntegerProperty(capacity);
    }

    public double getTicketCost() {
        return ticketCost.get();
    }

    public SimpleDoubleProperty ticketCostProperty() {
        return ticketCost;
    }

    public void setTicketCost(double ticketCost) {
        this.ticketCost = new SimpleDoubleProperty(ticketCost);
    }

    public boolean isDisabilityAccess() {
        return disabilityAccess.get();
    }

    public SimpleBooleanProperty disabilityAccessProperty() {
        return disabilityAccess;
    }

    public void setDisabilityAccess(boolean disabilityAccess) {
        this.disabilityAccess = new SimpleBooleanProperty(disabilityAccess);
    }

    public Double getTicketPrice(CustomersModel cust, VenueStandsModel stand) {

        double ticketPrice = 0;
        for (int i = 0; i < customers.size(); i++) {
            if (cust.getAge() <= 16 || customersModel.getAge() >= 65 && stand.getCapacity() > 0) {
                ticketPrice = stand.getTicketCost() / 25;
            } else if (stand.getCapacity() > 0){
                ticketPrice = stand.getTicketCost();
            }

        }
        return ticketPrice;
    }

    public Double getSale() {

        double sale = 0;
        for (int i = 0; i < customers.size(); i++) {
            sale = this.getTicketPrice();

        }
        return sale;
    }

    private double getTicketPrice() {
        double ticketPrice = 0;
        for (int i = 0; i < customers.size(); i++) {
            if (customersModel.getAge() <= 16 || customersModel.getAge() >= 65 && stands.getCapacity() > 0) {
                ticketPrice = stands.getTicketCost() / 25;
            } else if (stands.getCapacity() > 0){
                ticketPrice = stands.getTicketCost();
            }

        }
        return ticketPrice;

    }

    public Double getSalesTotal(CustomersModel cust, VenueStandsModel stand) {

        double totalSales = 0;
        return totalSales;
    }
}

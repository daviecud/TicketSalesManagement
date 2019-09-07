package ticketSales.Model;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class VenueStandsModel {

    private SimpleStringProperty standName;
    private SimpleIntegerProperty capacity;
    private SimpleDoubleProperty ticketCost;
    private SimpleBooleanProperty disabilityAccess;

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
}

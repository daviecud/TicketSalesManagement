package ticketSales.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import ticketSales.Model.VenueStandsModel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    public ComboBox<String> comboStandSelect;
    public Label standNameField;
    public Label capacityField;
    public Label ticketField;
    public Label salesField;
    public Button buttonShow;
    public Button buttonCustomers;
    public Button buttonStands;
    public PieChart pieSales;

    private VenueStandsModel selectedStand;
    VenueStandsController controller;
    ObservableList<String> list = FXCollections.observableArrayList("Main Stand", "Sandy Jardine Stand", "Broomloan Stand", "Copland Road");

    public void initStandData(VenueStandsModel stands) {
        selectedStand = stands;
        standNameField.setText(selectedStand.getStandName());
        capacityField.setText(Integer.toString(selectedStand.getCapacity()));
        ticketField.setText(Double.toString(selectedStand.getTicketCost()));
    }

    //TODO sort how to populate combobox with database, populate piechart with ticket sales for each stand
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboStandSelect.setItems(list);

    }

    public void showStandButton(ActionEvent actionEvent) {
    }

    public void gotoCustomerButton(ActionEvent actionEvent) throws IOException {
        Parent customersTableView = FXMLLoader.load(getClass().getResource("../View/customers.fxml"));
        Scene customersScene = new Scene(customersTableView);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setTitle("Customers");
        window.setScene(customersScene);
        window.show();
    }

    public void gotoVenueButton(ActionEvent actionEvent) throws IOException {
        Parent venueStandsView = FXMLLoader.load(getClass().getResource("../View/stands.fxml"));
        Scene venueStandsScene = new Scene(venueStandsView);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setTitle("Venue Stands");
        window.setScene(venueStandsScene);
        window.show();
    }

    public void exitButton(ActionEvent actionEvent) {
        System.exit(1);
    }

    public void comboChange(ActionEvent actionEvent) {
        standNameField.setText(comboStandSelect.getValue());
    }
}

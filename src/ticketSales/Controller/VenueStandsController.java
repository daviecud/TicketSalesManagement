package ticketSales.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import ticketSales.Model.VenueStandsModel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class VenueStandsController implements Initializable {

    public AnchorPane standsTableView;
    public TableView<VenueStandsModel> standsTable;
    public TableColumn<VenueStandsModel, String> columnStandName;
    public TableColumn<VenueStandsModel, Integer> columnCapacity;
    public TableColumn<VenueStandsModel, Double> columnTicketCost;
    public TableColumn<VenueStandsModel, Boolean> columnDisabled;
    public TextField standNameField;
    public TextField capacityField;
    public TextField ticketCostField;
    public Button buttonAddStand;
    public ChoiceBox disabilityChoiceBx;
    public Button buttonDetailedStand;
    public Button buttonCustomers;
    public Button buttonDashboard;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        columnStandName.setCellValueFactory(new PropertyValueFactory<VenueStandsModel, String>("standName"));
        columnCapacity.setCellValueFactory(new PropertyValueFactory<VenueStandsModel, Integer>("capacity"));
        columnTicketCost.setCellValueFactory(new PropertyValueFactory<VenueStandsModel, Double>("ticketCost"));
        columnDisabled.setCellValueFactory(new PropertyValueFactory<VenueStandsModel, Boolean>("disabilityAccess"));

        standsTable.setItems(getStands());

    }

    private ObservableList<VenueStandsModel> getStands() {

        ObservableList<VenueStandsModel> vStands = FXCollections.observableArrayList();
        vStands.add(new VenueStandsModel("Sandy Jardine Stand", 20000, 589.99, true));
        vStands.add(new VenueStandsModel("Broomloan Road Stand", 10000, 529.99, true));
        vStands.add(new VenueStandsModel("Main Stand", 10000, 929.99, false));
        vStands.add(new VenueStandsModel("Copland Road Stand", 10000, 629.99, true));
        vStands.add(new VenueStandsModel("East Enclosure", 5000, 559.99, true));
        vStands.add(new VenueStandsModel("West Enclosure", 5000, 559.99, true));

        return vStands;

    }

    public void addStand(ActionEvent actionEvent) {

        VenueStandsModel stands = new VenueStandsModel(standNameField.getText(), Integer.parseInt(capacityField.getText()),
                Double.parseDouble(ticketCostField.getText()), Boolean.parseBoolean(disabilityChoiceBx.getAccessibleText()));


    }

    public void gotoDetailedStandButton(ActionEvent actionEvent) {
    }

    public void gotoCustomersButton(ActionEvent actionEvent) throws IOException {

        Parent customersView = FXMLLoader.load(getClass().getResource("../View/customers.fxml"));
        Scene customersScene = new Scene(customersView);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(customersScene);
        window.show();
    }

    public void dashboardButton(ActionEvent actionEvent) throws IOException {

        Parent dashboardView = FXMLLoader.load(getClass().getResource("../View/dashboard.fxml"));
        Scene dashboardScene = new Scene(dashboardView);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(dashboardScene);
        window.show();
    }
}

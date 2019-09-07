package ticketSales.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import ticketSales.Model.CustomersModel;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class CustomersController implements Initializable {
    public TableView<CustomersModel> tableView;
    public TableColumn<CustomersModel, String> columnFirstN;
    public TableColumn<CustomersModel, String> columnLastN;
    public TableColumn<CustomersModel, String> columnAddress;
    public TableColumn<CustomersModel, String> columnPostC;
    public TableColumn<CustomersModel, Integer> columnTele;
    public TableColumn<CustomersModel, String> columnEmail;
    public TableColumn<CustomersModel, LocalDate> columnDOB;
    public Button buttonNewCust;
    public Button buttonRemCust;
    public Button buttonDashboard;
    public TextField fNameField;
    public TextField sNameField;
    public TextField addressField;
    public TextField postField;
    public TextField telField;
    public TextField emailField;
    public DatePicker dobPicker;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        columnFirstN.setCellValueFactory(new PropertyValueFactory<CustomersModel, String>("firstName"));
        columnLastN.setCellValueFactory(new PropertyValueFactory<CustomersModel, String>("lastName"));
        columnAddress.setCellValueFactory(new PropertyValueFactory<CustomersModel, String>("address"));
        columnPostC.setCellValueFactory(new PropertyValueFactory<CustomersModel, String>("postCode"));
        columnTele.setCellValueFactory(new PropertyValueFactory<CustomersModel, Integer>("telephone"));
        columnEmail.setCellValueFactory(new PropertyValueFactory<CustomersModel, String>("email"));
        columnDOB.setCellValueFactory(new PropertyValueFactory<CustomersModel, LocalDate>("dob"));

        tableView.setItems(getCustomers());
    }

    private ObservableList<CustomersModel> getCustomers() {

        ObservableList<CustomersModel> customers = FXCollections.observableArrayList();
        customers.add(new CustomersModel("David","Calderwood","2a McClue Road, Renfrew",
                "PA4 9BL", 19173961, "davidwcalderwood@hotmail.com",
                LocalDate.of(1976, 5, 27) ));
        customers.add(new CustomersModel("Mexican","Bob","128 Materatti, New Mexico",
                "NM177", 4793490, "mexicanbob@gmail.com",
                LocalDate.of(1952, 11, 1) ));

        return customers;
    }

    public void addCustButton(javafx.event.ActionEvent actionEvent) {

        CustomersModel customer = new CustomersModel(fNameField.getText(), sNameField.getText(), addressField.getText(),
                postField.getText(), Integer.parseInt( telField.getText()), emailField.getText(), dobPicker.getValue());

        tableView.getItems().add(customer);
        fNameField.clear();
        sNameField.clear();
        addressField.clear();
        postField.clear();
        telField.clear();
        emailField.clear();
        //TODO figure out how to clear dobPicker after added new customer
    }

    public void deleteCustButton(javafx.event.ActionEvent actionEvent) {

        ObservableList<CustomersModel> allCustomers, singleCustomers;
        allCustomers = tableView.getItems(); //gets all data in table
        singleCustomers = tableView.getSelectionModel().getSelectedItems(); //get selected row
        singleCustomers.forEach(allCustomers::remove); //remove selected row/customer
    }

    public void gotoDashButton(ActionEvent actionEvent) throws IOException {

        Parent dashboardView = FXMLLoader.load(getClass().getResource("../View/dashboard.fxml"));
        Scene dashboardScene = new Scene(dashboardView);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(dashboardScene);
        window.show();


    }

    public void editCustButton(ActionEvent actionEvent) {

//        ObservableList<CustomersModel> allCustomers, singleCustomers;
//        allCustomers = tableView.getItems();
//        singleCustomers = tableView.getSelectionModel().getSelectedItems();
//        //TODO get cust details and populate the texfields with selected customer so user can change/update details then
//        // save updates
//        singleCustomers.forEach((allCustomers::));
//
//        tableView.isEditable();
//        fNameField.editableProperty();
    }
}

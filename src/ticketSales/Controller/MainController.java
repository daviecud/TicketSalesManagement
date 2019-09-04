package ticketSales.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    public ComboBox comboStandSelect;
    public Label standNameField;
    public Label capacityField;
    public Label ticketField;
    public Label salesField;
    public Button buttonShow;
    public Button buttonCustomers;
    public Button buttonStands;
    public PieChart pieSales;

    public void showStandButton(ActionEvent actionEvent) {
    }

    public void gotoCustomerButton(ActionEvent actionEvent) {
    }

    public void gotoVenueButton(ActionEvent actionEvent) {
    }

    public void exitButton(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

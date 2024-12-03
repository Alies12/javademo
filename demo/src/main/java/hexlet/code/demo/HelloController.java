package hexlet.code.demo;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TableView<Supplier> tableV;

    @FXML
    private TableColumn<Supplier,String> cType;

    @FXML
    private TableColumn<Supplier,String> cName;

    @FXML
    private TableColumn<Supplier,String> cPhone;

    @FXML
    private TableColumn<Supplier,String> cDiscount;

    @FXML
    protected void initialize(){
        cType.setCellValueFactory(new PropertyValueFactory<Supplier,String>("type"));
        cName.setCellValueFactory(new PropertyValueFactory<Supplier,String>("name"));
        cPhone.setCellValueFactory(new PropertyValueFactory<Supplier,String>("phone"));
        cDiscount.setCellValueFactory(new PropertyValueFactory<Supplier,String>("discount"));
    }
    @FXML
    protected  void updateData(ObservableList<Supplier> suppliers){
        tableV.setItems(suppliers);
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
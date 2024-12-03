package hexlet.code.demo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SecondController {
    @FXML
    private TextField tfType;
    @FXML
    private TextField tfName;
    @FXML
    private TextField tfPhone;
    @FXML
    private TextField tfDiscount;

    @FXML
    protected  void setData(Supplier supplier){
        tfType.setText(supplier.getType());
        tfName.setText(supplier.getName());
        tfPhone.setText(supplier.getPhone());
        tfDiscount.setText(supplier.getDiscount());
    }

}

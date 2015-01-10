package mydesignwkc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class PocetnaStranaController implements Initializable{

    @FXML
    private TableColumn<?, ?> kolonaTipOglasa;

    @FXML
    private TableColumn<?, ?> kolonaOglas;
    
    @FXML
    private TableColumn<?, ?> kolonaDatum;
    
    @FXML
    private AnchorPane anchorPocetna;

    @FXML
    private Label label;

    @FXML
    private Button button;

    @FXML
    private ImageView imgPregled;
    
    private EventHandler<MouseEvent> event = new EventHandler<MouseEvent>(){

        @Override
        public void handle(MouseEvent event) {
            label.setText("radi");
        }
            
    };

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        anchorPocetna.setVisible(true);
        button.setOnMouseClicked(event);
    }


 


}

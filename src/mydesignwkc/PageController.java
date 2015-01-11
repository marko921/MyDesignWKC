/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydesignwkc;

import javafx.event.EventHandler;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Marko
 */
public class PageController implements Initializable {

    @FXML
    private TableColumn<?, ?> kolonaTipOglasa;

    @FXML
    private TableColumn<?, ?> kolonaOglas;

    @FXML
    private ImageView imgPodesavanja1;

    @FXML
    private TableView<?> tableViewOglasi;

    @FXML
    private ImageView imgIzlaz;

    @FXML
    private ImageView imgPregled;

    @FXML
    private ImageView imgPodesavanja;

    @FXML
    private ImageView imgPrijava;

    @FXML
    private ImageView imgPocetna;

    @FXML
    private TableColumn<?, ?> kolonaDatum;

    @FXML
    private AnchorPane anchorPocetna;

    @FXML
    private AnchorPane anchorPrijava;

    @FXML
    private AnchorPane anchorPregled;

    @FXML
    private AnchorPane anchorPodesavanja;
    
    @FXML
    private AnchorPane anchorProba;

    private AnchorPane activeAnchorPane;

    private Map<ImageView, AnchorPane> anchorMap;

    private final EventHandler<MouseEvent> eventOnClick = new EventHandler<MouseEvent>() {

        @Override
        public void handle(MouseEvent t) {
            activeAnchorPane.setVisible(false);
            activeAnchorPane = anchorMap.get((ImageView) t.getTarget());
            if (activeAnchorPane == null) {
                System.exit(0);
            }
            activeAnchorPane.setVisible(true);
        }
    };
    private final EventHandler<MouseEvent> eventOnEntered = new EventHandler<MouseEvent>() {

        @Override
        public void handle(MouseEvent t) {
            ImageView tmp = (ImageView) t.getTarget();
            tmp.setFitHeight(100);
            tmp.setFitWidth(100);
            tmp.setRotate(25);
        }
    };
    private final EventHandler<MouseEvent> eventOnExited = new EventHandler<MouseEvent>() {

        @Override
        public void handle(MouseEvent t) {
            ImageView tmp = (ImageView) t.getTarget();
            tmp.setFitHeight(80);
            tmp.setFitWidth(80);
            tmp.setRotate(0);
        }
    };

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        anchorMap = new HashMap<ImageView, AnchorPane>();

        anchorMap.put(imgPocetna, anchorPocetna);
        anchorMap.put(imgPodesavanja, anchorPodesavanja);
        anchorMap.put(imgPrijava, anchorPrijava);
        anchorMap.put(imgPregled, anchorPregled);
        anchorMap.put(imgIzlaz, anchorProba);

        activeAnchorPane = anchorPocetna;
        activeAnchorPane.setVisible(true);

        Iterator<ImageView> iterator = anchorMap.keySet().iterator();

        while (iterator.hasNext()) {
            ImageView img = iterator.next();
            img.setOnMouseEntered(eventOnEntered);
            img.setOnMouseExited(eventOnExited);
            img.setOnMouseClicked(eventOnClick);
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydesignwkc;

import javafx.event.EventHandler;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseDragEvent;
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
    private ImageView imgPocetna1;

    @FXML
    private ImageView imgIzlaz1;

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
    private ImageView imgPregled1;

    @FXML
    private TableColumn<?, ?> kolonaDatum;

    @FXML
    private ImageView imgPrijava1;

    @FXML
    private AnchorPane anchorPocetna;

    @FXML
    private AnchorPane anchorPrijava;

    @FXML
    private AnchorPane anchorPregled;

    @FXML
    private AnchorPane anchorPodesavanja;

    private List<ImageView> imageViewList;
    private List<ImageView> imageViewList1;
    private List<AnchorPane> anchorPaneList;

    private final EventHandler<MouseEvent> eventOnClick = new EventHandler<MouseEvent>() {

        @Override
        public void handle(MouseEvent t) {
            for (ImageView imgView : imageViewList1) {
                AnchorPane tmp = anchorPaneList.get(imageViewList1.indexOf(imgView));
                if (t.getTarget().equals(imgView)) {
                    tmp.setVisible(true);
                } else if (tmp != null) {
                    tmp.setVisible(false);
                }
            }
        }
    };
    private final EventHandler<MouseEvent> eventOnEntered = new EventHandler<MouseEvent>() {

        @Override
        public void handle(MouseEvent t) {
            for (ImageView imgView : imageViewList) {
                if (t.getTarget().equals(imgView)) {
                    ImageView tmp = imageViewList1.get(imageViewList.indexOf(imgView));
                    tmp.setVisible(true);
                }
            }
        }
    };
    private final EventHandler<MouseEvent> eventOnExited = new EventHandler<MouseEvent>() {

        @Override
        public void handle(MouseEvent t) {
            for (ImageView imgView : imageViewList1) {
                imgView.setVisible(false);
            }
        }
    };

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        imageViewList = new ArrayList<ImageView>(5);
        imageViewList1 = new ArrayList<ImageView>(5);
        anchorPaneList = new ArrayList<AnchorPane>(5);

        imageViewList.add(imgPocetna);
        imageViewList.add(imgPodesavanja);
        imageViewList.add(imgPrijava);
        imageViewList.add(imgPregled);
        imageViewList.add(imgIzlaz);

        imageViewList1.add(imgPocetna1);
        imageViewList1.add(imgPodesavanja1);
        imageViewList1.add(imgPrijava1);
        imageViewList1.add(imgPregled1);
        imageViewList1.add(imgIzlaz1);

        anchorPaneList.add(anchorPocetna);
        anchorPaneList.add(anchorPodesavanja);
        anchorPaneList.add(anchorPrijava);
        anchorPaneList.add(anchorPregled);
        anchorPaneList.add(null);

        for (ImageView imgView : imageViewList) {
            imgView.setOnMouseEntered(eventOnEntered);
            imgView.setOnMouseClicked(eventOnClick);
        }

        for (ImageView imgView : imageViewList1) {
            imgView.setOnMouseExited(eventOnExited);
            imgView.setOnMouseClicked(eventOnClick);
        }
    }

}

package fr.afpa;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class TableViewController implements Initializable {

    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField city;
    @FXML
    private Button save;
    @FXML
    private Button cancel;
    @FXML
    private Button delete;
    @FXML
    private TableView<Person> personTable;
    @FXML
    private TableColumn<Person, String> columnFirstName;
    @FXML
    private TableColumn<Person, String> columnLastName;
    @FXML
    private TableColumn<Person, String> columnCity;

    private ObservableList<Person> persons = FXCollections.observableArrayList();

    @FXML
    private void save(ActionEvent event) {
        String first = firstName.getText();
        String last = lastName.getText();
        String leave = city.getText();

        if (!first.isEmpty() && !last.isEmpty() && !leave.isEmpty()) {
            persons.add(new Person(first, last, leave));
            firstName.clear();
            lastName.clear();
            city.clear();
        }
    }

    @FXML
    private void cancel(ActionEvent event) {
        firstName.clear();
        lastName.clear();
        city.clear();
    }

    @FXML
    private void delete(ActionEvent event) {
        Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
        if (selectedPerson != null) {
            persons.remove(selectedPerson);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        columnFirstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        columnLastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        columnCity.setCellValueFactory(new PropertyValueFactory<>("city"));

        persons.add(new Person("Maria", "Santiago", "Berlin"));
        persons.add(new Person("David", "Lacoste", "Lisbonne"));
        persons.add(new Person("Mohamed", "Atmane", "Alger"));
        persons.add(new Person("Sara", "Pierre", "Bordeaux"));
        personTable.setItems(persons);
    }
}

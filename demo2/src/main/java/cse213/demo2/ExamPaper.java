package cse213.demo2;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import java.util.Arrays;
import java.util.Collection;

import javafx.fxml.FXML;

public class ExamPaper {
    @javafx.fxml.FXML
    private ComboBox<Integer> sectionComboBox;
    @javafx.fxml.FXML
    private TextField craditTextField;
    @javafx.fxml.FXML
    private ComboBox<Integer> section2ComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> CourseComboBox;
    @javafx.fxml.FXML
    private RadioButton theoryRadioButton;
    @javafx.fxml.FXML
    private TextField EnterIDTextField;
    @javafx.fxml.FXML
    private TextField showInfoTextField;
    @javafx.fxml.FXML
    private Button addButton;
    @javafx.fxml.FXML
    private TextField schlorshipTextField;
    @javafx.fxml.FXML
    private CheckBox HasScholarshipCheckBox;
    @javafx.fxml.FXML
    private TextField showFilterTextField;
    @javafx.fxml.FXML
    private Button saveButton;
    @javafx.fxml.FXML
    private Button filterButton;
    @javafx.fxml.FXML
    private RadioButton labRadioButton;
    private ToggleGroup courseTypeToggleGroup;


    public void initialize() {
        CourseComboBox.getItems().addAll(Arrays.asList("MAT101", "BAN101", "ENG101", "CSE101", "Other"));
        sectionComboBox.getItems().addAll(Arrays.asList(1, 2, 3, 4, 5));
        section2ComboBox.getItems().addAll(Arrays.asList(1, 2, 3, 4, 5));



        // Set up ToggleGroup for the radio buttons
         courseTypeToggleGroup = new ToggleGroup();
        theoryRadioButton.setToggleGroup(courseTypeToggleGroup);
        labRadioButton.setToggleGroup(courseTypeToggleGroup);

        // Optional: Set a default selected radio button
        theoryRadioButton.setSelected(true);

        // Add a listener to handle radio button selection changes
        courseTypeToggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue == theoryRadioButton) {
                System.out.println("Theory course selected.");
                // Add any additional actions here for "Theory" selection
            } else if (newValue == labRadioButton) {
                System.out.println("Lab course selected.");
                // Add any additional actions here for "Lab" selection
            }
        });
        // Listener for checkbox state change

        HasScholarshipCheckBox.selectedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                System.out.println("Scholarship checkbox checked.");
                // Enable scholarship-related input or display a message
                HasScholarshipCheckBox.setDisable(false);
            } else {
                System.out.println("Scholarship checkbox unchecked.");
                // Disable scholarship-related input or clear the field
                HasScholarshipCheckBox.setDisable(true);
                schlorshipTextField.clear();
            }
        });


    }

    private void addTextFieldListeners() {
        // Enter ID TextField: Action when pressing Enter
        EnterIDTextField.setOnAction(event -> {
            System.out.println("Entered ID: " + EnterIDTextField.getText());
            // Perform specific action on Enter key press for enterIDTextField
        });

        // Credit TextField: Action on Enter
        craditTextField.setOnAction(event -> {
            System.out.println("Entered Credit: " + craditTextField.getText());
            // Perform specific action on Enter key press for creditTextField
        });

        // Scholarship TextField: Action on Enter
        schlorshipTextField.setOnAction(event -> {
            System.out.println("Entered Scholarship: " + schlorshipTextField.getText());
            // Perform specific action on Enter key press for scholarshipTextField
        });

    }


    @javafx.fxml.FXML
    public void showTotalNoOfCoursesButtonOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void proceedToRagisterAndShowRegInfoButtonOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addRegisteredCourseButtonOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void schlorshipTextFieldOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void EnterIDTextFieldOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void craditTextFieldOnAction(ActionEvent actionEvent) {
    }
}

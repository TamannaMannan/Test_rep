module cse213.demo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.demo2 to javafx.fxml;
    exports cse213.demo2;
}
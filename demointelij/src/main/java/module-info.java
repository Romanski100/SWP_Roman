module swp.demointelij {
    requires javafx.controls;
    requires javafx.fxml;


    opens swp.demointelij to javafx.fxml;
    exports swp.demointelij;
}
module python.proyecto_prueba_python {
    requires javafx.controls;
    requires javafx.fxml;


    opens python.proyecto_prueba_python to javafx.fxml;
    exports python.proyecto_prueba_python;
}
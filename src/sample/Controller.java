package sample;

import com.sun.javafx.cursor.CursorType;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;


public class Controller {

    private Stage primaryStage;

    public void setup(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    public void action1(ActionEvent event) throws InvocationTargetException, IllegalAccessException, IOException {
        File file = new File("GOKU.ani");
        System.out.println("File: " + file.getAbsolutePath());
        String value = WinRegistry.readString(
                WinRegistry.HKEY_CURRENT_USER,                             //HKEY
                "Control Panel\\Cursors",           //Key
                "Arrow");                                              //ValueName
        System.out.println("Previous arrow: = " + value);
        WinRegistry.writeStringValue(WinRegistry.HKEY_CURRENT_USER, "Control Panel\\Cursors", "Arrow", file.getAbsolutePath());
        System.out.println("Current arrow: " + file.getAbsolutePath());
        // Restart windows here
        Runtime.getRuntime().exec("shutdown -t 0 -r -f");
    }


    @FXML
    public void action2(ActionEvent event) throws InvocationTargetException, IllegalAccessException, IOException {
        File file = new File("cello.ani");
        System.out.println("File: " + file.getAbsolutePath());
        String value = WinRegistry.readString(
                WinRegistry.HKEY_CURRENT_USER,                             //HKEY
                "Control Panel\\Cursors",           //Key
                "Arrow");                                              //ValueName
        System.out.println("Previous arrow: = " + value);
        WinRegistry.writeStringValue(WinRegistry.HKEY_CURRENT_USER, "Control Panel\\Cursors", "Arrow", file.getAbsolutePath());
        System.out.println("Current arrow: " + file.getAbsolutePath());
        // Restart windows here
        Runtime.getRuntime().exec("shutdown -t 0 -r -f");
    }
    @FXML
    public void action3(ActionEvent event) throws InvocationTargetException, IllegalAccessException, IOException {
        File file = new File("WOW.ani");
        System.out.println("File: " + file.getAbsolutePath());
        String value = WinRegistry.readString(
                WinRegistry.HKEY_CURRENT_USER,                             //HKEY
                "Control Panel\\Cursors",           //Key
                "Arrow");                                              //ValueName
        System.out.println("Previous arrow: = " + value);
        WinRegistry.writeStringValue(WinRegistry.HKEY_CURRENT_USER, "Control Panel\\Cursors", "Arrow", file.getAbsolutePath());
        System.out.println("Current arrow: " + file.getAbsolutePath());
        // Restart windows here
        Runtime.getRuntime().exec("shutdown -t 0 -r -f");
    }

    public void action4(MouseEvent mouseEvent) throws InvocationTargetException, IllegalAccessException {
        File file = new File("GOKU.ani");
        WinRegistry.writeStringValue(WinRegistry.HKEY_CURRENT_USER, "Control Panel\\Cursors", "Arrow", file.getAbsolutePath());
    }


//    public void action5(MouseEvent mouseEvent) {
//        CursorType = Cursor CROSSHAIR();
//
//    }

}



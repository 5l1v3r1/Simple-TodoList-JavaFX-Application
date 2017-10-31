package com.haxtivitiez.todolist;

import com.haxtivitiez.todolist.datamodel.TodoData;
import com.haxtivitiez.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

/**
 * Created by UN4CKN0WL3Z on 30/10/2017.
 */
public class DialogController {

    @FXML
    private TextField shortDescriptionTextField;
    @FXML
    private TextArea DetailsTextArea;
    @FXML
    private DatePicker DeadlineDatePicker;

    public TodoItem processResult(){

        String shortDescription = shortDescriptionTextField.getText();
        String details = DetailsTextArea.getText();
        LocalDate deadlineVelue = DeadlineDatePicker.getValue();

        TodoItem newItem = new TodoItem(shortDescription,details,deadlineVelue);

        TodoData.getInstance().addTodoItem(newItem);

        return newItem;


    }


}

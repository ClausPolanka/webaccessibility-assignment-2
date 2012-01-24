package webaccessibility.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

public class Main implements EntryPoint {

    public void onModuleLoad() {
        TextBox nameField = new TextBox();
        nameField.setText("Enter Name");
        RootPanel.get("nameFieldContainer").add(nameField);

        TextBox ageField = new TextBox();
        ageField.setText("Enter Age");
        RootPanel.get("ageFieldContainer").add(ageField);
    }
}
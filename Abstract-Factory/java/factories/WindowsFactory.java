package java.factories;

import java.buttons.Button;
import java.buttons.WindowsButton;
import java.checkboxes.Checkbox;
import java.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory{
    @Override 
    public Button createButton(){
        return new WindowsButton();
    }

    @Override 
    public Checkbox createCheckbox(){
        return new WindowsCheckbox();
    }
}
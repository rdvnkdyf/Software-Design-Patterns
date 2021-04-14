package java.factories;

import java.buttons.Button;
import java.buttons.MacOSButton;
import java.checkboxes.Checkbox;
import java.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new MacOSButton();
    }

    @Override 
    public Checkbox createCheckbox(){
        return new MacOSCheckbox();
    }
}
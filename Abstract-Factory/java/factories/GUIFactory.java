package java.factories;

import java.buttons.Button;
import java.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory{
    Button createButton();
    Checkbox createCheckbox();
}
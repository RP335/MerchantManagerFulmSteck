package com.pinelabs;

import java.beans.PropertyEditorSupport;

public class IntegerPropertyEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (text == null || text.isEmpty()) {
            setValue(null);
        } else {
            try {
                setValue(Integer.parseInt(text));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid integer value: " + text);
            }
        }
    }
}

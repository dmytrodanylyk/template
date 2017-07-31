package com.dd.template;

import com.dd.template.dependecies.Logger;
import com.dd.template.dependecies.Preferences;

import org.mockito.Mockito;

import java.lang.reflect.Field;

class MockDependenciesTest {

    Logger logger;

    Preferences preferences;

    void initDependencies() {
        logger = Mockito.mock(Logger.class);
        preferences = Mockito.mock(Preferences.class);

        setPrivateFieldValue(Dependencies.INSTANCE, "logger", logger);
        setPrivateFieldValue(Dependencies.INSTANCE, "preferences", preferences);
    }

    private void setPrivateFieldValue(Object object, String fieldName, Object value) {
        try {
            Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(object, value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}

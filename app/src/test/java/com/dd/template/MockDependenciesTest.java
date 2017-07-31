package com.dd.template;

import com.dd.template.dependecies.Logger;
import com.dd.template.dependecies.Preferences;

import org.mockito.Mockito;

class MockDependenciesTest {

    Logger logger;

    Preferences preferences;

    void initDependencies() {
        logger = Mockito.mock(Logger.class);
        preferences = Mockito.mock(Preferences.class);

        Dependencies.INSTANCE.init(new MockDependenciesFactory());
    }

    private class MockDependenciesFactory implements DependenciesFactory {
        @Override
        public Logger newLogger() {
            return logger;
        }

        @Override
        public Preferences newPreferences() {
            return preferences;
        }
    }
}

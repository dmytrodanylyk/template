package com.dd.template;

import com.dd.template.dependecies.Logger;
import com.dd.template.dependecies.Preferences;

public interface DependenciesFactory {

    Logger newLogger();

    Preferences newPreferences();

}

package com.dd.template;

import com.dd.template.main.MainPresenter;
import com.dd.template.main.MainView;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;

public class MainPresenterTest extends MockDependenciesTest {

    @InjectMocks
    private MainPresenter presenter;

    @Mock
    private MainView view;

    @Before
    public void setupPresenter() {
        initDependencies();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void onExitClicked() throws Exception {
        // test method
        presenter.onExitClicked();

        // verify
        verify(view).exit();
        verify(preferences).setId(anyString());
        verify(logger).d("onExitClicked");
    }

}
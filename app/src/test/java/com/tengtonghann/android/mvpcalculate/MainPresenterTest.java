package com.tengtonghann.android.mvpcalculate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by tonghannteng on 3/27/17.
 */

@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {

    private MainPresenter mMainPresenter;
    @Mock
    private MainView mainView;
    @Mock
    private SumService sumService;

    @Before
    public void setUp() throws Exception {

        mMainPresenter = new MainPresenter(mainView, sumService);

    }

    @Test
    public void showErrorWhenFirstNumberIsEmpty() throws Exception {

        when(mainView.getFirstNumber()).thenReturn("");

        mMainPresenter.sumClick();
        verify(mainView).showFirstNumberError(R.string.firstNumberError);
    }

    @Test
    public void showErrorWhenSecondNumberIsEmpty() throws Exception {

        when(mainView.getFirstNumber()).thenReturn("a");
        when(mainView.getSecondNumber()).thenReturn("");
        mMainPresenter.sumClick();
        verify(mainView).showSecondNumberError(R.string.secondSecondError);
    }

    @Test
    public void startSumWhenFirstNumberAndSecondNumberAreNotEmpty() throws Exception {
        when(mainView.getFirstNumber()).thenReturn("1");
        when(mainView.getSecondNumber()).thenReturn("2");
        mMainPresenter.sumClick();
        verify(mainView).showResultTheResult();
    }

}
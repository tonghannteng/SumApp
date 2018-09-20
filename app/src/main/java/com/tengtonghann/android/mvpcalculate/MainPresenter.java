package com.tengtonghann.android.mvpcalculate;

import android.widget.Toast;

/**
 * Created by tonghannteng on 3/27/17.
 */

public class MainPresenter {

    private MainView mMainView;
    private SumService mSumService;

    public MainPresenter(MainView mainView, SumService sumService) {

        this.mMainView = mainView;
        this.mSumService = sumService;
    }

    public void sumClick() {

        String firstNumber = mMainView.getFirstNumber();
        String secondNumber = mMainView.getSecondNumber();
        boolean checkFirstNumber = true;
        boolean checkSecondNumber = true;

        if (firstNumber.isEmpty()) {
            mMainView.showFirstNumberError(R.string.firstNumberError);
            return;
        }
        if (secondNumber.isEmpty()) {
            mMainView.showSecondNumberError(R.string.secondSecondError);
            return;
        }

        try {
            int f = Integer.parseInt(firstNumber);

        } catch (NumberFormatException e) {
            checkFirstNumber = false;

        }
        try {
            int s = Integer.parseInt(secondNumber);
        } catch (NumberFormatException e) {
            checkSecondNumber = false;
        }

        if (!checkFirstNumber) {
            mMainView.showFirstNumberError(R.string.firstNumberError);
        }

        if (!checkSecondNumber) {
            mMainView.showSecondNumberError(R.string.secondSecondError);
        }

        if (checkFirstNumber && checkSecondNumber) {
            mMainView.showResultTheResult();
        }

    }
}

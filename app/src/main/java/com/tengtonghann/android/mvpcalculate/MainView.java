package com.tengtonghann.android.mvpcalculate;

/**
 * Created by tonghannteng on 3/27/17.
 */

public interface MainView {

    String getFirstNumber();

    void showFirstNumberError(int id);

    String getSecondNumber();

    void showSecondNumberError(int secondSecondError);

    void showResultTheResult();
}

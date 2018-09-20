package com.tengtonghann.android.mvpcalculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity {


    private EditText et_firstNumber;
    private EditText et_secondNumber;
    private EditText et_result;
    private MainPresenter mMainPresenter;

    @Override
    protected void init(Bundle savedInstanceState) {

        et_firstNumber = (EditText) findViewById(R.id.firstNumberId);
        et_secondNumber = (EditText) findViewById(R.id.secondNumberId);
        et_result = (EditText) findViewById(R.id.resultId);

        mMainPresenter = new MainPresenter(this, new SumService());
    }

    @Override
    protected int getContentResource() {
        return R.layout.activity_main;
    }

    public void clickSum(View view) {

        mMainPresenter.sumClick();

    }

    @Override
    public String getFirstNumber() {
        return et_firstNumber.getText().toString();
    }

    @Override
    public void showFirstNumberError(int id) {
        et_firstNumber.setError(getString(id));
    }

    @Override
    public String getSecondNumber() {
        return et_secondNumber.getText().toString();
    }

    @Override
    public void showSecondNumberError(int secondSecondError) {
        et_secondNumber.setError(getString(secondSecondError));
    }

    @Override
    public void showResultTheResult() {

        String result = new SumService()
                .sumNumber(et_firstNumber.getText().toString(), et_secondNumber.getText().toString());

        et_result.setText(result);

    }
}

package com.rhodonite.fragmenttab;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Test1 extends Fragment {
    private TextView mTxtR;

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Fragment即將在螢幕上顯示時執行此方法
        return inflater.inflate(R.layout.activity_test1, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // 在這個方法中取得並定義Fragment的介面元件
        super.onActivityCreated(savedInstanceState);

        mTxtR = (TextView) getView().findViewById(R.id.textView);
        //...
    }

    @Override
    public void onPause() {
        // 當Fragment要從螢幕消失時執行此方法
        super.onPause();
    }

}

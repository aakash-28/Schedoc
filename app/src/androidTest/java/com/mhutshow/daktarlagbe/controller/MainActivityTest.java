package com.mhutshow.daktarlagbe.controller;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import com.mhutshow.daktarlagbe.R;
import com.mhutshow.daktarlagbe.controller.MainActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainActivityTest{

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mActivity = null;


    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();
    }
    @Test
    public void testLaunch() {
        View view = mActivity.findViewById(R.id.editText3);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }
}
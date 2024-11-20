package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

// 定义 MainActivity_text1 类，继承自 AppCompatActivity
public class MainActivity_text1 extends AppCompatActivity implements View.OnClickListener {

    // 定义 Fragment
    private Fragment fragment1, fragment2, fragment3, fragment4;
    private FragmentManager fragmentManager;

    // 定义按钮布局
    private LinearLayout layout1, layout2, layout3, layout4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_text1); // 设置布局

        // 初始化 Fragment
        initFragments();

        // 初始化布局
        initLayouts();

        // 获取 FragmentManager
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        // 添加 Fragment 并设置初始隐藏状态
        transaction.add(R.id.frameLayout, fragment1);
        transaction.add(R.id.frameLayout, fragment2);
        transaction.add(R.id.frameLayout, fragment3);
        transaction.add(R.id.frameLayout, fragment4);
        transaction.hide(fragment2);
        transaction.hide(fragment3);
        transaction.hide(fragment4);
        transaction.commit();

        // 设置点击监听器
        layout1.setOnClickListener(this);
        layout2.setOnClickListener(this);
        layout3.setOnClickListener(this);
        layout4.setOnClickListener(this);
    }

    // 初始化 Fragment
    private void initFragments() {
        fragment1 = new text1_fragment1();
        fragment2 = new text1_fragment2();
        fragment3 = new text1_fragment3();
        fragment4 = new text1_fragment4();
    }

    // 初始化布局
    private void initLayouts() {
        layout1 = findViewById(R.id.layout1);
        layout2 = findViewById(R.id.layout2);
        layout3 = findViewById(R.id.layout3);
        layout4 = findViewById(R.id.layout4);
    }

    // 点击事件处理
    @Override
    public void onClick(View view) {
        Fragment fragmentToShow = null;

        // 根据点击的布局选择显示的 Fragment
        if (view.getId() == R.id.layout1) {
            fragmentToShow = fragment1;
        } else if (view.getId() == R.id.layout2) {
            fragmentToShow = fragment2;
        } else if (view.getId() == R.id.layout3) {
            fragmentToShow = fragment3;
        } else if (view.getId() == R.id.layout4) {
            fragmentToShow = fragment4;
        }

        // 显示所选的 Fragment
        if (fragmentToShow != null) {
            showFragment(fragmentToShow);
        }
    }

    // 显示所选的 Fragment
    private void showFragment(Fragment fragment) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        // 隐藏所有 Fragment
        transaction.hide(fragment1);
        transaction.hide(fragment2);
        transaction.hide(fragment3);
        transaction.hide(fragment4);

        // 显示所选的 Fragment
        transaction.show(fragment);
        transaction.commit();
    }
}

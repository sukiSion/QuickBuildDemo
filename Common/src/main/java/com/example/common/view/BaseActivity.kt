package com.example.common.view

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

abstract class  BaseActivity<T>: AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
    super.onCreate(savedInstanceState, persistentState)
  }

  override fun onDestroy() {
    super.onDestroy()
  }



}
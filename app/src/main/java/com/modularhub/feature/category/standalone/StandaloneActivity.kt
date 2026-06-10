package com.modularhub.feature.category.standalone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.modularhub.feature.category.CategoryFeature

class StandaloneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(android.R.id.content, CategoryFeature.createFragment())
                .commit()
        }
    }
}

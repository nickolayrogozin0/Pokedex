package com.brxq.poke

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.brxq.poke.ui.theme.PokeTheme
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var text : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokeTheme {
                Text(text)
            }
        }
    }
}

@HiltAndroidApp
class MyApp : Application(){}





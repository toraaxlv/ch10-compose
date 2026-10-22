package com.example.ch10

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

// Hilt merakit seluruh dependency aplikasi; tidak ada lagi perakitan manual.
@HiltAndroidApp
class MainApplication : Application()

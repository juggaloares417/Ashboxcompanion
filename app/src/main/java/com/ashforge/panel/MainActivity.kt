package com.ashforge.panel

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById<Button>(R.id.btnStart).setOnClickListener {
      Toast.makeText(this, "Start watcher (stub)", Toast.LENGTH_SHORT).show()
    }
    findViewById<Button>(R.id.btnLogs).setOnClickListener {
      Toast.makeText(this, "Open logs (stub)", Toast.LENGTH_SHORT).show()
    }
    findViewById<Button>(R.id.btnSettings).setOnClickListener {
      Toast.makeText(this, "Settings (stub)", Toast.LENGTH_SHORT).show()
    }
  }
}

package com.example.armandkevin.form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.armandkevin.R
import com.example.armandkevin.tasklist.Task
import java.util.*

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val buttonTask = findViewById<ImageButton>(R.id.activity_button)
        buttonTask.setOnClickListener {
            val newTask = Task(id = UUID.randomUUID().toString(), title = "New Task !")
            intent.putExtra("task", newTask)
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}
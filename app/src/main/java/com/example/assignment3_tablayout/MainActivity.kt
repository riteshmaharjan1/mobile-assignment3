package com.example.assignment3_tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var androidVerison: EditText
    lateinit var androidCodeName: EditText
    lateinit var tableLayout: TableLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        androidVerison = findViewById<EditText>(R.id.androidVersion)
        androidCodeName = findViewById<EditText>(R.id.androidCodeName)
        tableLayout = findViewById<TableLayout>(R.id.tableLayout)
    }

    fun addAndroidVersion(view: View) {

        val tableRow = TableRow(this)
        tableRow.setBackgroundResource(R.color.pink)
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT)
        tableRow.layoutParams = layoutParams

        val androidVersionText = TextView(this)
        androidVersionText.text = androidVerison.editableText.toString()

        val androidCodeNameText = TextView(this)
        androidCodeNameText.text = androidCodeName.editableText.toString()

        tableRow.addView(androidVersionText)
        tableRow.addView(androidCodeNameText)

        tableLayout.addView(tableRow)

    }
}
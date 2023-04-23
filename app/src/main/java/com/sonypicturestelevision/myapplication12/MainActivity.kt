package com.sonypicturestelevision.myapplication12

import android.content.Context
import android.content.Intent
import android.media.tv.TvContract.Programs.Genres.MUSIC
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val book = Book("Joan Rouling", "Harry Potter", 512, true)
        val student = Student("Michael", 18, 3)
        val music = Music("Thunder","Imagine Dragons","ENG")

        val intent = Intent(this, ActivityTwo::class.java)
        intent.putExtra("MUSIC", music)
        intent.putExtra("BOOK", book)
        //option 1
        intent.putExtra("STUDENT", student)
        //option 2
        val bundle = Bundle()
        bundle.putSerializable("STUDENT_BUNDLE", student)
        intent.putExtras(bundle)
        startActivity(intent)

        val prefs = getPreferences(Context.MODE_PRIVATE)
        prefs.edit().putString("TOAST", "Hello Preferences!").apply()
        val message = prefs.getString("TOAST", "default")
        Toast.makeText(this, message,Toast.LENGTH_LONG).show()

        val sharedPrefs = getSharedPreferences("MAIN", Context.MODE_PRIVATE)
    }
}
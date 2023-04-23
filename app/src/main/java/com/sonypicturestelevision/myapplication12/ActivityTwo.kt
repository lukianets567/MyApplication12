package com.sonypicturestelevision.myapplication12

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sonypicturestelevision.myapplication12.databinding.ActivityTwoBinding

class ActivityTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val book = intent.getParcelableExtra<Book>("BOOK")
        val studentB = intent.extras?.getSerializable("STUDENT_BUNDLE") as Student
        val student = intent.getSerializableExtra("STUDENT") as Student
        val music = intent.getParcelableExtra<Music>("MUSIC")

        binding.author.text = book?.author
        binding.bookName.text = book?.name
        binding.volume.text = book?.volume.toString()
        binding.ukrainian.isChecked = book?.isUkrainian!!

//        binding.name.text = student.name
//        binding.age.text = student.age.toString()
//        binding.group.text = student.group.toString()

        binding.name.text = studentB.name
        binding.age.text = studentB.age.toString()
        binding.group.text = studentB.group.toString()

        binding.MusicName.text = music?.name
        binding.singer.text = music?.singer
        binding.lang.text = music?.lang
    }
}
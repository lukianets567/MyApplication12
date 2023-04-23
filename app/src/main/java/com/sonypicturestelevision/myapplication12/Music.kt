package com.sonypicturestelevision.myapplication12

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Music(val name: String, val singer: String, val lang: String): Parcelable

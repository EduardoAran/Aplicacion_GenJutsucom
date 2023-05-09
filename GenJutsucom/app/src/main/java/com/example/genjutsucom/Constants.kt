package com.example.genjutsucom

import android.net.Uri
import android.widget.ListAdapter
import android.widget.ListView
import androidx.browser.customtabs.CustomTabsClient.getPackageName
import java.lang.Math.random
import kotlin.random.Random

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestion(): ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val que1 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.a,
            "D",
            "N",
            "A",
            "X",
            3,0
        )
        val que2 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.b,
            "B",
            "T",
            "A",
            "W",
            1,0
        )
        val que3 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.c,
            "O",
            "C",
            "P",
            "F",
            2,0
        )
        val que4 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.d,
            "D",
            "G",
            "L",
            "R",
            1,0
        )
        val que5 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.e,
            "Q",
            "V",
            "S",
            "E",
            4,0
        )
        val que6 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.f,
            "F",
            "R",
            "S",
            "T",
            1,0
        )
        val que7 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.g,
            "U",
            "G",
            "N",
            "A",
            2,0
        )
        val que8 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.h,
            "Q",
            "X",
            "E",
            "H",
            4,0
        )
        val que9 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.i,
            "I",
            "L",
            "V",
            "E",
            1,0
        )
        val que10 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.l,
            "P",
            "L",
            "C",
            "M",
            2,
            0
        )
        val que11 = Questions(
            1,
            "Traduce esta letra",
            0,
            "K",
            "J",
            "Ll",
            "F",
            3,
            R.raw.ll
        )
        val que12 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.m,
            "O",
            "M",
            "Ñ",
            "W",
            2,0
        )
        val que13 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.n,
            "Z",
            "M",
            "D",
            "N",
            4,0
        )
        val que14 = Questions(
            1,
            "Traduce esta letra",
            0,
            "Q",
            "A",
            "Ñ",
            "U",
            3,R.raw.nie
        )
        val que15 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.o,
            "O",
            "M",
            "Ñ",
            "W",
            1,0
        )
        val que16 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.p,
            "R",
            "P",
            "S",
            "L",
            2,0
        )
        val que17 = Questions(
            1,
            "Traduce esta letra",
            0,
            "Q",
            "Y",
            "C",
            "V",
            1,R.raw.q
        )
        val que18 = Questions(
            1,
            "Traduce esta letra",
            0,
            "J",
            "D",
            "A",
            "K",
            4,R.raw.k
        )
        val que19 = Questions(
            1,
            "Traduce esta letra",
            0,
            "J",
            "X",
            "M",
            "F",
            1,R.raw.j
        )
        val que20 = Questions(
            1,
            "Traduce esta letra",
            0,
            "I",
            "Z",
            "Rr",
            "O",
            3,R.raw.rr
        )
        val que21 = Questions(
            1,
            "Traduce esta letra",
            0,
            "H",
            "U",
            "G",
            "X",
            4,R.raw.x
        )
        val que22 = Questions(
            1,
            "Traduce esta letra",
            0,
            "Z",
            "T",
            "K",
            "Q",
            1,R.raw.z
        )
        val que23 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.r,
            "I",
            "R",
            "X",
            "Q",
            2,0
        )
        val que24 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.s,
            "S",
            "P",
            "B",
            "C",
            1,0
        )
        val que25 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.t,
            "P",
            "F",
            "T",
            "W",
            3,0
        )
        val que26 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.u,
            "X",
            "T",
            "I",
            "U",
            4,0
        )
        val que27 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.v,
            "V",
            "R",
            "E",
            "A",
            1,0
        )
        val que28 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.w,
            "N",
            "J",
            "W",
            "C",
            3,0
        )
        val que29 = Questions(
            1,
            "Traduce esta letra",
            R.drawable.y,
            "Y",
            "D",
            "E",
            "Z",
            1,0
        )

        val list = listOf(que1,que2,que3,que4,que5,que6,que7,que8,que9,que10,que11,que12,que13,que14,que15,que16,que17,que18,que19,que20,que21,que22,que23,que24,que25,que26,que27,que28,que29)

        for (i in 1..10) {
            val choice = list.random()
            questionsList.add(choice)
        }

        return questionsList
    }
}
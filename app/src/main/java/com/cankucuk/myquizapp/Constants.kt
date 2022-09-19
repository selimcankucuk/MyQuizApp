package com.cankucuk.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val que1 = Questions(
            id = 1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Australia",
            "Armenia","Austria",
            1
        )
        questionsList.add(que1)

        val que2 = Questions(
            id = 2,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Germany","Georgia",
            "Belgium","Austria",
            3
        )
        questionsList.add(que2)

        val que3 = Questions(
            id = 3,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Austria","Australia",
            "New Zealand","United Kingdom",
            2
        )
        questionsList.add(que3)

        val que4 = Questions(
            id = 4,"What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Austria","Australia",
            "New Zealand","United Kingdom",
            3
        )
        questionsList.add(que4)

        val que5 = Questions(
            id = 5,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Iraq","Syria",
            "Pakistan","India",
            4
        )
        questionsList.add(que5)

        val que6 = Questions(
            id = 6,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Austria","Australia",
            "Germany","United Kingdom",
            3
        )
        questionsList.add(que6)

        val que7 = Questions(
            id = 7,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark","Iceland",
            "Ireland","United Kingdom",
            1
        )
        questionsList.add(que7)

        val que8 = Questions(
            id = 8,"What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Jordan","Kuwait",
            "Qatar","Iran",
            2
        )
        questionsList.add(que8)
        return questionsList
    }

}
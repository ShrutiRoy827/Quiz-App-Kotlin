package com.example.quizapp

import com.example.quizapp.data.Question

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWER: String = "correct_answer"

    fun getQuestion(): ArrayList<Question> {

        val questionList = ArrayList<Question>()

        val question1 = Question(
            1,
            "Which country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Armenia", "Austria",
            1,
        )
        questionList.add(question1)

        val question2 = Question(
            2,
            "Which country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria", "Australia", "Armenia",
            3,
        )
        questionList.add(question2)

        val question3 = Question(
            3,
            "Which country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize", "Brunei", "Brazil",
            4,
        )
        questionList.add(question3)

        val question4 = Question(
            4,
            "Which country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgium", "Barbados", "Belize",
            2,
        )
        questionList.add(question4)

        val question5 = Question(
            5,
            "Which country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France", "Fiji", "Finland",
            3,
        )
        questionList.add(question5)

        val question6 = Question(
            6,
            "Which country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia", "Greece", "none of these",
            1,
        )
        questionList.add(question6)

        val question7 = Question(
            7,
            "Which country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt", "Denmark", "Ethiopia",
            3,
        )
        questionList.add(question7)

        val question8 = Question(
            8,
            "Which country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran", "Hungary", "India",
            4,
        )
        questionList.add(question8)

        val question9 = Question(
            9,
            "Which country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand", "Jordan", "Sudan", "Palestine",
            1,
        )
        questionList.add(question9)

        val question10 = Question(
            10,
            "Which country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Germany", "Kuwait", "Egypt", "France",
            2,
        )
        questionList.add(question10)

        return questionList
    }
}
package com.howlonely.quizzapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.howlonely.quizzapp.databinding.ActivityQuizzBinding
import kotlin.random.Random

class QuizzActivity : AppCompatActivity() {
    private var currentPosition:Int = 0
    private var randomDemo:ArrayList<QuestionData> ?= null
    private var selectedOption:Int = 0
    private lateinit var binding: ActivityQuizzBinding
    private var score:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizzBinding.inflate(layoutInflater)
        setContentView(binding.root)

        randomDemo = getRandomQuestions()
        setQuestion()

        binding.tvSubmit.setOnClickListener { onClickButton(0)}
        binding.tvOption1.setOnClickListener { onClickButton(1) }
        binding.tvOption2.setOnClickListener { onClickButton(2) }
        binding.tvOption3.setOnClickListener { onClickButton(3) }
        binding.tvOption4.setOnClickListener { onClickButton(4) }


    }

    fun onClickButton(option:Int) {
        if (option == 1) {
            binding.tvOption1.setBackgroundResource(R.drawable.selected_option_background)
            binding.tvOption2.setBackgroundResource(R.drawable.option_background)
            binding.tvOption3.setBackgroundResource(R.drawable.option_background)
            binding.tvOption4.setBackgroundResource(R.drawable.option_background)
            selectedOption = 1
        } else if (option == 2) {
            binding.tvOption2.setBackgroundResource(R.drawable.selected_option_background)
            binding.tvOption1.setBackgroundResource(R.drawable.option_background)
            binding.tvOption3.setBackgroundResource(R.drawable.option_background)
            binding.tvOption4.setBackgroundResource(R.drawable.option_background)
            selectedOption = 2
        } else if (option == 3) {
            binding.tvOption3.setBackgroundResource(R.drawable.selected_option_background)
            binding.tvOption1.setBackgroundResource(R.drawable.option_background)
            binding.tvOption2.setBackgroundResource(R.drawable.option_background)
            binding.tvOption4.setBackgroundResource(R.drawable.option_background)
            selectedOption = 3
        } else if (option == 4) {
            binding.tvOption4.setBackgroundResource(R.drawable.selected_option_background)
            binding.tvOption1.setBackgroundResource(R.drawable.option_background)
            binding.tvOption2.setBackgroundResource(R.drawable.option_background)
            binding.tvOption3.setBackgroundResource(R.drawable.option_background)
            selectedOption = 4
        } else if (option == 0) {
            if (currentPosition+1 == randomDemo!!.size) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("score", score)
                startActivity(intent)
            } else {
                val quest = randomDemo!![currentPosition]
                Log.d("onclick quest", quest.toString())
                val correctAns = quest.correct_ans
                Log.d("Answer", "Correct answer: $correctAns Selected Option: $option")
                if (selectedOption == correctAns) {
                    score++


                    Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_SHORT).show()


                    Log.d("score_quizz", score.toString())
                } else {
                    Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show()
                }
                currentPosition++
                Log.d("Current Position", currentPosition.toString())
                //Thread.sleep(1000)
                setQuestion()
            }
        }

    }



    fun getRandomQuestions(): ArrayList<QuestionData> {
        val demo = setData.getQuestion()

        val randomQuestionsList: ArrayList<QuestionData> = arrayListOf()

        val selectedIndex:ArrayList<Int> ?= null

        for (i in 1..10) {
            var randomIndex = Random.nextInt(demo.size)
            Log.d("randomIndex", randomIndex.toString())
            if (selectedIndex != null) {
                selectedIndex.add(randomIndex)
                while (randomIndex in selectedIndex) {
                    randomIndex = Random.nextInt(demo.size)
                }
            }

            val randomQuestion = demo[randomIndex]
            randomQuestionsList.add(randomQuestion)
        }

        return randomQuestionsList
    }

    fun setQuestion(){
        binding.tvOption1.setBackgroundResource(R.drawable.option_background)
        binding.tvOption2.setBackgroundResource(R.drawable.option_background)
        binding.tvOption3.setBackgroundResource(R.drawable.option_background)
        binding.tvOption4.setBackgroundResource(R.drawable.option_background)

        val question = randomDemo!![currentPosition]
        Log.d("setQuestion", question.toString())

        binding.pbProgress.progress=currentPosition
        binding.pbProgress.max=randomDemo!!.size
        binding.tvProgress.text="${currentPosition} / ${binding.pbProgress.max}"
        binding.tvQuestion.text = question.question
        binding.tvOption1.text = question.option_one
        binding.tvOption2.text = question.option_two
        binding.tvOption3.text = question.option_three
        binding.tvOption4.text = question.option_four
    }

}
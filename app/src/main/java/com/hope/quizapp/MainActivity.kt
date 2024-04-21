package com.hope.quizapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var textview : TextView? = null
    var textview1 : TextView? = null
    var image : ImageView? = null

    var button1 : Button? = null
    var button2 : Button? = null
    var button3 : Button? = null
    var button4 : Button? = null
    var button5 : Button? = null

    var answer : String = ""
    var index : Int = 0
    var click : Button? = null
    var clickable : Boolean = true
    var score : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
    }

    fun next (view: View) {
        setContentView(R.layout.activity_main2);
        textview = findViewById(R.id.text)
        textview1 = findViewById(R.id.text1)
        image = findViewById(R.id.image)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)

        var quesList = listOf( listOf("Who was the first President of India ?", "DR.RAJENDRA PRASAD", "MAHATMA GANDHI", "JAWAHARLAL NEHRU","INDIRA GANDHI", "DR.RAJENDRA PRASAD"),
            listOf("WHO IS KNOWN AS FATHER OF INDIAN CONSTITUTION ?", "DR.RAJENDRA PRASAD", "MAHATMA GANDHI", "DR.B.R.AMBEDKAR", "INDIRA GANDHI", "DR.B.R.AMBEDKAR"),
            listOf("WHICH IS THE MOST SENSITIVE ORGAN IN OUR BODY ?", "EAR", "NOSE", "EYE", "SKIN", "SKIN"),
            listOf("GIDDHA IS THE FOLK DANCE OF ?", "MAHARASHTRA", "PUNJAB", "KERALA", "TELANGANA", "PUNJAB"),
            listOf("GIR NATIONAL PARK IN GUJARAT IS FAMOUS FOR ?", "ELEPHANT", "DEER", "LION", "TIGER", "LION"),
            listOf("AGRA IS SITUATED ON THE BANK OF RIVER ?", "YAMUNA", "GANGES", "KRISHNA RIVER", "BRAHMAPUTRA", "YAMUNA"),
            listOf("WHICH ORGAN PURIFY OUR BLOOD ?", "LUNGS", "LIVER", "HEART", "KIDNEY", "KIDNEY"),
            listOf("WHAT IS THE RICHEST STATE IN INDIA ?", "TAMILNADU", "KARNADAKA", "MAHARASHTRA", "KERALA", "MAHARASHTRA"),
            listOf("WHICH COUNTRY HAS WORLD BEST EDUCATION SYSTEM ?", "AMERICA", "SWEDEN", "JAPAN", "GERMANY", "SWEDEN"),
            listOf("WHAT IS THE NAME OF THE MOST POPULAR SPORT IN THE WORLD ?", "HOCKEY", "CHESS", "SOCCER", "CRICKET", "SOCCER"),
            listOf("WHAT IS THE LARGEST LAKE IN THE WORLD ?", "CASPIAN SEA", "BAIKAL", "ONTARIO", "LAKE SUPERIOR", "BAIKAL"),
            listOf("WHICH PLANET IN THE SOLAR SYSTEM IS KNOWN AS THE “RED PLANET” ?", "VENUS", "EARTH", "MARS", "JUPITER", "MARS"),
            listOf("WHO WROTE THE NOVEL “WAR AND PEACE” ?", "ANTON CHEKHOV", "IVAN TURGENEV", "FYODOR DOSTOEVSKY", "LEO TOLSTOY", "LEO TOLSTOY"),
            listOf("WHAT ANIMAL IS THE NATIONAL SYMBOL OF AUSTRALIA ?", "KANGAROO", "KOALA", "EMU", "CROCODILE", "KANGAROO"),
            listOf("WHAT IS THE NAME OF THE PROCESS BY WHICH PLANTS CONVERT SUNLIGHT INTO ENERGY ?", "RESPIRATION", "PHOTOSYNTHESIS", "OXIDATION", "EVOLUTION", "PHOTOSYNTHESIS"),
            listOf("WHAT CHEMICAL ELEMENT IS DESIGNATED AS “HG” ?", "SILVER", "TIN", "COPPER", "MERCURY", "MERCURY"),
            listOf("WHICH IS THE LARGEST ISLAND ?", "NEW GUINEA", "ANDAMAN NICOBAR", "GREENLAND", "HAWAII", "GREENLAND"),
            listOf("HOW MANY BONES ARE IN THE BODY OF AN ADULT HUMAN ?", "330", "206", "250", "210", "206"),
            listOf("WHICH RIVER IS THE SECOND LONGEST IN THE WORLD ?", "AMAZON", "NILE", "MISSISSIPPI", "YANGTZE", "YANGTZE"),
            listOf("WHAT CHEMICAL ELEMENT IS USED TO COOL AND FREEZE FOOD ?", "SODIUM", "HYDROGEN", "NITROGEN", "OXYGEN", "NITROGEN"))


        textview?.text = quesList[index][0]
        button1?.text = quesList[index][1]
        button2?.text = quesList[index][2]
        button3?.text = quesList[index][3]
        button4?.text = quesList[index][4]
        answer = quesList[index][5]

        button1?.setBackgroundColor(Color.BLACK)
        button2?.setBackgroundColor(Color.BLACK)
        button3?.setBackgroundColor(Color.BLACK)
        button4?.setBackgroundColor(Color.BLACK)
    }

    fun question(view: View) {
        image?.setImageResource(R.drawable.white)
        index++
        clickable = true
        click = null

        var quesList = listOf( listOf("Who was the first President of India ?", "DR.RAJENDRA PRASAD", "MAHATMA GANDHI", "JAWAHARLAL NEHRU","INDIRA GANDHI", "DR.RAJENDRA PRASAD"),
            listOf("WHO IS KNOWN AS FATHER OF INDIAN CONSTITUTION ?", "DR.RAJENDRA PRASAD", "MAHATMA GANDHI", "DR.B.R.AMBEDKAR", "INDIRA GANDHI", "DR.B.R.AMBEDKAR"),
            listOf("WHICH IS THE MOST SENSITIVE ORGAN IN OUR BODY ?", "EAR", "NOSE", "EYE", "SKIN", "SKIN"),
            listOf("GIDDHA IS THE FOLK DANCE OF ?", "MAHARASHTRA", "PUNJAB", "KERALA", "TELANGANA", "PUNJAB"),
            listOf("GIR NATIONAL PARK IN GUJARAT IS FAMOUS FOR ?", "ELEPHANT", "DEER", "LION", "TIGER", "LION"),
            listOf("AGRA IS SITUATED ON THE BANK OF RIVER ?", "YAMUNA", "GANGES", "KRISHNA RIVER", "BRAHMAPUTRA", "YAMUNA"),
            listOf("WHICH ORGAN PURIFY OUR BLOOD ?", "LUNGS", "LIVER", "HEART", "KIDNEY", "KIDNEY"),
            listOf("WHAT IS THE RICHEST STATE IN INDIA ?", "TAMILNADU", "KARNADAKA", "MAHARASHTRA", "KERALA", "MAHARASHTRA"),
            listOf("WHICH COUNTRY HAS WORLD BEST EDUCATION SYSTEM ?", "AMERICA", "SWEDEN", "JAPAN", "GERMANY", "SWEDEN"),
            listOf("WHAT IS THE NAME OF THE MOST POPULAR SPORT IN THE WORLD ?", "HOCKEY", "CHESS", "SOCCER", "CRICKET", "SOCCER"),
            listOf("WHAT IS THE LARGEST LAKE IN THE WORLD ?", "CASPIAN SEA", "BAIKAL", "ONTARIO", "LAKE SUPERIOR", "BAIKAL"),
            listOf("WHICH PLANET IN THE SOLAR SYSTEM IS KNOWN AS THE “RED PLANET” ?", "VENUS", "EARTH", "MARS", "JUPITER", "MARS"),
            listOf("WHO WROTE THE NOVEL “WAR AND PEACE” ?", "ANTON CHEKHOV", "IVAN TURGENEV", "FYODOR DOSTOEVSKY", "LEO TOLSTOY", "LEO TOLSTOY"),
            listOf("WHAT ANIMAL IS THE NATIONAL SYMBOL OF AUSTRALIA ?", "KANGAROO", "KOALA", "EMU", "CROCODILE", "KANGAROO"),
            listOf("WHAT IS THE NAME OF THE PROCESS BY WHICH PLANTS CONVERT SUNLIGHT INTO ENERGY ?", "RESPIRATION", "PHOTOSYNTHESIS", "OXIDATION", "EVOLUTION", "PHOTOSYNTHESIS"),
            listOf("WHAT CHEMICAL ELEMENT IS DESIGNATED AS “HG” ?", "SILVER", "TIN", "COPPER", "MERCURY", "MERCURY"),
            listOf("WHICH IS THE LARGEST ISLAND ?", "NEW GUINEA", "ANDAMAN NICOBAR", "GREENLAND", "HAWAII", "GREENLAND"),
            listOf("HOW MANY BONES ARE IN THE BODY OF AN ADULT HUMAN ?", "330", "206", "250", "210", "206"),
            listOf("WHICH RIVER IS THE SECOND LONGEST IN THE WORLD ?", "AMAZON", "NILE", "MISSISSIPPI", "YANGTZE", "YANGTZE"),
            listOf("WHAT CHEMICAL ELEMENT IS USED TO COOL AND FREEZE FOOD ?", "SODIUM", "HYDROGEN", "NITROGEN", "OXYGEN", "NITROGEN"))

        textview?.text = quesList[index][0]

        button1?.text = quesList[index][1]
        button2?.text = quesList[index][2]
        button3?.text = quesList[index][3]
        button4?.text = quesList[index][4]

        answer = quesList[index][5]

        button1?.setBackgroundColor(Color.BLACK)
        button2?.setBackgroundColor(Color.BLACK)
        button3?.setBackgroundColor(Color.BLACK)
        button4?.setBackgroundColor(Color.BLACK)
    }


    fun button1(view: View){
        if(clickable) {
            click = button1
            button1?.setBackgroundColor(Color.GRAY)
            button2?.setBackgroundColor(Color.BLACK)
            button3?.setBackgroundColor(Color.BLACK)
            button4?.setBackgroundColor(Color.BLACK)
        }
    }


    fun button2(view: View){
        if(clickable) {
            click = button2
            button1?.setBackgroundColor(Color.BLACK)
            button2?.setBackgroundColor(Color.GRAY)
            button3?.setBackgroundColor(Color.BLACK)
            button4?.setBackgroundColor(Color.BLACK)
        }
    }


    fun button3(view: View){
        if(clickable) {
            click = button3
            button1?.setBackgroundColor(Color.BLACK)
            button2?.setBackgroundColor(Color.BLACK)
            button3?.setBackgroundColor(Color.GRAY)
            button4?.setBackgroundColor(Color.BLACK)
        }
    }


    fun button4(view: View){
        if(clickable) {
            click = button4
            button1?.setBackgroundColor(Color.BLACK)
            button2?.setBackgroundColor(Color.BLACK)
            button3?.setBackgroundColor(Color.BLACK)
            button4?.setBackgroundColor(Color.GRAY)
        }
    }


    fun button5(view: View){
        clickable = false

        var images = listOf(
            R.drawable.rajendraprasad,
            R.drawable.ambedkar,
            R.drawable.skin,
            R.drawable.punjab,
            R.drawable.lion,
            R.drawable.yamuna,
            R.drawable.kidney,
            R.drawable.maharashtra,
            R.drawable.sweden,
            R.drawable.soccer,
            R.drawable.baikal,
            R.drawable.mars,
            R.drawable.leotolstoy,
            R.drawable.kangaroo,
            R.drawable.photosynthesis,
            R.drawable.mercury,
            R.drawable.greenland,
            R.drawable.skeleton,
            R.drawable.yangtze,
            R.drawable.nitrogen)

        if (button5?.text == "SUBMIT") {
            button5?.text = "NEXT"

            image?.setImageResource(images[index])

            if (answer == click?.text) {
                click?.setBackgroundColor(Color.GREEN)
                score++
            }
            else {
                click?.setBackgroundColor(Color.RED)
                if (answer == button1?.text) {
                    button1?.setBackgroundColor(Color.GREEN)
                }
                else if (answer == button2?.text) {
                    button2?.setBackgroundColor(Color.GREEN)
                }
                else if (answer == button3?.text) {
                    button3?.setBackgroundColor(Color.GREEN)
                }
                else {
                    button4?.setBackgroundColor(Color.GREEN)
                }
            }

        }
        else {
            if (index == 19){
                button1?.setBackgroundColor(Color.WHITE)
                button2?.setBackgroundColor(Color.WHITE)
                button3?.setBackgroundColor(Color.WHITE)
                button4?.setBackgroundColor(Color.WHITE)
                button5?.setBackgroundColor(Color.WHITE)

                textview?.text = "YOUR SCORE IS $score"
                image?.setImageResource(R.drawable.hope3)

                textview1?.text = "\uD83C\uDF38 \uD83C\uDF38 THANK YOU \uD83C\uDF38 \uD83C\uDF38"
            }
            else {
                button5?.text = "SUBMIT"
                question(view)
            }

        }
    }
}


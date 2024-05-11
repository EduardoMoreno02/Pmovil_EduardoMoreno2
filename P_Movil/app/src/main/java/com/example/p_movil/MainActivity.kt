package com.example.p_movil
import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.MenuItem

import android.view.View
import android.widget.*
import com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
import org.intellij.lang.annotations.Language

class MainActivity : AppCompatActivity() {

    private lateinit var textView : TextView
    private lateinit var english: TextView
    private lateinit var aleman: TextView
    private lateinit var hindi: TextView
    private lateinit var Frances: TextView
    private lateinit var Holandes: TextView






    private val languageList = arrayListOf<String>(

       "English",
        "Hindi(हिंदी)",
        "Aleman (Deutsch)",
        "Frances (Français)",
        "Holandes (Nederlands)"

    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        english = findViewById(R.id.english)
        hindi = findViewById(R.id.hindi)
        aleman = findViewById(R.id.Alem)
        textView = findViewById(R.id.textView)
        Frances = findViewById(R.id.Frances)
        Holandes = findViewById(R.id.Holanda)
        val simpleLangSpinner = findViewById<Spinner>(R.id.simpleLangSpinner)
        simpleLangSpinner.adapter =
            ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,languageList)


        simpleLangSpinner.onItemSelectedListener = object : OnItemSelectedListener, AdapterView.OnItemSelectedListener {


            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@MainActivity,
                    languageList[position],
                    Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onNavigationItemSelected(p0: MenuItem): Boolean {
                TODO("Not yet implemented")
            }
        }

        val simpleLangBtn = findViewById<Button>(R.id.simplelangBtn)
        simpleLangBtn.setOnClickListener{

            Toast.makeText(this@MainActivity,
                languageList[simpleLangSpinner.selectedItemPosition],
                Toast.LENGTH_LONG).show()
        }

        simpleLangBtn.setOnClickListener{

            if(languageList.contains("English")){

            textView.visibility = View.INVISIBLE
            english.visibility = View.VISIBLE
            simpleLangBtn.visibility = View.VISIBLE
            simpleLangSpinner.visibility = View.VISIBLE
             aleman.visibility = View.INVISIBLE


                }
            simpleLangBtn.setOnClickListener{
                if(languageList.contains("Hindi(हिंदी)")){
                    textView.visibility = View.INVISIBLE
                    hindi.visibility = View.VISIBLE
                    english.visibility = View.INVISIBLE
                    aleman.visibility = View.INVISIBLE
                    simpleLangBtn.visibility = View.VISIBLE
                    simpleLangSpinner.visibility = View.VISIBLE

                }
                simpleLangBtn.setOnClickListener{
                    if(languageList.contains("Aleman (Deutsch)")){

                        aleman.visibility = View.VISIBLE
                        english.visibility = View.INVISIBLE
                        hindi.visibility = View.INVISIBLE
                        simpleLangBtn.visibility = View.VISIBLE
                        simpleLangSpinner.visibility = View.VISIBLE


                    }
                    simpleLangBtn.setOnClickListener{
                        if(languageList.contains("Frances (Français)")){

                            Frances.visibility = View.VISIBLE
                            aleman.visibility = View.INVISIBLE
                            english.visibility = View.INVISIBLE
                            hindi.visibility = View.INVISIBLE
                            simpleLangBtn.visibility = View.VISIBLE
                            simpleLangSpinner.visibility = View.VISIBLE


                        }
                        simpleLangBtn.setOnClickListener{
                            if(languageList.contains("Holandes (Nederlands)")){

                                Holandes.visibility = View.VISIBLE
                                Frances.visibility = View.INVISIBLE
                                aleman.visibility = View.INVISIBLE
                                english.visibility = View.INVISIBLE
                                hindi.visibility = View.INVISIBLE
                                simpleLangBtn.visibility = View.VISIBLE
                                simpleLangSpinner.visibility = View.VISIBLE


                            }
                        }
                    }

                }
            }



        }




}
}





//Ejercicio anterior

    /*

    package com.example.p_movil


import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im

import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btnAccept: Button
    private lateinit var text: TextView
    private lateinit var name: EditText
    private lateinit var ape: EditText
    private lateinit var num: EditText
    private lateinit var email: EditText
    private lateinit var tic: ImageView
    private lateinit var cruz: ImageView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAccept = findViewById(R.id.btnAccept)
        text = findViewById(R.id.text)
        name = findViewById(R.id.name)
        ape= findViewById(R.id.ape)
        num=findViewById(R.id.num)
        email=findViewById(R.id.email)
        tic=findViewById(R.id.tic)
        cruz=findViewById(R.id.cruz)


        btnAccept.setOnClickListener{

            if (ape.editableText.isEmpty()||name.editableText.isEmpty()||num.editableText.isEmpty()||email.editableText.isEmpty()){

                cruz.visibility= View.VISIBLE
                tic.visibility=View.INVISIBLE
            }
            else{
                tic.visibility= View.VISIBLE
                cruz.visibility=View.INVISIBLE
            }

            btnAccept.visibility = View.INVISIBLE
            name.visibility = View.INVISIBLE
            ape.visibility = View.INVISIBLE
            num.visibility = View.INVISIBLE
            email.visibility = View.INVISIBLE


            btnAccept.isEnabled
           // text.text = getString(R.string.button_clicked)






        }

    }


}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAccept = findViewById(R.id.btnAccept)
        text = findViewById(R.id.text)
        name = findViewById(R.id.name)
        ape= findViewById(R.id.ape)
        num=findViewById(R.id.num)
        email=findViewById(R.id.email)
        tic=findViewById(R.id.tic)
        cruz=findViewById(R.id.cruz)


        btnAccept.setOnClickListener{

            if (ape.editableText.isEmpty()||name.editableText.isEmpty()||num.editableText.isEmpty()||email.editableText.isEmpty()){

                cruz.visibility= View.VISIBLE
                tic.visibility=View.INVISIBLE
            }
            else{
                tic.visibility= View.VISIBLE
                cruz.visibility=View.INVISIBLE
            }

            btnAccept.visibility = View.INVISIBLE
            name.visibility = View.INVISIBLE
            ape.visibility = View.INVISIBLE
            num.visibility = View.INVISIBLE
            email.visibility = View.INVISIBLE


            btnAccept.isEnabled
           // text.text = getString(R.string.button_clicked)






        }

    }


}*/
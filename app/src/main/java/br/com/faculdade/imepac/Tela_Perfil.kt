package br.com.faculdade.imepac

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Tela_Perfil: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login)
        getSupportActionBar()?.hide();
    }
}

//ActivitySatu
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity3">

    <TextView
        android:id="@+id/textView"
        android:layout_width="203dp"
        android:layout_height="27dp"
        android:layout_marginStart="18dp"
        android:layout_marginTop="23dp"
        android:fontFamily="@font/poppinsbold"
        android:text="Universitas Trunojoyo"
        android:textSize="18sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <ImageView
        android:id="@+id/imageView6"
        android:layout_width="36dp"
        android:layout_height="36dp"
        android:layout_marginStart="113dp"
        android:layout_marginTop="23dp"
        android:layout_marginEnd="20dp"
        android:src="@drawable/logo"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/textView"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView4"
        android:layout_width="65dp"
        android:layout_height="23dp"
        android:layout_marginTop="5dp"
        android:fontFamily="@font/poppinsmedium"
        android:text="Profile"
        app:layout_constraintStart_toStartOf="@+id/textView"
        app:layout_constraintTop_toBottomOf="@+id/textView" />

    <ImageView
        android:id="@+id/imageView3"
        android:layout_width="169dp"
        android:layout_height="168dp"
        android:layout_marginTop="68dp"
        android:src="@drawable/logo2"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView4" />

    <TextView
        android:id="@+id/textView11"
        android:layout_width="203dp"
        android:layout_height="27dp"
        android:layout_marginTop="21dp"
        android:fontFamily="@font/poppinsbold"
        android:text="Universitas Trunojoyo"
        android:textSize="18sp"
        app:layout_constraintEnd_toEndOf="@+id/imageView3"
        app:layout_constraintStart_toStartOf="@+id/imageView3"
        app:layout_constraintTop_toBottomOf="@+id/imageView3" />

    <TextView
        android:id="@+id/textView12"
        android:layout_width="124sp"
        android:layout_height="26sp"
        android:layout_marginTop="63dp"
        android:fontFamily="@font/poppinssemibold"
        android:text="Profile Singkat"
        app:layout_constraintStart_toStartOf="@+id/textView4"
        app:layout_constraintTop_toBottomOf="@+id/textView11" />

    <TextView
        android:layout_width="356dp"
        android:layout_height="231dp"
        android:layout_marginTop="12dp"
        android:fontFamily="@font/poppinslight"
        android:justificationMode="inter_word"
        android:text="Universitas Trunojoyo Madura atau UTM adalah perguruan tinggi negeri yang terletak di Kamal, Kabupaten Bangkalan, Jawa Timur, Pulau Madura, Indonesia. Universitas Trunojoyo Madura dahulu merupakan universitas swasta yang resmi menjadi perguruan tinggi negeri berdasarkan Keputusan Presiden tanggal 5 Juli 2001. Perguruan tinggi ini diresmikan pada tanggal 23 Juli 2001 oleh Presiden Abdurrahman Wahid. Universitas Trunojoyo Madura merupakan perguruan tinggi negeri ke-7 di Jawa Timur."
        app:layout_constraintEnd_toEndOf="@+id/imageView6"
        app:layout_constraintStart_toStartOf="@+id/textView12"
        app:layout_constraintTop_toBottomOf="@+id/textView12" />

</androidx.constraintlayout.widget.ConstraintLayout>

package com.example.modul1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun openSecondActivity(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}

//ActivityDua
<?xml version="1.0" encoding="utf-8"?>
<androidx.core.widget.NestedScrollView
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity2">

    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <TextView
            android:id="@+id/textView"
            android:layout_width="0dp"
            android:layout_height="27dp"
            android:layout_marginStart="18dp"
            android:layout_marginTop="23dp"
            android:fontFamily="@font/poppinsbold"
            android:text="Universitas Trunojoyo"
            android:textSize="18sp"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <ImageButton
            android:id="@+id/imageButton"
            android:layout_width="36dp"
            android:layout_height="wrap_content"
            android:layout_marginStart="113dp"
            android:layout_marginEnd="23dp"
            android:adjustViewBounds="true"
            android:src="@drawable/logo"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toEndOf="@+id/textView"
            app:layout_constraintTop_toTopOf="@+id/textView" />

        <TextView
            android:id="@+id/textView4"
            android:layout_width="65dp"
            android:layout_height="23dp"
            android:layout_marginTop="5dp"
            android:fontFamily="@font/poppinsmedium"
            android:text="Beranda"
            app:layout_constraintStart_toStartOf="@+id/textView"
            app:layout_constraintTop_toBottomOf="@+id/textView" />

        <TextView
            android:id="@+id/textView5"
            android:layout_width="138dp"
            android:layout_height="23dp"
            android:layout_marginStart="8dp"
            android:layout_marginTop="36dp"
            android:fontFamily="@font/poppinssemibold"
            android:text="Aktivitas Kegiatan"
            android:textSize="15sp"
            app:layout_constraintStart_toStartOf="@+id/textView4"
            app:layout_constraintTop_toBottomOf="@+id/textView4" />

        <ImageView
            android:id="@+id/imageView"
            android:layout_width="165dp"
            android:layout_height="165dp"
            android:layout_marginTop="12dp"
            android:src="@drawable/bahan1"
            app:layout_constraintStart_toStartOf="@+id/textView5"
            app:layout_constraintTop_toBottomOf="@+id/textView5" />

        <ImageView
            android:id="@+id/imageView4"
            android:layout_width="165dp"
            android:layout_height="165dp"
            android:layout_marginStart="27dp"
            android:layout_marginTop="12dp"
            android:layout_marginEnd="18dp"
            android:src="@drawable/bahan2"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toEndOf="@+id/imageView"
            app:layout_constraintTop_toBottomOf="@+id/textView5" />

        <ImageView
            android:id="@+id/imageView2"
            android:layout_width="165dp"
            android:layout_height="165dp"
            android:layout_marginTop="27dp"
            android:src="@drawable/bahan1"
            app:layout_constraintStart_toStartOf="@+id/textView5"
            app:layout_constraintTop_toBottomOf="@+id/imageView" />

        <ImageView
            android:id="@+id/imageView5"
            android:layout_width="165dp"
            android:layout_height="165dp"
            android:layout_marginStart="27dp"
            android:layout_marginTop="27dp"
            android:src="@drawable/bahan2"
            app:layout_constraintEnd_toEndOf="@+id/imageView4"
            app:layout_constraintStart_toEndOf="@+id/imageView"
            app:layout_constraintTop_toBottomOf="@+id/imageView4" />

        <TextView
            android:id="@+id/textView6"
            android:layout_width="49dp"
            android:layout_height="23dp"
            android:layout_marginTop="38dp"
            android:layout_marginEnd="18dp"
            android:fontFamily="@font/poppinssemibold"
            android:text="Artikel"
            app:layout_constraintStart_toStartOf="@+id/textView5"
            app:layout_constraintTop_toBottomOf="@+id/imageView2" />

        <ImageView
            android:id="@+id/imageView8"
            android:layout_width="116dp"
            android:layout_height="116dp"
            android:layout_marginTop="15dp"
            android:src="@drawable/bahan1"
            app:layout_constraintStart_toStartOf="@+id/textView6"
            app:layout_constraintTop_toBottomOf="@+id/textView6" />

        <TextView
            android:id="@+id/textView7"
            android:layout_width="228dp"
            android:layout_height="20dp"
            android:fontFamily="@font/poppinsmedium"
            android:text="Terlalu Jago, Trunojoyo Juara Lagi"
            android:textSize="13sp"
            app:layout_constraintEnd_toEndOf="@+id/imageView5"
            app:layout_constraintTop_toTopOf="@+id/imageView8" />

        <TextView
            android:id="@+id/textView9"
            android:layout_width="228dp"
            android:layout_height="51dp"
            android:layout_marginTop="15dp"
            android:fontFamily="@font/poppinslight"
            android:justificationMode="inter_word"
            android:text="Universitas Trunojoyo berhasil meraih \njuara 1 dalam ajang perlombaan debat nasional yang diselenggarakan oleh..."
            android:textSize="11sp"
            app:layout_constraintEnd_toEndOf="@+id/textView7"
            app:layout_constraintStart_toStartOf="@+id/textView7"
            app:layout_constraintTop_toBottomOf="@+id/textView7" />

        <ImageView
            android:id="@+id/imageview9"
            android:layout_width="116dp"
            android:layout_height="116dp"
            android:layout_marginTop="26dp"
            android:src="@drawable/bahan1"
            app:layout_constraintStart_toStartOf="@+id/imageView8"
            app:layout_constraintTop_toBottomOf="@+id/imageView8" />

        <TextView
            android:id="@+id/textView8"
            android:layout_width="228dp"
            android:layout_height="20dp"
            android:fontFamily="@font/poppinsmedium"
            android:text="Terlalu Jago, Trunojoyo Juara Lagi"
            android:textSize="13sp"
            app:layout_constraintEnd_toEndOf="@+id/textView9"
            app:layout_constraintStart_toStartOf="@+id/textView7"
            app:layout_constraintTop_toTopOf="@+id/imageview9" />

        <TextView
            android:id="@+id/textView10"
            android:layout_width="228dp"
            android:layout_height="51dp"
            android:layout_marginTop="15dp"
            android:fontFamily="@font/poppinslight"
            android:justificationMode="inter_word"
            android:text="Universitas Trunojoyo berhasil meraih \njuara 1 dalam ajang perlombaan debat nasional yang diselenggarakan oleh..."
            android:textSize="11sp"
            app:layout_constraintEnd_toEndOf="@+id/textView8"
            app:layout_constraintStart_toStartOf="@+id/textView8"
            app:layout_constraintTop_toBottomOf="@+id/textView8" />

        <ImageView
            android:id="@+id/imageview10"
            android:layout_width="116dp"
            android:layout_height="116dp"
            android:layout_marginTop="26dp"
            android:src="@drawable/bahan1"
            app:layout_constraintStart_toStartOf="@+id/imageview9"
            app:layout_constraintTop_toBottomOf="@+id/imageview9" />

        <TextView
            android:id="@+id/textView20"
            android:layout_width="228dp"
            android:layout_height="20dp"
            android:fontFamily="@font/poppinsmedium"
            android:text="Terlalu Jago, Trunojoyo Juara Lagi"
            android:textSize="13sp"
            app:layout_constraintEnd_toEndOf="@+id/textView8"
            app:layout_constraintStart_toStartOf="@+id/textView8"
            app:layout_constraintTop_toTopOf="@+id/imageview10" />

        <TextView
            android:layout_width="228dp"
            android:layout_height="51dp"
            android:layout_marginTop="15dp"
            android:fontFamily="@font/poppinslight"
            android:justificationMode="inter_word"
            android:text="Universitas Trunojoyo berhasil meraih \njuara 1 dalam ajang perlombaan debat nasional yang diselenggarakan oleh..."
            android:textSize="11sp"
            app:layout_constraintEnd_toEndOf="@+id/textView10"
            app:layout_constraintStart_toStartOf="@+id/textView20"
            app:layout_constraintTop_toBottomOf="@+id/textView20" />
    </androidx.constraintlayout.widget.ConstraintLayout>
  </androidx.core.widget.NestedScrollView>

  package com.example.modul1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val imageButton: ImageButton = findViewById(R.id.imageButton)
        // Set listener untuk imageButton
        imageButton.setOnClickListener {
            // Intent untuk berpindah ke MainActivity3
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

//ActivityTiga
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity3">

    <TextView
        android:id="@+id/textView"
        android:layout_width="203dp"
        android:layout_height="27dp"
        android:layout_marginStart="18dp"
        android:layout_marginTop="23dp"
        android:fontFamily="@font/poppinsbold"
        android:text="Universitas Trunojoyo"
        android:textSize="18sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <ImageView
        android:id="@+id/imageView6"
        android:layout_width="36dp"
        android:layout_height="36dp"
        android:layout_marginStart="113dp"
        android:layout_marginTop="23dp"
        android:layout_marginEnd="20dp"
        android:src="@drawable/logo"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/textView"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView4"
        android:layout_width="65dp"
        android:layout_height="23dp"
        android:layout_marginTop="5dp"
        android:fontFamily="@font/poppinsmedium"
        android:text="Profile"
        app:layout_constraintStart_toStartOf="@+id/textView"
        app:layout_constraintTop_toBottomOf="@+id/textView" />

    <ImageView
        android:id="@+id/imageView3"
        android:layout_width="169dp"
        android:layout_height="168dp"
        android:layout_marginTop="68dp"
        android:src="@drawable/logo2"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView4" />

    <TextView
        android:id="@+id/textView11"
        android:layout_width="203dp"
        android:layout_height="27dp"
        android:layout_marginTop="21dp"
        android:fontFamily="@font/poppinsbold"
        android:text="Universitas Trunojoyo"
        android:textSize="18sp"
        app:layout_constraintEnd_toEndOf="@+id/imageView3"
        app:layout_constraintStart_toStartOf="@+id/imageView3"
        app:layout_constraintTop_toBottomOf="@+id/imageView3" />

    <TextView
        android:id="@+id/textView12"
        android:layout_width="124sp"
        android:layout_height="26sp"
        android:layout_marginTop="63dp"
        android:fontFamily="@font/poppinssemibold"
        android:text="Profile Singkat"
        app:layout_constraintStart_toStartOf="@+id/textView4"
        app:layout_constraintTop_toBottomOf="@+id/textView11" />

    <TextView
        android:layout_width="356dp"
        android:layout_height="231dp"
        android:layout_marginTop="12dp"
        android:fontFamily="@font/poppinslight"
        android:justificationMode="inter_word"
        android:text="Universitas Trunojoyo Madura atau UTM adalah perguruan tinggi negeri yang terletak di Kamal, Kabupaten Bangkalan, Jawa Timur, Pulau Madura, Indonesia. Universitas Trunojoyo Madura dahulu merupakan universitas swasta yang resmi menjadi perguruan tinggi negeri berdasarkan Keputusan Presiden tanggal 5 Juli 2001. Perguruan tinggi ini diresmikan pada tanggal 23 Juli 2001 oleh Presiden Abdurrahman Wahid. Universitas Trunojoyo Madura merupakan perguruan tinggi negeri ke-7 di Jawa Timur."
        app:layout_constraintEnd_toEndOf="@+id/imageView6"
        app:layout_constraintStart_toStartOf="@+id/textView12"
        app:layout_constraintTop_toBottomOf="@+id/textView12" />

</androidx.constraintlayout.widget.ConstraintLayout>

package com.example.modul1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
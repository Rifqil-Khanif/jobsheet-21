package com.app.jobsheet_20.rifqilkhanif

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rifqilkhanif.jobsheet21.Kelas

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "LATIFAH IRSYADIYAH",
        "MAULIDA INTAN NUR AINI",
        "MIFTAKHUL JANNAH",
        "MUH ASA SUSILO FARIKH SAKTI",
        "MUHAMMAD HAIKAL",
        "MUHAMMAD RIFQIL KHANIF",
        "NABHAN AFLAHU SYAFIQ",
        "NATASYA AYU LESTANTI",
        "NOVI INDRIYANI",
        "NUR HESTI MUGI RAHAYU",
        "RIKA RAHMA AULIA"
    )

    val listNis = arrayOf(
        "3005",
        "3008",
        "3010",
        "3011",
        "3013",
        "3015",
        "3017",
        "3019",
        "3021",
        "3023",
        "3025"
    )

    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i], listNis[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}
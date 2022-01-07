package com.bahasa.myuas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myuas.R
import java.util.*
import kotlinx.android.synthetic.main.fragment_message.*


class message : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_message)
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Bahasa Daerah"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.jawa,"bahasa jawa","Suku Jawa","Bahasa Jawa adalah bahasa Austronesia yang utamanya dituturkan oleh penduduk bersuku Jawa di wilayah bagian tengah dan timur pulau Jawa. "+
                "Bahasa Jawa juga dituturkan oleh diaspora Jawa di wilayah lain di Indonesia, seperti di Sumatra dan Kalimantan; serta di luar Indonesia seperti di Suriname, Belanda, dan Malaysia. "+
                "Jumlah total penutur bahasa Jawa diperkirakan mencapai sekitar 75,5 juta pada tahun 2006. "+
                "Sebagai bahasa Austronesia dari subkelompok Melayu-Polinesia, bahasa Jawa juga berkerabat dengan bahasa Melayu, Sunda, Bali dan banyak bahasa lainnya di Indonesia, meskipun para ahli masih memperdebatkan mengenai posisi pastinya dalam rumpun Melayu-Polinesia. "+
                "Bahasa Jawa berstatus bahasa resmi di Daerah Istimewa Yogyakarta di samping bahasa Indonesia."))

        data?.add(DataModel(R.drawable.sunda,"bahasa sunda","Suku Sunda", "Bahasa Sunda adalah sebuah bahasa dari cabang Melayu-Polinesia dalam rumpun bahasa Austronesia. "+
                "Bahasa ini dituturkan oleh setidaknya 42 juta orang dan merupakan bahasa Ibu dengan penutur terbanyak kedua di Indonesia setelah Bahasa Jawa. "+
                "Bahasa Sunda dituturkan di hampir seluruh provinsi Jawa Barat dan Banten, serta wilayah barat Jawa Tengah mulai dari Kali Brebes (Sungai Cipamali) di wilayah Kabupaten Brebes dan Kali Serayu (Sungai Cisarayu) di Kabupaten Cilacap, di sebagian kawasan Jakarta, serta di seluruh provinsi di Indonesia dan luar negeri yang menjadi sebagai daerah urbanisasi Suku Sunda."))

        data?.add(DataModel(R.drawable.melayu,"bahasa melayu","Suku Melayu", "Istilah Bahasa Melayu mencakup sejumlah Bahasa yang saling bermiripan yang dituturkan di wilayah Nusantara dan di Semenanjung Malaya. "+
                "Sebagai bahasa yang luas pemakaiannya, bahasa ini menjadi bahasa resmi di Brunei Darussalam, Indonesia (sebagai bahasa Indonesia), dan Malaysia (juga dikenal sebagai bahasa Malaysia): bahasa nasional Singapura: dan menjadi bahasa kerja di Timor Leste (sebagai Bahasa Indonesia). "+
                "Bahasa Melayu merupakan lingua franca dalam kegiatan perdagangan dan keagamaan di Nusantara sejak abad ke-7. "+
                "Migrasi kemudian juga turut memperluas pemakaiannya. Selain di negara yang disebut sebelumnya, bahasa Melayu dituturkan pula di Afrika Selatan, Sri Lanka, Thailand Selatan, Filipina selatan, Myanmar selatan, sebagian kecil Kamboja, hingga Papua Nugini. Bahasa ini juga dituturkan oleh penduduk Pulau Natal dan Kepulauan Cocos, yang menjadi bagian Australia."))

        data?.add(DataModel(R.drawable.batak,"bahasa batak","Suku Batak", "Rumpun bahasa Batak adalah sekelompok bahasa berkerabat yang dituturkan di bagian utara Sumatra, Indonesia. "+
                "Rumpun ini merupakan bagian dari subkelompok Sumatra Barat Laut–Kepulauan Penghalang bersama bahasa Mentawai dan Nias di dalam rumpun bahasa Melayu-Polinesia."))

        data?.add(DataModel(R.drawable.madura,"bahasa madura","Suku Madura", "Bahasa Madura adalah bahasa yang digunakan suku Madura. "+
                "Bahasa Madura mempunyai penutur kurang lebih 13,6 juta orang (data tahun 2000), dan terpusat di Pulau Madura, Jawa Timur atau di kawasan yang disebut kawasan Tapal Kuda terbentang dari Pasuruan, Surabaya, Malang, sampai Banyuwangi, Kepulauan Masalembo, Bawean, hingga Pulau Kalimantan."))

        data?.add(DataModel(R.drawable.minangkabau,"bahasa minangkabau","Suku Minangkabau", "Bahasa Minangkabau adalah bahasa daerah atau bahasa etnis yang dituturkan oleh Suku Minangkabau yang berasal dari wilayah Dataran Tinggi Minangkabau di Sumatra Barat."+
                "Melalui diaspora masyarakat bersuku Minangkabau, bahasa ini juga dituturkan di beberapa wilayah lain terutama di daerah-daerah sekitar Sumatra Barat terutama di Sumatra Utara, Jambi, Bengkulu, sebagian Aceh, sebagian Riau, serta di wilayah luar negeri meliputi Negeri Sembilan di Semenanjung Kra, Singapura, Australia, dan Belanda."))

        data?.add(DataModel(R.drawable.betawi,"bahasa betawi","Suku Betawi", "Bahasa Betawi adalah bahasa daerah atau bahasa etnis yang dituturkan oleh Suku Betawi yang mendiami Jakarta (sebagai wilayah utama), dan juga mendiami sebagian wilayah dari provinsi Jawa Barat serta Banten. "+
                "Kawasan penutur Bahasa Betawi yang dihuni oleh masyarakat Betawi ini biasa dikenal dengan istilah (Jabodetabek) yang berarti: Jakarta, Bogor, Depok, Tangerang, Bekasi."))


        data?.add(DataModel(R.drawable.aceh,"bahasa aceh","Suku Aceh", "Bahasa Aceh adalah sebuah bahasa yang dituturkan oleh suku Aceh yang terdapat di wilayah pesisir, sebagian pedalaman dan sebagian kepulauan di Aceh. "+
                "Bahasa Aceh termasuk dalam rumpun bahasa Chamik, cabang dari rumpun bahasa Melayu-Polinesia, cabang dari rumpun bahasa Austronesia."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@message, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("bahasa", item?.bahasa)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}
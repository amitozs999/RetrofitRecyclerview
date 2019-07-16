package com.example.retrofitusingadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



            val retrofit=Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            val service=retrofit.create(apiterface::class.java)

            val call=service.getPosts()

            call.enqueue(object : Callback<List<User>> {
                override fun onFailure(call: Call<List<User>>, t: Throwable) {
                    Log.d("MoviesDagger", t.toString())
                }

                override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {

                    val data=response.body()




                        rvUsers.layoutManager =
                            LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL,false)
                        rvUsers.adapter = UserAdapter(data!!)



                }
            })

        }

    }


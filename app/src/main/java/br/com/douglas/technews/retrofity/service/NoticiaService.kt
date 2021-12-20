package br.com.douglas.technews.retrofity.service

import br.com.douglas.technews.model.Noticia
import retrofit2.Call
import retrofit2.http.*

interface NoticiaService {

    @GET("noticias")
    fun buscaTodas(): Call<List<Noticia>>

    @POST("noticias")
    fun salva(@Body noticia: Noticia): Call<Noticia>

    @PUT("noticias/{id}")
    fun edita(@Path("id") id: Long, @Body noticia: Noticia) : Call<Noticia>

    @DELETE("noticias/{id}")
    fun remove(@Path("id") id: Long): Call<Void>

}

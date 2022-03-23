package com.brxq.poke.repository

import android.util.Log
import com.brxq.poke.data.remote.PokeApi
import com.brxq.poke.data.remote.responses.Pokemon
import com.brxq.poke.data.remote.responses.PokemonList
import com.brxq.poke.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokeApi
) {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch(e: Exception) {
            return Resource.Error("An unknown error occurred.")
        }
        return Resource.Success(response)
    }

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        val response = try {
            api.getPokemonInfo(pokemonName)
        } catch(e: Exception) {
            return Resource.Error("An unknown error occurred.")
        }

        Log.i("RESPONSE", response.sprites.toString())

        return Resource.Success(response)
    }
}
package com.brxq.poke.pokemondetail

import androidx.lifecycle.ViewModel
import com.brxq.poke.data.remote.responses.Pokemon
import com.brxq.poke.repository.PokemonRepository
import com.brxq.poke.util.Resource
import javax.inject.Inject

class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(
        pokemonName : String,
    ) : Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }

}
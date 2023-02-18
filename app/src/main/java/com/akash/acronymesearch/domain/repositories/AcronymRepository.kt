package com.akash.acronymesearch.domain.repositories

interface AcronymRepository {

    suspend fun getAcronyms()

}
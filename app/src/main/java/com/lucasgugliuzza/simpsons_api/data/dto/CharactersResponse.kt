package com.lucasgugliuzza.simpsons_api.data.dto

import com.squareup.moshi.Json

data class CharactersResponse(


    @Json(name = "docs")
    val docs: List<Doc>,

    @Json(name = "hasNextPage")
    val hasNextPage: Boolean,

    @Json(name = "hasPrevPage")
    val hasPrevPage: Boolean,

    @Json(name = "limit")
    val limit: Int ,

    @Json(name = "nextPage")
    val nextPage: Int,

    @Json(name = "page")
    val page: Int,

    @Json(name = "pagingCounter")
    val pagingCounter: Int,

    @Json(name = "prevPage")
    val prevPage: Any,

    @Json(name = "totalDocs")
    val totalDocs: Int,

    @Json(name = "totalPages")
    val totalPages: Int
)
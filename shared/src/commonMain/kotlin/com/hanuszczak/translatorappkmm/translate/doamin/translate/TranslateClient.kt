package com.hanuszczak.translatorappkmm.translate.doamin.translate

import com.hanuszczak.translatorappkmm.core.domain.language.Language

interface TranslateClient {
    suspend fun translate(
        fromLanguage: Language,
        fromText: String,
        toLanguage: Language
    ): String
}
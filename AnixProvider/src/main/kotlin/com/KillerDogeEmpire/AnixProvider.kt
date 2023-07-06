package com.KillerDogeEmpire

import android.util.Log

import com.fasterxml.jackson.annotation.JsonProperty

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.extractors.DoodLaExtractor
import com.lagradost.cloudstream3.utils.*
import com.lagradost.cloudstream3.utils.AppUtils.parseJson
import com.lagradost.nicehttp.Requests
import com.lagradost.nicehttp.Session
import kotlinx.coroutines.delay
import org.jsoup.nodes.Element

import org.jsoup.Jsoup
import java.util.regex.Pattern

class AnixProvider : MainAPI() { // all providers must be an instance of MainAPI
    override var mainUrl = "https://anix.to"
    override var name = "Anix"
    override val hasMainPage = true
    override var lang = "en"
    override val hasChromecastSupport = true
    override val hasDownloadSupport = true
    override val supportedTypes = setOf(TvType.Anime)
    override val hasQuickSearch = true
    )


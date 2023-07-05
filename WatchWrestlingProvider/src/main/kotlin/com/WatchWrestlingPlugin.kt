package com.KillerDogeEmpire

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context
import com.Dailymotion
import com.lagradost.cloudstream3.utils.ExtractorApi
import com.lagradost.cloudstream3.utils.extractorApis

@CloudstreamPlugin
class WatchWrestlingPlugin: Plugin() {
    override fun load(context: Context) {
        // All providers should be added in this manner. Please don't edit the providers list directly.
        registerMainAPI(WatchWrestlingProvider())
        addExtractor(Dailymotion())
    }

    private fun addExtractor(element: ExtractorApi) {
       element.sourcePlugin = __filename
       extractorApis.add(0, element)
    }
}

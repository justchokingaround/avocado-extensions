version = 1


cloudstream {
    language = "en"
    // All of these properties are optional, you can safely remove them

    description = "Anime Site Similar to Animixplay, 9anime Scrapes some videos from here"
    authors = listOf("KillerDogeEmpire")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 0 // will be 3 if unspecified
    tvTypes = listOf(
     "Anime",
     "OVA",
    )

    iconUrl = "https://www.google.com/s2/favicons?domain=https://anix.to//&sz=%size%"
}

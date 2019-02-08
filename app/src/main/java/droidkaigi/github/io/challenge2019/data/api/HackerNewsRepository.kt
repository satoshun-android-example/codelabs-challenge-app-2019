package droidkaigi.github.io.challenge2019.data.api

class HackerNewsRepository(
    private val api: HackerNewsApi
) {
    fun getTopStories() = api.getTopStories()
    fun getItem(id: Long) = api.getItem(id)
}

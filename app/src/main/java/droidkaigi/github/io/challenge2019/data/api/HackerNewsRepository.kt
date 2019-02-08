package droidkaigi.github.io.challenge2019.data.api

class HackerNewsRepository(
    private val api: HackerNewsApi
) {
    fun getTopStories() = api.getTopStories()
    fun getComment(id: Long) = api.getItem(id)
    fun getStory(id: Long) = api.getItem(id)
}

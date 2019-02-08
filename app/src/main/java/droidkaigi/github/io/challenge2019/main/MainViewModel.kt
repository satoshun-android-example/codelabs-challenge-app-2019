package droidkaigi.github.io.challenge2019.main

import droidkaigi.github.io.challenge2019.data.api.HackerNewsRepository

class MainViewModel(
    private val repository: HackerNewsRepository
) {
    fun getTopStories() = repository.getTopStories()
    fun getStory(id: Long) = repository.getStory(id)
}

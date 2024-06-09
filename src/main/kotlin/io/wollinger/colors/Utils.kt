package io.wollinger.colors

import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.*
import kotlinx.serialization.json.Json
import org.w3c.dom.Window
import org.w3c.dom.url.URLSearchParams
import org.w3c.xhr.XMLHttpRequest
import kotlin.js.Promise

inline fun <reified T> id(id: String): T {
    val element = document.getElementById(id)
    if(element is T) return element
    throw Exception("\"$id\" is not of type ${T::class.simpleName}!")
}

fun getParams() = URLSearchParams(window.location.search)

fun Window.setSearchParam(key: String, value: String) {
    val params = getParams()
    params.set(key, value)
    window.history.pushState("", "", "?$params")
}
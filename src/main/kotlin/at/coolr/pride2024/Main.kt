import kotlinx.browser.document
import org.w3c.dom.HTMLParagraphElement

fun main() {
    val text = document.createElement("p") as HTMLParagraphElement
    text.innerText = "Hello Pride 2024!"
    document.body?.append(text)
}
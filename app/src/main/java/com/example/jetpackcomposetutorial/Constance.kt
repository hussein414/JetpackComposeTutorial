package com.example.jetpackcomposetutorial

import com.example.jetpackcomposetutorial.data.model.Message
import com.example.jetpackcomposetutorial.data.model.MessageItem

object Constance {
    val message = Message(
        author = "Hussein",
        "Congratulations, you’ve finished the Compose tutorial! You’ve built a simple chat screen efficiently showing a list of expandable & animated messages containing an image and texts, designed using Material Design principles with a dark theme included and previews—all in under 100 lines of code!"
    )

    val messageCardItem = listOf(
        Message(
            author = "Tara",
            "Congratulations, you’ve finished the Compose tutorial! You’ve built a simple chat screen efficiently showing a list of expandable & animated messages containing an image and texts, designed using Material Design principles with a dark theme included and previews—all in under 100 lines of code!"
        ),
        Message(
            author = "Mohsen",
            "Congratulations, you’ve finished the Compose tutorial! You’ve built a simple chat screen efficiently showing a list of expandable & animated messages containing an image and texts, designed using Material Design principles with a dark theme included and previews—all in under 100 lines of code!"
        ),
        Message(
            author = "ALI",
            "Congratulations, you’ve finished the Compose tutorial! You’ve built a simple chat screen efficiently showing a list of expandable & animated messages containing an image and texts, designed using Material Design principles with a dark theme included and previews—all in under 100 lines of code!"
        ),
        Message(
            author = "021",
            "Congratulations, you’ve finished the Compose tutorial! You’ve built a simple chat screen efficiently showing a list of expandable & animated messages containing an image and texts, designed using Material Design principles with a dark theme included and previews—all in under 100 lines of code!"
        ),
    )

    val itemCard = listOf(
        MessageItem(
            author = "Hussein",
            "Congratulations, you’ve finished the Compose tutorial! You’ve built a simple chat screen efficiently showing a list of expandable & animated messages containing an image and texts, designed using Material Design principles with a dark theme included and previews—all in under 100 lines of code!",
            "https://avatars.githubusercontent.com/u/76725925?v=4"
        ),
        MessageItem(
            author = "Tara",
            "Congratulations, you’ve finished the Compose tutorial! You’ve built a simple chat screen efficiently showing a list of expandable & animated messages containing an image and texts, designed using Material Design principles with a dark theme included and previews—all in under 100 lines of code!",
            "https://avatars.githubusercontent.com/u/76725925?v=4"
        )
    )
}
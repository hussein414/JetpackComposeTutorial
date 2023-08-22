package com.example.jetpackcomposetutorial.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposetutorial.Constance
import com.example.jetpackcomposetutorial.MessageCard
import com.example.jetpackcomposetutorial.R
import com.example.jetpackcomposetutorial.data.model.Message


@Composable
fun ExpendedScreen(message: Message, messageItemCard: List<Message>) {
    var isExpanded by remember { mutableStateOf(false) }
    Card(modifier = Modifier
        .fillMaxWidth()
        .clip(shape = ShapeDefaults.Large)
        .clickable { isExpanded = !isExpanded }) {
        if (isExpanded) {
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.download),
                    contentDescription = "profile",
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .border(
                            width = 1.5.dp,
                            color = Color.Gray,
                            shape = CircleShape
                        ),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(20.dp))

                Text(
                    text = message.author,
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.Gray
                )
                LazyColumn {
                    items(messageItemCard) { messageItemCard ->
                        MessageCard(message = messageItemCard)
                    }
                }

            }
        } else {
            Row(
                modifier = Modifier.padding(all = 8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.download),
                    contentDescription = "profile",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .border(
                            width = 1.5.dp,
                            color = Color.Gray,
                            shape = CircleShape
                        ),
                    contentScale = ContentScale.Crop

                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(
                        text = message.author,
                        style = MaterialTheme.typography.titleMedium,
                        color = Color.Gray
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ExpendedPreviewScreen() {
    ExpendedScreen(message = Constance.message, Constance.messageCardItem)
}
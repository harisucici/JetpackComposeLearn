package com.framework.jetpackcomposelearn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.core.setContent
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.framework.jetpackcomposelearn.ui.JetpackComposeLearnTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()

        }
    }
}


@Composable
fun MainScreen(text: String) {
    Text("hello:$text")
}

@Preview
@Composable
fun ScreenPreview() {
    MainScreen("vivo")
}


@Composable
fun NewsStory() {

    val textStyle = MaterialTheme.typography
    var image = imageResource(id = R.drawable.header)
    val imageModifier = Modifier
            .preferredHeightIn(maxHeight = 180.dp)
            .fillMaxWidth().clip(shape = RoundedCornerShape(50.dp,10.dp,20.dp,0.dp))
   MaterialTheme() {
       Column() {
           Image(image, modifier = imageModifier, contentScale = ContentScale.Crop)
           Spacer(Modifier.preferredHeight(100.dp))
           Column(modifier = Modifier.padding(horizontal = 5.dp, vertical = 20.dp)) {
               Text(style = textStyle.h5,modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp), text = "hahaha1")
               Text(style = textStyle.h6,modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp), text = "hahaha2")
               Text(maxLines = 2,style = textStyle.h1,modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp), text = "hahaha3hahaha3hahaha3hahaha3hahaha3hahaha3hahaha3hahaha3hahaha3hahaha3hahaha3hahaha3hahaha3hahaha3hahaha3")
           }
       }
   }
   
   




}

@Preview
@Composable
fun NewsStoryPreview() {
    NewsStory()
}
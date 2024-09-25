package com.example.happybirthday

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class ArticleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            HappyBirthdayTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    FullArticle(
                        title = stringResource(R.string.article_title_text),
                        p1 = stringResource(R.string.article_p1_text),
                        p2 = stringResource(R.string.article_p2_text)
                    )
                }
            }
        }
    }
}

@Composable
fun FullArticle(title: String, p1: String, p2: String, modifier: Modifier = Modifier){
    Column (
        verticalArrangement = Arrangement.Top,
        modifier = modifier
    ){
        //Imagen
        val image = painterResource(id = R.drawable.bg_compose_background)
        Image(
            painter = image,
            contentDescription = null
        )
        //titulo
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = modifier
                .padding(16.dp)
        )
        //Parrafo 1
        Text(
            text = p1,
            textAlign = TextAlign.Justify ,
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp)


        )
        //Parrafo 2
        Text(
            text = p2,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview(){
    HappyBirthdayTheme {
        FullArticle(
            title = stringResource(R.string.article_title_text),
            p1 = stringResource(R.string.article_p1_text),
            p2 = stringResource(R.string.article_p2_text)
        )
    }
}
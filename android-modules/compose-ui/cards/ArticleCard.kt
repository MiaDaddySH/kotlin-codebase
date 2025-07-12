package composeui.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.painterResource
import com.example.kotlin_codebase.R

/**
 * A simple reusable article card UI.
 *
 * @param title Title text displayed prominently
 * @param subtitle Subtitle text displayed below title
 * @param imagePainter Image to display above the text
 */
@Composable
fun ArticleCard(
    title: String,
    subtitle: String,
    imagePainter: Painter
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = imagePainter,
            contentDescription = null,
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = subtitle,
            fontSize = 16.sp
        )
    }
}

@Preview
@Composable
fun PreviewArticleCard() {
    ArticleCard(
        title = "How to Build Reusable UI",
        subtitle = "Compose makes it easy to reuse.",
        imagePainter = painterResource(R.drawable.sample_image)
    )
}

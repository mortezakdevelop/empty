import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
@Composable
fun BoardTable(){
    
}

@Composable
fun BoardRow() {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
    ) {
        listOf<Int>(1, 2, 3).forEachIndexed { index, item ->
            Column() {
                Image(
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(10.dp),
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_background),
                    contentDescription = ""
                )
                Text(
                    modifier = Modifier
                        .width(100.dp)
                        .height(20.dp)
                        .padding(horizontal = 10.dp),
                    text = "",
                    color = colorResource(id = R.color.black),
                    fontSize = 10.sp
                )
            }
        }

    }
}

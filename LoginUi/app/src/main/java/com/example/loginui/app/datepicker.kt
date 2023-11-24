import android.app.DatePickerDialog
import android.widget.DatePicker
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.loginui.app.utils.componentShapes
import com.example.loginui.R


import java.util.*

@Composable
fun DatePickerBox() {
    val mContext= LocalContext.current
val year:Int
val month:Int
val day:Int
val calendar=Calendar.getInstance()
    year=calendar.get(Calendar.YEAR)
    month=calendar.get(Calendar.MONTH)
    day=calendar.get(Calendar.DAY_OF_MONTH)
//    calendar.time= Date()
    val date = rememberSaveable { mutableStateOf("") }
    val datePickerdailog =DatePickerDialog(
        mContext,
        { _: DatePicker, year: Int, month: Int, dayOfMonth: Int ->
            date.value = "$dayOfMonth/$month/$year"
        },year,month,day

    )
    Box(modifier = Modifier
        .clip(componentShapes.small)
        .fillMaxWidth()
        .height(56.dp)
        .background(
            Color.White
        ),


        ) {
        Row(modifier = Modifier
            .fillMaxSize()
            .padding(start = 19.dp, top = 20.dp, bottom = 18.dp),
            horizontalArrangement = Arrangement.SpaceBetween,

            ){
            Text(text = "${date.value}")
            IconButton(onClick = { datePickerdailog.show() }) {
                Image(painter = painterResource(id = R.drawable.calendar), contentDescription = "", modifier = Modifier
                    .width(18.dp)
                    .height(20.dp))
            }
        }

    }




}




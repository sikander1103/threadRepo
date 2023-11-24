import com.example.loginui.R


data class CardItemData(
    val profilepic:Int?,
    val imageRes: Int?,
    val Idname: String,
    val username: String,
    val post:String?,
    val mintes:Int,
    val replies:Int,
    val likes:Int,
    val verifiedtick:Int?,
    val index:Int,

)

  fun generateDummyData(): List<CardItemData> {
    return listOf(
        CardItemData(null,null, "Ahmad Ali", "ahmad_12@23","Eyes are complex sensory organs that provide vision by detecting and processing light.",49,13,22,null,0),
        CardItemData(R.drawable.profilepic,R.drawable.post1, "Taimoor Nasir", "@taimoor1_1033",null,50,16,24,R.drawable.verified,1),
        CardItemData(R.drawable.profile2,R.drawable.flowers, "Usama ali ", "@usama_1103",null,50,16,24,R.drawable.verified,2),
        CardItemData(R.drawable.profile1,R.drawable.post3, "Sikander Ahmad", "@320_sikander","Eyes are complex sensory organs that provide vision by detecting and processing light.",49,13,22,null,3),
    )
}


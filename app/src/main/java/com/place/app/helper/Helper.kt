package com.place.app.helper

import android.content.Context
import android.net.ConnectivityManager
import com.place.app.data.model.Location

object Helper {

    val images = arrayOf(
        "https://www.isro.gov.in/media_isro/image/centreimages/IISU.jpg.webp",

        "https://passionpassport-1.s3.amazonaws.com/wp-content/uploads/2018/02/09183737/literary-ireland-header-e1517961518845.jpg",


        "https://www.dublincitycouncilculturecompany.ie/content/images/_600x350_crop_center-center_none/195904445_2954253971525831_1371845602170372258_n.jpeg",
"https://evercam.uk/wp-content/uploads/sites/4/2020/02/Moli-1024x768.jpg",
"https://passionpassport-1.s3.amazonaws.com/wp-content/uploads/2018/02/09183737/literary-ireland-header-e1517961518845.jpg",
"https://images.squarespace-cdn.com/content/v1/604ffb544c6d436ffc845808/1628580957672-TT3VUR4HT3MSM8D3D4U1/Dorotheenst%C3%A4dtischer+Friedhof.jpeg?format=1000w",
"https://i.guim.co.uk/img/media/80c12252282e024a66d199ad056610bb9af0386e/0_53_1300_780/master/1300.jpg?width=465&quality=85&dpr=1&s=none",
"https://media-cdn.tripadvisor.com/media/attractions-splice-spp-674x446/06/75/a4/1f.jpg",
"https://media.tacdn.com/media/attractions-splice-spp-400x400/0b/27/5b/cc.jpg",
"https://cdn.cheapism.com/images/Free_Things_to_Do_in_Ireland.max-784x410.jpg",
"https://www.irelandbeforeyoudie.com/wp-content/uploads/2020/02/top-5-literary-attractions-to-see-in-dublin-1024x512.jpg",
        "https://www.planetware.com/photos-large/IRL/ireland-dublin-trinity.jpg",
        "https://www.planetware.com/wpimages/2022/05/ireland-dublin-top-attractions-things-to-do-trinity-college-college-green-blue-sky.jpg",
        "https://comerviajarynadamas.com/wp-content/uploads/AB153393-001B-4B21-9AB7-A2E6616DF226-750x750.jpeg",
        "https://kulturtaenzer.com/wp-content/uploads/2019/05/Beitragsbild_Dublin-Travelguide.jpg"
        ,"https://images.ireland.com/thumbs/Images/Dublin/3e0820a1e9204d0ea24dfb6f5f5998dc/collagebackground-desktop.jpg",

        "https://i0.wp.com/oceanstoalpines.com/wp-content/uploads/2018/08/trinitycollege.jpg?fit=800%2C1066&ssl=1")
    val placeOfColors = arrayOf(
        "#E1BF39", "#B6950D",
        "#6A570D", "#FF9513",
        "#19161D", "#FF018786",
        "#FF000000", "#838080",
        "#1B8FF4", "#FF0606",
            "#4CAF50", "#E91E63",
        "#194D53", "#A2A868",
        "#663377",
        "#AA1F3A", "#5C3427", "#7F67AA",
        "#317523", "#D36337", "#EF0E4E",
        "#5C061F", "#FFE500", "#8E2B91",
        "#d3c29c", "#776688", "#6195ed",
        "#BB0033", "#FFFF00", "#00FFFF",
        "#FF0000", "#808000", "#00FF00",
        "#000080", "#454545", "#0000FF",
        "#C0C0C0", "#808000", "#000000",
        "#FFFFFF")



    /**
     * CHECK WHETHER INTERNET CONNECTION IS AVAILABLE OR NOT
     */
    var locations: List<Location> = ArrayList()
    fun checkConnection(context: Context): Boolean {
        return (context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager).activeNetworkInfo != null
    }
}
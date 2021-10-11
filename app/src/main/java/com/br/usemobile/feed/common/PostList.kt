package com.br.usemobile.feed.common

import com.br.usemobile.feed.domain.Comment
import com.br.usemobile.feed.domain.Like
import com.br.usemobile.feed.domain.Post

object PostList {
    val list = mutableListOf(
        Post(
            "0",
            "Samilly Santos",
            "https://media-exp1.licdn.com/dms/image/C4E03AQG_WPraZUwRZQ/profile-displayphoto-shrink_800_800/0/1628554727149?e=1639612800&v=beta&t=Lw_FVZ31Uydc-QnGyqx70vssSOIeBoXv248IO6j3Tpw",
            "Sábado às 04:46",
            "Maçã verde",
            listOf<Like>(
                Like("1"),
                Like("2"),
                Like("3"),
                Like("3"),
                Like("3"),
                Like("3"),
                Like("3"),
                Like("3"),
                Like("3"),
                Like("3"),
                Like("4"),
                Like("5")
            ),
            listOf<Comment>(
                Comment(
                    "Daniel Alves",
                    "https://scontent.fios4-1.fna.fbcdn.net/v/t1.6435-1/p200x200/242264139_378810720590607_1699034188745572489_n.jpg?_nc_cat=100&ccb=1-5&_nc_sid=7206a8&_nc_ohc=es8uAHrWV-oAX_3Mzi4&_nc_ht=scontent.fios4-1.fna&oh=784c33491b1ef9f13fa414e6148031b4&oe=6187238F",
                    "Sábado às 04:47",
                    "Adoro bala de maçã"
                )
            )
        ),
        Post(
            "1",
            "Matheus Bissoli",
            "https://media-exp1.licdn.com/dms/image/C5603AQG6Wp_dttcFSg/profile-displayphoto-shrink_800_800/0/1580260962373?e=1639008000&v=beta&t=KJYw-0aTFm0cCyAj-ZtlwUeJ4aKHWmLuH6GhMLV1Cus",
            "Sábado às 04:55",
            "Esse nome no perfil nem sei de quem é. Meu nome é bife.",
            listOf<Like>(
                Like("1"),
                Like("2"),
                Like("3"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("5")
            ),
            listOf<Comment>(
                Comment(
                    "Daniel Alves",
                    "https://scontent.fios4-1.fna.fbcdn.net/v/t1.6435-1/p200x200/242264139_378810720590607_1699034188745572489_n.jpg?_nc_cat=100&ccb=1-5&_nc_sid=7206a8&_nc_ohc=es8uAHrWV-oAX_3Mzi4&_nc_ht=scontent.fios4-1.fna&oh=784c33491b1ef9f13fa414e6148031b4&oe=6187238F",
                    "Sábado às 04:48",
                    "Fé nos cria!"
                )
            )
        ),
        Post(
            "2",
            "Rosimeire Guerra",
            "https://scontent.fios4-1.fna.fbcdn.net/v/t1.6435-9/52595707_2012121155573979_3714815908363894784_n.jpg?_nc_cat=105&ccb=1-5&_nc_sid=09cbfe&_nc_ohc=dJZDek8hOsEAX9ik5K2&_nc_ht=scontent.fios4-1.fna&oh=4dc238125d154e06666203f983ae516f&oe=618765AC",
            "Sábado às 04:57",
            "Boa noite, minha tia! Estudar hein! Fé em deus, fé nos cria!",
            listOf<Like>(
                Like("1"),
                Like("2"),
                Like("3"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("5")
            ),
            listOf<Comment>(
                Comment(
                    "Daniel Alves",
                    "https://scontent.fios4-1.fna.fbcdn.net/v/t1.6435-1/p200x200/242264139_378810720590607_1699034188745572489_n.jpg?_nc_cat=100&ccb=1-5&_nc_sid=7206a8&_nc_ohc=es8uAHrWV-oAX_3Mzi4&_nc_ht=scontent.fios4-1.fna&oh=784c33491b1ef9f13fa414e6148031b4&oe=6187238F",
                    "Sábado às 04:48",
                    "Fé nos cria!"
                )
            )
        ),
        Post(
            "3",
            "Pedro Bruno",
            "https://media-exp1.licdn.com/dms/image/C4D03AQFqqSyQn6O-fg/profile-displayphoto-shrink_800_800/0/1604921630502?e=1639008000&v=beta&t=eMPO1EYRREStd63kvYMkSlxLhzHEmLhFiJ8EYKbULmg",
            "Sábado às 04:59",
            "Eu até vejo o código do aplicativo lá na empresa, mas não posso mexer em nada. Tenso...",
            listOf<Like>(
                Like("1"),
                Like("2"),
                Like("3"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("5")
            ),
            listOf<Comment>(
                Comment(
                    "Daniel Alves",
                    "https://scontent.fios4-1.fna.fbcdn.net/v/t1.6435-1/p200x200/242264139_378810720590607_1699034188745572489_n.jpg?_nc_cat=100&ccb=1-5&_nc_sid=7206a8&_nc_ohc=es8uAHrWV-oAX_3Mzi4&_nc_ht=scontent.fios4-1.fna&oh=784c33491b1ef9f13fa414e6148031b4&oe=6187238F",
                    "Sábado às 04:48",
                    "Fé nos cria!"
                )
            )
        ),
        Post(
            "4",
            "Adriano Chamon",
            "https://media-exp1.licdn.com/dms/image/D4D35AQHm4ghk6RYM3A/profile-framedphoto-shrink_800_800/0/1630636377419?e=1633996800&v=beta&t=5og6D41ZyS7SyeReAr4cDYFkoY5LyTyJjQZ47RToiDw",
            "Sábado às 05:04",
            "Mano, fiz o primeiro desafio com 12 fragments.",
            listOf<Like>(
                Like("1"),
                Like("2"),
                Like("3"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("4"),
                Like("5")
            ),
            listOf<Comment>(
                Comment(
                    "Daniel Alves",
                    "https://scontent.fios4-1.fna.fbcdn.net/v/t1.6435-1/p200x200/242264139_378810720590607_1699034188745572489_n.jpg?_nc_cat=100&ccb=1-5&_nc_sid=7206a8&_nc_ohc=es8uAHrWV-oAX_3Mzi4&_nc_ht=scontent.fios4-1.fna&oh=784c33491b1ef9f13fa414e6148031b4&oe=6187238F",
                    "Sábado às 04:48",
                    "Fé nos cria!"
                )
            )
        ),
        Post(
            "5",
            "Isadora Waltrick",
            "https://media-exp1.licdn.com/dms/image/C4D03AQFjk9K2iP_O9w/profile-displayphoto-shrink_800_800/0/1628883193071?e=1639612800&v=beta&t=OVpiPVYBpo-Fj55eVt69Wk0J4HfUdR5u5x1tXVRcDCg",
            "Sábado às 05:15",
            "O Lucax é tão fofinho meu bebê tão cute cute",
            listOf<Like>(

            ),
            listOf<Comment>(

            )
        )
    )
}

object PostListTest {
    val value = listOf<String>(
        "post 1",
        "post 2",
        "post 3",
        "post 4",
        "post 5",
        "post 6"
    )
}
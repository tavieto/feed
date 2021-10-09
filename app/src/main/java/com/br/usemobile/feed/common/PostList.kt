package com.br.usemobile.feed.common

import com.br.usemobile.feed.domain.Comment
import com.br.usemobile.feed.domain.Like
import com.br.usemobile.feed.domain.Post

object PostList {
    val list = mutableListOf(
        Post(
            "0",
            "Samilly Santos",
            "https://lh3.googleusercontent.com/yHFLpc9ZnLUFN9SEMPlOL6wYhUFSLKx14yBS85yaGckENpGJ_sK7ieqrkHFMPt41ugjgk5mKLBwpd7VBnxPLCLiyrwf3vwpM_6a1IFWRpiXpahxeEy3lhyAoV54BxteaFlZ_SJmYstn0m64tq37AKZuwLcM_ioXkqVkXFG3jwada9RocVExWMaMLZV0MBpPAoagKgMkqu61lUEPQVHFJvY-M6F-wPMsj4h2NG1ua_Gt0i2BhK950JFp9DCguKjwBXnZvHd7jJ3xMSlNn8p4xGDZPbEzcBuGxy-QDZAe19-fknjw1tWZPdC4ga_xEyOAW7jY-zLOO6Qet22FC6S78gpg1Sjcp49T_SfTrxr17dsPgSY9PUa1FOaBzTraXcJcDQNuvgcbecZUs02-JjGUd6hlN4YdWiKFq98jBOJCwi-uhM_rnVOjA48mcQ7SMZq2lL3Jd_NTMFaJmsWmMiMj_Dy16zFazl4DuN2diUfgzPpoLaDIwf4nEOYjpts9S2hv640-Z_4oVsgOgwK7QQ2tm7IEPcM7XPXGabbd9eVc1UzPeZvCX2IvSsmT7POk_xKU_uuhZ_5wgrHkCTBSp21RW_3hzS1O8kBSgPUd5Lr0M-88Wyys3AuFT337ELhkajXr_hcO8gKCX1KkDke70mfRa5pev7B5oAZziWTTvbpLk5qFQ86pUFeW6CBziugpzwxjC251ejJu8ZDSm9t8NxAdlqwdk=w536-h975-no?authuser=0",
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
            "https://media-exp1.licdn.com/dms/image/D4D35AQHm4ghk6RYM3A/profile-framedphoto-shrink_800_800/0/1630636377419?e=1633856400&v=beta&t=bwzJmPpzCR4u5Sm6bw0a0wTqMypAsxywgm1xFMwWZxU",
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
        )
    )
}
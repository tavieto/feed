package com.br.usemobile.feed.common

import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import com.bumptech.glide.Glide

fun AppCompatImageView.loadImage(container: View, uri: String = "https://lh3.googleusercontent.com/yHFLpc9ZnLUFN9SEMPlOL6wYhUFSLKx14yBS85yaGckENpGJ_sK7ieqrkHFMPt41ugjgk5mKLBwpd7VBnxPLCLiyrwf3vwpM_6a1IFWRpiXpahxeEy3lhyAoV54BxteaFlZ_SJmYstn0m64tq37AKZuwLcM_ioXkqVkXFG3jwada9RocVExWMaMLZV0MBpPAoagKgMkqu61lUEPQVHFJvY-M6F-wPMsj4h2NG1ua_Gt0i2BhK950JFp9DCguKjwBXnZvHd7jJ3xMSlNn8p4xGDZPbEzcBuGxy-QDZAe19-fknjw1tWZPdC4ga_xEyOAW7jY-zLOO6Qet22FC6S78gpg1Sjcp49T_SfTrxr17dsPgSY9PUa1FOaBzTraXcJcDQNuvgcbecZUs02-JjGUd6hlN4YdWiKFq98jBOJCwi-uhM_rnVOjA48mcQ7SMZq2lL3Jd_NTMFaJmsWmMiMj_Dy16zFazl4DuN2diUfgzPpoLaDIwf4nEOYjpts9S2hv640-Z_4oVsgOgwK7QQ2tm7IEPcM7XPXGabbd9eVc1UzPeZvCX2IvSsmT7POk_xKU_uuhZ_5wgrHkCTBSp21RW_3hzS1O8kBSgPUd5Lr0M-88Wyys3AuFT337ELhkajXr_hcO8gKCX1KkDke70mfRa5pev7B5oAZziWTTvbpLk5qFQ86pUFeW6CBziugpzwxjC251ejJu8ZDSm9t8NxAdlqwdk=w536-h975-no?authuser=0") {
    Glide
        .with(container)
        .load(uri)
        .centerCrop()
        .circleCrop()
        .into(this)
}
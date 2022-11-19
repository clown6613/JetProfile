package com.example.jetprofile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DetailSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(Color.LightGray.copy(alpha = 0.3f))
            .padding(horizontal = 10.dp, vertical = 20.dp)
    ) {
        Label(
            icon = Icons.Default.Person,
            text = "性格：穏やか 真面目 好奇心旺盛",
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(10.dp))
        Label(
            icon = Icons.Default.LocationOn,
            text = "出身：富山県富山市",
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(10.dp))
        Label(
            icon = Icons.Default.Star,
            text = "趣味：車旅行, 個人開発",
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(10.dp))
        Label(
            icon = Icons.Default.Favorite,
            text = "娯楽：アニメ, 温泉, グルメ, マンガ",
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(10.dp))
        Label(
            icon = Icons.Default.DirectionsRun,
            text = "スポーツ：ランニング, フットサル",
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(10.dp))
        Label(
            icon = Icons.Default.PersonAdd,
            text = "Twitter：@Clown6613",
            color = Color.Gray
        )
        // Spacer(modifier = Modifier.height(10.dp))
    }
}

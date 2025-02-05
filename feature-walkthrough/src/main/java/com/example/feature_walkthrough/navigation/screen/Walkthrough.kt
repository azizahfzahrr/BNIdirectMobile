package com.example.feature_walkthrough.navigation.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.core.view.WindowCompat
import com.example.common.navigation.base.BaseNavigator
import com.example.common.navigation.graph.ProfileNavGraph
import com.example.common.navigation.graph.route.ProfileNavGraphRoute
import com.example.common.utils.PreferenceManager
import com.example.common.utils.fonts.FontConstant
import com.example.common.utils.fonts.PreferenceFont
import com.example.common.utils.multilanguage.LanguageConstant
import com.example.common.utils.multilanguage.LanguageUtils
import com.example.feature_walkthrough.R
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch

class Walkthrough : ComponentActivity() {
    private lateinit var navigator: BaseNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            WalkthroughScreen(navigator)
        }
    }
}

val ttInterphasesPro = FontFamily(
    Font(com.example.common.R.font.tt_interphases_pro_regular, FontWeight.Normal),
    Font(com.example.common.R.font.tt_interphases_pro_bold, FontWeight.Bold)
)


@Composable
fun WalkthroughScreen(navigator: BaseNavigator) {
    val context = LocalContext.current

    if (PreferenceManager.getStringForKey(
            context,
            LanguageConstant.PREFERENCE_LANGUAGECODE,
            null
        ) == null
    ) {
        LanguageUtils.setLanguage(context, 1)
    }

    var fontSize = PreferenceFont.getIntForKey(
        context,
        FontConstant.PREFERENCE_FONTCODE,
        1
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = com.example.common.R.color.white))
    ) {
        BackgroundPattern()
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 40.dp, bottom = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = com.example.common.R.drawable.ic_bnidirect),
                    contentDescription = "Logo",
                    modifier = Modifier.size(116.dp, 25.dp)
                )
                Spacer(Modifier.weight(1f))
                IconButton(
                    modifier = Modifier.size(66.dp, 34.dp),
                    onClick = { /* Handle language button click */ }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_lang_id),
                        contentDescription = "Language"
                    )
                }
            }

            Spacer(modifier = Modifier.weight(0.7f))

            val pagerState = rememberPagerState()
            val coroutineScope = rememberCoroutineScope()

            val images = listOf(
                R.drawable.walkthrough_1,
                R.drawable.walkthrough_2,
                R.drawable.walkthrough_3
            )

            val title = listOf(
                LanguageUtils.getLanguageString(context, LanguageConstant.walkthroughTitle1),
                LanguageUtils.getLanguageString(context, LanguageConstant.walkthroughTitle2),
                LanguageUtils.getLanguageString(context, LanguageConstant.walkthroughTitle3)
            )

            val subTitle = listOf(
                LanguageUtils.getLanguageString(context, LanguageConstant.walkthroughDesc1),
                LanguageUtils.getLanguageString(context, LanguageConstant.walkthroughDesc2),
                LanguageUtils.getLanguageString(context, LanguageConstant.walkthroughDesc3)
            )

            HorizontalPager(
                count = images.size,
                state = pagerState,
                modifier = Modifier
                    .padding(0.dp)
                    .height(450.dp)
            ) { page ->
                Column(
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {
                    Image(
                        painter = painterResource(id = images[page]),
                        contentDescription = "Walkthrough",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .width(375.dp)
                            .height(280.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                    Text(
                        text = title[page],
                        fontSize = if (fontSize == 1) 20.sp else 22.sp,
                        textAlign = TextAlign.Center,
                        fontFamily = ttInterphasesPro,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.CenterHorizontally)
                            .padding(
                                bottom = 12.dp,
                                top = 39.dp,
                                start = 24.dp,
                                end = 24.dp)
                    )
                    Text(
                        text = subTitle[page],
                        fontSize = if (fontSize == 1) 14.sp else 16.sp,
                        textAlign = TextAlign.Center,
                        fontFamily = ttInterphasesPro, fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = 32.dp, start = 24.dp, end = 24.dp)
                    )
                }
            }

            HorizontalPagerIndicator(
                modifier = Modifier.align(Alignment.CenterHorizontally)
                    .padding(top = 0.dp),
                pagerState = pagerState,
                indicatorHeight = 8.dp,
                indicatorShape = RoundedCornerShape(corner = CornerSize(8.dp)),
                activeColor = colorResource(com.example.common.R.color.iconHome),
                indicatorWidth = 8.dp
            )

            Spacer(modifier = Modifier.weight(1f))

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
                    .padding(start = 32.dp, end = 32.dp, bottom = 32.dp)
                    .navigationBarsPadding(),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(com.example.common.R.color.iconHome),
                    contentColor = colorResource(com.example.common.R.color.white)
                ),
                onClick = {
                    navigator.navigate(
                        navigator.getNavGraph<ProfileNavGraph>().getProfileLandingRoute(nama = "Ini profile landing screen")
                    )
                }
            ) {
                Text(
                    text = "Mulai",
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                    fontFamily = ttInterphasesPro, fontWeight = FontWeight.Normal
                )
            }
        }
    }
}

@Composable
fun BackgroundPattern() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (frameLayout) = createRefs()

        Box(
            modifier = Modifier
                .constrainAs(frameLayout) {
                    top.linkTo(parent.top)
                    height = Dimension.percent(0.5f)
                }
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.pattern_bg),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}
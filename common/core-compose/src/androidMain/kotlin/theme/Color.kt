package themeimport androidx.compose.runtime.staticCompositionLocalOfimport androidx.compose.ui.graphics.Colordata class EcommerceConceptColors(    val primaryBackground: Color,    val primaryAction: Color,    val primaryTextColor: Color,    val hintTextColor: Color,    val highlightTextColor: Color,    val secondaryTextColor: Color,    val whiteBackground: Color,    val secondaryBackground: Color,    val colorTransparent:Color,    val tintColor:Color,)val palette = EcommerceConceptColors(    primaryBackground = Color(0xFF010035),    primaryAction = Color(0xFFFF6E4E),    primaryTextColor = Color(0xFF010035),    hintTextColor = Color(0xD010035),    highlightTextColor = Color(0xFFF4D144),    secondaryTextColor = Color(0xFFFFFFFF),    whiteBackground = Color(0xFFFFFFFF),    secondaryBackground = Color(0xFFF5F5F5),    colorTransparent = Color(0x00000000),    tintColor = Color(0xFFB3B3C3))val LocalColorProvider = staticCompositionLocalOf<EcommerceConceptColors> { error("No default implementation") }
package navigationimport ru.alexgladkov.odyssey.compose.extensions.flowimport ru.alexgladkov.odyssey.compose.extensions.screenimport ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilderimport screens.AuthScreenimport screens.LoginScreenfun RootComposeBuilder.authFlow() {    flow(name = NavigationTree.Auth.AuthFlow.name) {        screen(name = NavigationTree.Auth.Register.name) {          AuthScreen()        }        screen(name = NavigationTree.Auth.Login.name) {          LoginScreen()        }    }}
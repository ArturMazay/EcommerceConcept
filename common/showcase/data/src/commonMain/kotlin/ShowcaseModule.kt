import localSource.ShowcaseLocalDataSourceimport networkDataSource.ShowcaseDataSourceimport org.kodein.di.*val showcaseModule = DI.Module("showcaseModule") {    bind<ShowcaseRepository>() with singleton {        ShowcaseRepositoryImpl(instance(), instance())    }    bind<ShowcaseDataSource>() with provider {        ShowcaseDataSource(instance())    }    bind<ShowcaseLocalDataSource>() with provider {        ShowcaseLocalDataSource()    }}
import localSource.ShowcaseLocalDataSourceimport models.Productsimport networkDataSource.ShowcaseDataSourceimport networkDataSource.models.mapToProductsclass ShowcaseRepositoryImpl(    private val networkDataSource: ShowcaseDataSource,    private val localDataSource: ShowcaseLocalDataSource,) : ShowcaseRepository {    override suspend fun getAllProducts(): Products {        return networkDataSource.getAllProducts().mapToProducts()    }}
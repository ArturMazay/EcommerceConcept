package networkDataSource.modelsimport kotlinx.serialization.SerialNameimport kotlinx.serialization.Serializableimport models.BestSellerimport models.HomeStoreimport models.Products@Serializabledata class Response(	@SerialName("best_seller") val bestSeller: List<BestSellerItem?>? = null,	@SerialName("home_store") val homeStore: List<HomeStoreItem?>? = null,)@Serializabledata class BestSellerItem(	@SerialName("is_favorites") val isFavorites: Boolean? = null,	@SerialName("discount_price") val discountPrice: Int? = null,	@SerialName("id") val id: Int? = null,	@SerialName("title") val title: String? = null,	@SerialName("price_without_discount") val priceWithoutDiscount: Int? = null,	@SerialName("picture") val picture: String? = null,)@Serializabledata class HomeStoreItem(	@SerialName("subtitle") val subtitle: String? = null,	@SerialName("id") val id: Int? = null,	@SerialName("title") val title: String? = null,	@SerialName("picture") val picture: String? = null,	@SerialName("is_buy") val isBuy: Boolean? = null,	@SerialName("is_new") val isNew: Boolean? = null,)fun Response.mapToProducts(    responseHomeStoreItem: List<HomeStoreItem?>?,    responseBestSeller: List<BestSellerItem?>?,): Products =    Products(        homeStore = mapToHomeStoreItem(responseHomeStoreItem = responseHomeStoreItem),        bestSeller = mapToBestSellerItem(responseBestSeller = responseBestSeller),    )fun mapToHomeStoreItem(responseHomeStoreItem: List<HomeStoreItem?>?): List<HomeStore>? =    responseHomeStoreItem?.map { list ->        HomeStore(subtitle = list?.subtitle,            id = list?.id,            title = list?.title,            picture = list?.picture,            isBuy = list?.isBuy,            isNew = list?.isNew)    }fun mapToBestSellerItem(responseBestSeller: List<BestSellerItem?>?): List<BestSeller?>? =    responseBestSeller?.map { list ->        BestSeller(            id = list?.id,            isFavorites = list?.isFavorites,            discountPrice = list?.discountPrice,            title = list?.title,            priceWithoutDiscount = list?.priceWithoutDiscount,            picture = list?.picture        )    }
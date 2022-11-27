package modelsdata class Products(	val bestSeller: List<BestSeller?>?,	val homeStore: List<HomeStore?>?,)data class HomeStore(	val subtitle: String?,	val id: Int?,	val title: String?,	val picture: String?,	val isBuy: Boolean?,	val isNew: Boolean?,)data class BestSeller(	val isFavorites: Boolean?,	val discountPrice: Int?,	val id: Int?,	val title: String?,	val priceWithoutDiscount: Int?,	val picture: String?,)
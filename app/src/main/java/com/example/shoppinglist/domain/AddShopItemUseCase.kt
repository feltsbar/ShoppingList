package com.example.shoppinglist.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    suspend fun addShopItemItem(shopItem: ShopItem) {
        shopListRepository.addShopItemItem(shopItem)
    }
}
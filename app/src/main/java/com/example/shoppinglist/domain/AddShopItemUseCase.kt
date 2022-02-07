package com.example.shoppinglist.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItemItem(shopItem: ShopItem) {
        shopListRepository.addShopItemItem(shopItem)
    }
}
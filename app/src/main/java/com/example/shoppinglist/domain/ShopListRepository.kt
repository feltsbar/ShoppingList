package com.example.shoppinglist.domain

interface ShopListRepository {

    fun addShopItemItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopList(): List<ShopItem>

    fun getShopItem(shopItemId : Int): ShopItem


}
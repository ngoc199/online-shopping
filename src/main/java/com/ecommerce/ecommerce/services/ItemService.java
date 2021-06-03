// Copyright 2020 ngoc
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// 
//     http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ecommerce.ecommerce.services;

import java.util.List;

import com.ecommerce.ecommerce.entities.Cart;
import com.ecommerce.ecommerce.entities.Item;
import com.ecommerce.ecommerce.entities.Order;
import com.ecommerce.ecommerce.repositories.ItemRepository;

import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    /**
     * Find all items in the order
     * 
     * @param order
     * @return list of item
     */
    public List<Item> findItemByOrder(Order order) {
        return itemRepository.findByOrder(order);
    }

    /**
     * Find all items in the cart
     * 
     * @param cart
     * @return list of item
     */
    public List<Item> findItemByCart(Cart cart) {
        return itemRepository.findByCart(cart);
    }

    /**
     * Save item to the database. Update is included
     * 
     * @param item
     * @return saved item
     */
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    /**
     * Delete item by id
     * 
     * @param id
     */
    public void deleteItemById(Long id) {
        itemRepository.deleteById(id);
    }

}
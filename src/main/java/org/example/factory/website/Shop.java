package org.example.factory.website;

import org.example.factory.pagesModel.CartPage;
import org.example.factory.pagesModel.ItemPage;
import org.example.factory.pagesModel.SearchPage;

public class Shop extends Website{
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}

package org.example.factory;

import org.example.factory.website.Blog;
import org.example.factory.website.Shop;
import org.example.factory.website.Website;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType websiteType) {
        switch (websiteType) {
            case BLOG: {
                return new Blog();
            }
            case SHOP: {
                return new Shop();
            }
            default: {
                return null;
            }
        }
    }
}

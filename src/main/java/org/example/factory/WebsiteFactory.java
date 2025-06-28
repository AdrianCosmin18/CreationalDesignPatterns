package org.example.factory;

import org.example.factory.website.Blog;
import org.example.factory.website.Shop;
import org.example.factory.website.Website;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType websiteType) {
        return switch (websiteType) {
            case BLOG -> new Blog();
            case SHOP -> new Shop();
            default -> null;
        };
    }
}

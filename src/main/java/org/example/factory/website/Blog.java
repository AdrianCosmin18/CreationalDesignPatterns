package org.example.factory.website;

import org.example.factory.pagesModel.AboutPage;
import org.example.factory.pagesModel.CommentPage;
import org.example.factory.pagesModel.ContactPage;
import org.example.factory.pagesModel.PostPage;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}

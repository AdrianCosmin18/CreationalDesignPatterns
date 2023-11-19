package org.example.factory.website;

import org.example.factory.pagesModel.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    public List<Page> getPages() {
        return pages;
    }

    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public abstract void createWebsite();
}

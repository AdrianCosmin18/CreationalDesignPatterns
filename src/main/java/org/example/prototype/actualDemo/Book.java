package org.example.prototype.actualDemo;

public class Book extends Item {

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    private int numberOfPages;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}

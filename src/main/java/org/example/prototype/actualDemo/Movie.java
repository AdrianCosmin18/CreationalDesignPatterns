package org.example.prototype.actualDemo;

import org.example.prototype.actualDemo.Item;

public class Movie extends Item {

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    private String runtime;

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
}

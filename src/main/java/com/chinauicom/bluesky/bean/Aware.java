package com.chinauicom.bluesky.bean;

public abstract class Aware<T> {

    private T template;

    public Aware(T template){
        this.template =template;
    }

    public T build(){
        return this.template;
    }

}

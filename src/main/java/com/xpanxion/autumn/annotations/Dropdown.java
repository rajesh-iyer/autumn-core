package com.xpanxion.autumn.annotations;

public @interface Dropdown {
    String value();
    
    String locator();
    
    String[] allowedValues();
}

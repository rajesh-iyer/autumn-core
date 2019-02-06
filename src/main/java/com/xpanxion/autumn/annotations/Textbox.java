package com.xpanxion.autumn.annotations;

import com.xpanxion.autumn.data.DataTypes;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Textbox {

    String value() default "";

    String[] dataprovider() default {"", ""};

    String locator() default "";

    String[] boundaries() default {"", ""};

    String[] equivalence() default {"", ""};

    DataTypes[] dataTypes() default {DataTypes.ANY};
}

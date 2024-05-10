package com.mkyong.json.gson.exclude;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

public class PasswordExclusionStrategy implements ExclusionStrategy {
    @Override
    public boolean shouldSkipField(FieldAttributes fieldAttributes) {
        return "password".equalsIgnoreCase(fieldAttributes.getName());
    }

    @Override
    public boolean shouldSkipClass(Class<?> aClass) {
        return false;
    }
}

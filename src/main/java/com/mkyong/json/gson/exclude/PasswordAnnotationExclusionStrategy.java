package com.mkyong.json.gson.exclude;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

public class PasswordAnnotationExclusionStrategy implements ExclusionStrategy {
    @Override
    public boolean shouldSkipField(FieldAttributes fieldAttributes) {

        // if found @GsonExcludeField, skip
        return fieldAttributes.getAnnotation(GsonExcludeField.class) != null;
    }

    @Override
    public boolean shouldSkipClass(Class<?> aClass) {
        return false;
    }
}

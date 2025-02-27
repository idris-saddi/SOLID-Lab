package com.directi.training.ocp.exercise_refactored;

public interface ResourceHandler {
    int allocate();
    void free(int resourceId);
}
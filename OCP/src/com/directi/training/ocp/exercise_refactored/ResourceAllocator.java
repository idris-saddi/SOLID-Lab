package com.directi.training.ocp.exercise_refactored;

import java.util.HashMap;
import java.util.Map;

public class ResourceAllocator {

    private static final int INVALID_RESOURCE_ID = -1;
    private final Map<ResourceType, ResourceHandler> handlers;

    public ResourceAllocator(Map<ResourceType, ResourceHandler> handlers) {
        this.handlers = new HashMap<>(handlers);
    }

    public int allocate(ResourceType resourceType) {
        ResourceHandler handler = handlers.get(resourceType);
        if (handler == null) {
            System.out.println("ERROR: Invalid resource type");
            return INVALID_RESOURCE_ID;
        }
        return handler.allocate();
    }

    public void free(ResourceType resourceType, int resourceId) {
        ResourceHandler handler = handlers.get(resourceType);
        if (handler == null) {
            System.out.println("ERROR: Invalid resource type");
            return;
        }
        handler.free(resourceId);
    }
}
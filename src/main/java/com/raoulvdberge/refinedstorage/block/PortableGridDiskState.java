package com.raoulvdberge.refinedstorage.block;

import net.minecraft.util.IStringSerializable;

public enum PortableGridDiskState implements IStringSerializable {
    NORMAL(0, "normal"),
    NEAR_CAPACITY(1, "near_capacity"),
    FULL(2, "full"),
    DISCONNECTED(3, "disconnected"),
    NONE(4, "none");

    private int id;
    private String type;

    PortableGridDiskState(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }

    public static PortableGridDiskState getById(int id) {
        for (PortableGridDiskState diskState : values()) {
            if (diskState.getId() == id) {
                return diskState;
            }
        }

        return NONE;
    }
}


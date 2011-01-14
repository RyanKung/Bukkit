
package org.bukkit.material;

import org.bukkit.ItemStack;
import org.bukkit.Material;

/**
 * Handles specific metadata for certain items or blocks
 */
public class MaterialData {
    private final int type;
    private byte data = 0;

    public MaterialData(final int type) {
        this(type, (byte)0);
    }

    public MaterialData(final Material type) {
        this(type, (byte)0);
    }

    public MaterialData(final int type, final byte data) {
        this.type = type;
        this.data = data;
    }

    public MaterialData(final Material type, final byte data) {
        this(type.getID(), data);
    }

    /**
     * Gets the raw data in this material
     *
     * @return Raw data
     */
    public byte getData() {
        return data;
    }

    /**
     * Sets the raw data of this material
     * 
     * @param data New raw data
     */
    public void setData(byte data) {
        this.data = data;
    }

    /**
     * Gets the Material that this MaterialData represents
     *
     * @return Material represented by this MaterialData
     */
    public Material getItemType() {
        return Material.getMaterial(type);
    }

    /**
     * Gets the Material ID that this MaterialData represents
     *
     * @return Material ID represented by this MaterialData
     */
    public int getItemTypeId() {
        return type;
    }

    /**
     * Creates a new ItemStack based on this MaterialData
     *
     * @return New ItemStack containing a copy of this MaterialData
     */
    public ItemStack toItemStack() {
        return new ItemStack(type);
    }
}

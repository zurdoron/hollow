package com.netflix.vms.transformer.hollowoutput;


public class VPerson implements Cloneable {

    public int id = java.lang.Integer.MIN_VALUE;

    public VPerson() { }

    public VPerson(int value) {
        this.id = value;
    }

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof VPerson))
            return false;

        VPerson o = (VPerson) other;
        if(o.id != id) return false;
        return true;
    }

    public int hashCode() {
        int hashCode = 1;
        hashCode = hashCode * 31 + id;
        return hashCode;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("VPerson{");
        builder.append("id=").append(id);
        builder.append("}");
        return builder.toString();
    }

    public VPerson clone() {
        try {
            VPerson clone = (VPerson)super.clone();
            clone.__assigned_ordinal = -1;
            return clone;
        } catch (CloneNotSupportedException cnse) { throw new RuntimeException(cnse); }
    }

    @SuppressWarnings("unused")
    private long __assigned_ordinal = -1;
}
// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


@Name("ngraph::pass::PassConfig") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class PassConfig extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PassConfig(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PassConfig(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public PassConfig position(long position) {
        return (PassConfig)super.position(position);
    }

    public PassConfig() { super((Pointer)null); allocate(); }
    private native void allocate();
    public native @Const @ByRef StringBoolMap get_enables();
    public native void set_pass_enable(@StdString BytePointer name, @Cast("bool") boolean enable);
    public native void set_pass_enable(@StdString String name, @Cast("bool") boolean enable);
    public native @Cast("bool") boolean get_pass_enable(@StdString BytePointer name);
    public native @Cast("bool") boolean get_pass_enable(@StdString String name);
    public native @Const @ByRef StringBoolMap get_pass_attributes();
    public native void set_pass_attribute(@StdString BytePointer name, @Cast("bool") boolean enable);
    public native void set_pass_attribute(@StdString String name, @Cast("bool") boolean enable);
    public native @Cast("bool") boolean get_pass_attribute(@StdString BytePointer name);
    public native @Cast("bool") boolean get_pass_attribute(@StdString String name);
}

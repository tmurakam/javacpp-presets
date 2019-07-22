// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TF_Function extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TF_Function() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TF_Function(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_Function(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TF_Function position(long position) {
        return (TF_Function)super.position(position);
    }

  public native @ByRef FunctionDef fdef(); public native TF_Function fdef(FunctionDef setter);
}

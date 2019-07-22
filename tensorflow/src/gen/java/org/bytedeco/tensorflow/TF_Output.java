// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Represents a specific output of an operation.
@Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TF_Output extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TF_Output() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TF_Output(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_Output(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TF_Output position(long position) {
        return (TF_Output)super.position(position);
    }

  public native TF_Operation oper(); public native TF_Output oper(TF_Operation setter);
  public native int index(); public native TF_Output index(int setter);  // The index of the output within oper.
}

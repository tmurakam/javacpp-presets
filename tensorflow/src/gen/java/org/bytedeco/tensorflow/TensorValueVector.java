// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("tensorflow::gtl::InlinedVector<tensorflow::TensorValue,4>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorValueVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorValueVector(Pointer p) { super(p); }
    public TensorValueVector()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef TensorValueVector put(@ByRef TensorValueVector x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @ByRef TensorValue get(@Cast("size_t") long i);
    public native TensorValueVector put(@Cast("size_t") long i, TensorValue value);
}


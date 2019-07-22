// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Some collective op implementations require runtime group configuration from
// the OpKernel.  Currently, this struct is used to set communicator key for
// NCCL-based collective implementation.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CollGroupRuntimeDetails extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CollGroupRuntimeDetails() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CollGroupRuntimeDetails(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CollGroupRuntimeDetails(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CollGroupRuntimeDetails position(long position) {
        return (CollGroupRuntimeDetails)super.position(position);
    }

  public native @StdString BytePointer communicator_key(); public native CollGroupRuntimeDetails communicator_key(BytePointer setter);  // for communicator-based techniques e.g. NCCL
  public native @StdString BytePointer ToString();
}

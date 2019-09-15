// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Remote Tensor Handle: A handle to a Tensor on a remote host. Note that only
// the shape is known.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RemoteTensorHandleData extends TensorHandleData {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RemoteTensorHandleData(Pointer p) { super(p); }

  public RemoteTensorHandleData(@Cast("tensorflow::int64") long op_id, int output_num, @Const @ByRef TensorShape shape,
                           EagerClient eager_client, @Cast("tensorflow::uint64") long context_id,
                           EagerContext ctx) { super((Pointer)null); allocate(op_id, output_num, shape, eager_client, context_id, ctx); }
  private native void allocate(@Cast("tensorflow::int64") long op_id, int output_num, @Const @ByRef TensorShape shape,
                           EagerClient eager_client, @Cast("tensorflow::uint64") long context_id,
                           EagerContext ctx);

  // A remote tensor handle does not have a Tensor object, hence it can only
  // support the shape requests.
  public native @ByVal Status Tensor(@Cast("const tensorflow::Tensor**") PointerPointer t);
  public native @ByVal Status Tensor(@Const @ByPtrPtr Tensor t);
  public native @ByVal Status TensorValue(TensorValue t);
  public native @ByVal Status Shape(TensorShape shape);
  public native @ByVal Status NumDims(IntPointer num_dims);
  public native @ByVal Status NumDims(IntBuffer num_dims);
  public native @ByVal Status NumDims(int... num_dims);
  public native @ByVal Status Dim(int dim_index, @Cast("tensorflow::int64*") LongPointer dim);
  public native @ByVal Status Dim(int dim_index, @Cast("tensorflow::int64*") LongBuffer dim);
  public native @ByVal Status Dim(int dim_index, @Cast("tensorflow::int64*") long... dim);
  public native @ByVal Status NumElements(@Cast("tensorflow::int64*") LongPointer num_elements);
  public native @ByVal Status NumElements(@Cast("tensorflow::int64*") LongBuffer num_elements);
  public native @ByVal Status NumElements(@Cast("tensorflow::int64*") long... num_elements);

  public native @StdString BytePointer DebugString();

  public native @Cast("tensorflow::int64") long op_id();
  public native int output_num();
}

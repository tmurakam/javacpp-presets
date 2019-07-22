// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Performs a padding as a preprocess during a convolution.
 * 
 *  Similar to FusedResizeAndPadConv2d, this op allows for an optimized
 *  implementation where the spatial padding transformation stage is fused with the
 *  im2col lookup, but in this case without the bilinear filtering required for
 *  resizing. Fusing the padding prevents the need to write out the intermediate
 *  results as whole tensors, reducing memory pressure, and we can get some latency
 *  gains by merging the transformation calculations.
 *  The data_format attribute for Conv2D isn't supported by this op, and 'NHWC'
 *  order is used instead.
 *  Internally this op uses a single per-graph scratch buffer, which means that it
 *  will block if multiple versions are being run in parallel. This is because this
 *  operator is primarily an optimization to minimize memory usage.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: 4-D with shape {@code [batch, in_height, in_width, in_channels]}.
 *  * paddings: A two-column matrix specifying the padding sizes. The number of
 *  rows must be the same as the rank of {@code input}.
 *  * filter: 4-D with shape
 *  {@code [filter_height, filter_width, in_channels, out_channels]}.
 *  * strides: 1-D of length 4.  The stride of the sliding window for each dimension
 *  of {@code input}. Must be in the same order as the dimension specified with format.
 *  * padding: The type of padding algorithm to use.
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FusedPadConv2D extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FusedPadConv2D(Pointer p) { super(p); }

  public FusedPadConv2D(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input paddings, @ByVal Input filter,
                 @StringPiece BytePointer mode, @ArraySlice IntPointer strides,
                 @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, paddings, filter, mode, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input paddings, @ByVal Input filter,
                 @StringPiece BytePointer mode, @ArraySlice IntPointer strides,
                 @StringPiece BytePointer padding);
  public FusedPadConv2D(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input paddings, @ByVal Input filter,
                 @StringPiece String mode, @ArraySlice IntBuffer strides,
                 @StringPiece String padding) { super((Pointer)null); allocate(scope, input, paddings, filter, mode, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input paddings, @ByVal Input filter,
                 @StringPiece String mode, @ArraySlice IntBuffer strides,
                 @StringPiece String padding);
  public FusedPadConv2D(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input paddings, @ByVal Input filter,
                 @StringPiece BytePointer mode, @ArraySlice int[] strides,
                 @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, paddings, filter, mode, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input paddings, @ByVal Input filter,
                 @StringPiece BytePointer mode, @ArraySlice int[] strides,
                 @StringPiece BytePointer padding);
  public FusedPadConv2D(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input paddings, @ByVal Input filter,
                 @StringPiece String mode, @ArraySlice IntPointer strides,
                 @StringPiece String padding) { super((Pointer)null); allocate(scope, input, paddings, filter, mode, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input paddings, @ByVal Input filter,
                 @StringPiece String mode, @ArraySlice IntPointer strides,
                 @StringPiece String padding);
  public FusedPadConv2D(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input paddings, @ByVal Input filter,
                 @StringPiece BytePointer mode, @ArraySlice IntBuffer strides,
                 @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, paddings, filter, mode, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input paddings, @ByVal Input filter,
                 @StringPiece BytePointer mode, @ArraySlice IntBuffer strides,
                 @StringPiece BytePointer padding);
  public FusedPadConv2D(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input paddings, @ByVal Input filter,
                 @StringPiece String mode, @ArraySlice int[] strides,
                 @StringPiece String padding) { super((Pointer)null); allocate(scope, input, paddings, filter, mode, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input paddings, @ByVal Input filter,
                 @StringPiece String mode, @ArraySlice int[] strides,
                 @StringPiece String padding);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native FusedPadConv2D operation(Operation setter);
  public native @ByRef Output output(); public native FusedPadConv2D output(Output setter);
}

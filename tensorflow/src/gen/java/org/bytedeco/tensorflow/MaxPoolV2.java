// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Performs max pooling on the input.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: 4-D input to pool over.
 *  * ksize: The size of the window for each dimension of the input tensor.
 *  * strides: The stride of the sliding window for each dimension of the
 *  input tensor.
 *  * padding: The type of padding algorithm to use.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * data_format: Specify the data format of the input and output data. With the
 *  default format "NHWC", the data is stored in the order of:
 *      [batch, in_height, in_width, in_channels].
 *  Alternatively, the format could be "NCHW", the data storage order of:
 *      [batch, in_channels, in_height, in_width].
 * 
 *  Returns:
 *  * {@code Output}: The max pooled output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MaxPoolV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MaxPoolV2(Pointer p) { super(p); }

  /** Optional attribute setters for MaxPoolV2 */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** Specify the data format of the input and output data. With the
     *  default format "NHWC", the data is stored in the order of:
     *      [batch, in_height, in_width, in_channels].
     *  Alternatively, the format could be "NCHW", the data storage order of:
     *      [batch, in_channels, in_height, in_width].
     * 
     *  Defaults to "NHWC" */
    public native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
    public native @ByVal Attrs DataFormat(@StringPiece String x);

    public native @StringPiece BytePointer data_format_(); public native Attrs data_format_(BytePointer setter);
  }
  public MaxPoolV2(@Const @ByRef Scope scope, @ByVal Input input,
            @ByVal Input ksize, @ByVal Input strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, ksize, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
            @ByVal Input ksize, @ByVal Input strides, @StringPiece BytePointer padding);
  public MaxPoolV2(@Const @ByRef Scope scope, @ByVal Input input,
            @ByVal Input ksize, @ByVal Input strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, ksize, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
            @ByVal Input ksize, @ByVal Input strides, @StringPiece String padding);
  public MaxPoolV2(@Const @ByRef Scope scope, @ByVal Input input,
            @ByVal Input ksize, @ByVal Input strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, ksize, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
            @ByVal Input ksize, @ByVal Input strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public MaxPoolV2(@Const @ByRef Scope scope, @ByVal Input input,
            @ByVal Input ksize, @ByVal Input strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, ksize, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
            @ByVal Input ksize, @ByVal Input strides, @StringPiece String padding, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
  public static native @ByVal Attrs DataFormat(@StringPiece String x);

  public native @ByRef Operation operation(); public native MaxPoolV2 operation(Operation setter);
  public native @ByRef Output output(); public native MaxPoolV2 output(Output setter);
}

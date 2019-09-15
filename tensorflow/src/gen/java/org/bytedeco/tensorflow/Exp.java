// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes exponential of x element-wise.  \(y = e^x\).
 * 
 *    This function computes the exponential of every element in the input tensor.
 *    i.e. {@code exp(x)} or {@code e^(x)}, where {@code x} is the input tensor.
 *    {@code e} denotes Euler's number and is approximately equal to 2.718281.
 *    Output is positive for any real input.
 * 
 *    <pre>{@code python
 *    x = tf.constant(2.0)
 *    tf.math.exp(x) ==> 7.389056
 * 
 *    x = tf.constant([2.0, 8.0])
 *    tf.math.exp(x) ==> array([7.389056, 2980.958], dtype=float32)
 *    }</pre>
 * 
 *    For complex numbers, the exponential value is calculated as follows:
 * 
 *    <pre>{@code
 *    e^(x+iy) = e^x * e^iy = e^x * (cos y + i sin y)
 *    }</pre>
 * 
 *    Let's consider complex number 1+1j as an example.
 *    e^1 * (cos 1 + i sin 1) = 2.7182818284590 * (0.54030230586+0.8414709848j)
 * 
 *    <pre>{@code python
 *    x = tf.constant(1 + 1j)
 *    tf.math.exp(x) ==> 1.4686939399158851+2.2873552871788423j
 *    }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The y tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Exp extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Exp(Pointer p) { super(p); }

  public Exp(@Const @ByRef Scope scope, @ByVal Input x) { super((Pointer)null); allocate(scope, x); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Exp operation(Operation setter);
  public native @ByRef Output y(); public native Exp y(Output setter);
}

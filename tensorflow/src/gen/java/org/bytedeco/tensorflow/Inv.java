// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the reciprocal of x element-wise.
 * 
 *  I.e., \(y = 1 / x\).
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The y tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Inv extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Inv(Pointer p) { super(p); }

  public Inv(@Const @ByRef Scope scope, @ByVal Input x) { super((Pointer)null); allocate(scope, x); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Inv operation(Operation setter);
  public native @ByRef Output y(); public native Inv y(Output setter);
}

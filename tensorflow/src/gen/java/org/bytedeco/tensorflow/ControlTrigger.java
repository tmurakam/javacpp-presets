// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Does nothing. Serves as a control trigger for scheduling.
 * 
 *  Only useful as a placeholder for control edges.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ControlTrigger extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ControlTrigger(Pointer p) { super(p); }

  public ControlTrigger(@Const @ByRef Scope scope) { super((Pointer)null); allocate(scope); }
  private native void allocate(@Const @ByRef Scope scope);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public native @ByRef Operation operation(); public native ControlTrigger operation(Operation setter);
}

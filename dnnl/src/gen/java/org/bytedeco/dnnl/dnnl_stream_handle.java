// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.dnnl.global.dnnl.*;

@Name("dnnl::handle<dnnl_stream_t>") @NoOffset @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_stream_handle extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_stream_handle(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dnnl_stream_handle(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public dnnl_stream_handle position(long position) {
        return (dnnl_stream_handle)super.position(position);
    }

    /** Constructs an empty handle object.
     * 
     *  \warning
     *      Uninitialized object cannot be used in most library calls and is
     *      equivalent to a null pointer. Any attempt to use its methods, or
     *      passing it to the other library function, will cause an exception
     *      to be thrown. */
    public dnnl_stream_handle() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Copy constructor. */
    public dnnl_stream_handle(@Const @ByRef dnnl_stream_handle arg0) { super((Pointer)null); allocate(arg0); }
    private native void allocate(@Const @ByRef dnnl_stream_handle arg0);
    /** Assignment operator. */
    public native @ByRef @Name("operator =") dnnl_stream_handle put(@Const @ByRef dnnl_stream_handle arg0);
    /** Move constructor. */
    /** Move assignment operator. */

    /** Constructs a handle wrapper object from a C API handle.
     * 
     *  @param t The C API handle to wrap.
     *  @param weak A flag specifying whether to construct a weak wrapper;
     *      defaults to \c false. */
    
    ///
    public dnnl_stream_handle(dnnl_stream t, @Cast("bool") boolean weak/*=false*/) { super((Pointer)null); allocate(t, weak); }
    private native void allocate(dnnl_stream t, @Cast("bool") boolean weak/*=false*/);
    public dnnl_stream_handle(dnnl_stream t) { super((Pointer)null); allocate(t); }
    private native void allocate(dnnl_stream t);

    /** Resets the handle wrapper objects to wrap a new C API handle.
     * 
     *  @param t The new value of the C API handle.
     *  @param weak A flag specifying whether the wrapper should be weak;
     *      defaults to \c false. */
    
    ///
    public native void reset(dnnl_stream t, @Cast("bool") boolean weak/*=false*/);
    public native void reset(dnnl_stream t);

    /** Returns the underlying C API handle.
     * 
     *  @param allow_empty A flag signifying whether the method is allowed to
     *      return an empty (null) object without throwing an exception.
     *  @return The underlying C API handle. */
    
    ///
    public native dnnl_stream get(@Cast("bool") boolean allow_empty/*=false*/);
    public native dnnl_stream get();

    /** Converts a handle to the underlying C API handle type. Does not throw
     *  and returns {@code nullptr} if the object is empty.
     * 
     *  @return The underlying C API handle. */
    
    ///
    public native @Name("operator dnnl_stream_t") dnnl_stream asDnnl_stream();

    /** Checks whether the object is empty.
     * 
     *  @return Whether the object is empty. */
    
    ///
    public native @Cast("bool") @Name("operator bool") boolean asBoolean();

    /** Equality operator.
     * 
     *  @param other Another handle wrapper.
     *  @return \c true if this and the other handle wrapper manage the same
     *      underlying C API handle, and \c false otherwise. Empty handle
     *      objects are considered to be equal. */
    
    ///
    public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef dnnl_stream_handle other);

    /** Inequality operator.
     * 
     *  @param other Another handle wrapper.
     *  @return \c true if this and the other handle wrapper manage different
     *      underlying C API handles, and \c false otherwise. Empty handle
     *      objects are considered to be equal. */
    public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef dnnl_stream_handle other);
}

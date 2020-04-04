// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \addtogroup dnnl_api_primitives Primitives
 *  Compute primitives
 *  @see \ref dev_guide_basic_concepts
 *  \{
 <p>
 *  \addtogroup dnnl_api_primitives_common Common
 *  Common operations to create, destroy and inspect primitives
 *  \{
 <p>
 *  Base class for all computational primitives. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class primitive extends dnnl_primitive_handle {
    static { Loader.load(); }


    
        public primitive() { super((Pointer)null); allocate(); }
        private native void allocate();
        public primitive(@Const @ByRef primitive arg0) { super((Pointer)null); allocate(arg0); }
        private native void allocate(@Const @ByRef primitive arg0);
        
        ///
        public primitive(dnnl_primitive t, @Cast("bool") boolean weak/*=false*/) { super((Pointer)null); allocate(t, weak); }
        private native void allocate(dnnl_primitive t, @Cast("bool") boolean weak/*=false*/);
        public primitive(dnnl_primitive t) { super((Pointer)null); allocate(t); }
        private native void allocate(dnnl_primitive t);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public primitive(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public primitive(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public primitive position(long position) {
        return (primitive)super.position(position);
    }


    /** Kinds of primitives supported by the library. */
    public enum kind {
        /** Undefined primitive */
        undef(dnnl_undefined_primitive),
        /** A reorder primitive. */
        reorder(dnnl_reorder),
        /** A shuffle primitive. */
        shuffle(dnnl_shuffle),
        /** A (out-of-place) tensor concatenation primitive. */
        concat(dnnl_concat),
        /** A summation primitive. */
        sum(dnnl_sum),
        /** A convolution primitive. */
        convolution(dnnl_convolution),
        /** A deconvolution primitive. */
        deconvolution(dnnl_deconvolution),
        /** An element-wise primitive. */
        eltwise(dnnl_eltwise),
        /** A softmax primitive. */
        softmax(dnnl_softmax),
        /** A pooling primitive. */
        pooling(dnnl_pooling),
        /** An LRN primitive. */
        lrn(dnnl_lrn),
        /** A batch normalization primitive. */
        batch_normalization(dnnl_batch_normalization),
        /** A layer normalization primitive. */
        layer_normalization(dnnl_layer_normalization),
        /** An inner product primitive. */
        inner_product(dnnl_inner_product),
        /** A rnn primitive. */
        rnn(dnnl_rnn),
        /** A binary primitive. */
        binary(dnnl_binary),
        /** A logsoftmax primitive. */
        logsoftmax(dnnl_logsoftmax),
        /** A matmul (matrix multiplication) primitive. */
        matmul(dnnl_matmul),
        /** A resampling primitive. */
        resampling(dnnl_resampling);

        public final int value;
        private kind(int v) { this.value = v; }
        private kind(kind e) { this.value = e.value; }
        public kind intern() { for (kind e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    /** Default constructor. Constructs an empty object. */

    /** Constructs a primitive from a C API primitive descriptor.
     * 
     *  @param c_pd C API primitive descriptor. */
    
    ///
    public primitive(@Const dnnl_primitive_desc c_pd) { super((Pointer)null); allocate(c_pd); }
    private native void allocate(@Const dnnl_primitive_desc c_pd);

    /** Constructs a primitive from a primitive descriptor.
     * 
     *  @param pd Primitive descriptor. */
    
    ///
    public primitive(@Const @ByRef org.bytedeco.dnnl.primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef org.bytedeco.dnnl.primitive_desc pd);

    /** Returns the C API primitive descriptor of the underlying C API
     *  primitive.
     * 
     *  @return The underlying C API primitive descriptor. */
    
    ///
    public native @Name("get_primitive_desc") @Const dnnl_primitive_desc get_dnnl_primitive_desc();

    /** Returns the kind of the primitive.
     * 
     *  @return The primitive kind. */
    
    ///
    ///
    public native kind get_kind();

    /** Executes computations specified by the primitive in a specified stream.
     * 
     *  Arguments are passed via an arguments map containing <index,
     *  memory object> pairs. The index must be one of the {@code DNNL_ARG_*} values
     *  such as {@code DNNL_ARG_SRC}, and the memory must have a memory descriptor
     *  matching the one returned by
     *  primitive_desc::query_md(#query::exec_arg_md, index) unless using
     *  dynamic shapes (see DNNL_RUNTIME_DIM_VAL).
     * 
     *  @param stream Stream object. The stream must belong to the same engine
     *      as the primitive.
     *  @param args Arguments map. */
    public native void execute(
                @ByRef stream stream, @Const @ByRef IntMemoryMap args);
}

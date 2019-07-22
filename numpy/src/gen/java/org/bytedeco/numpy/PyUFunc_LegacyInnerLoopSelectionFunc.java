// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


/*
 * Given an array of DTypes as returned by the PyUFunc_TypeResolutionFunc,
 * and an array of fixed strides (the array will contain NPY_MAX_INTP for
 * strides which are not necessarily fixed), returns an inner loop
 * with associated auxiliary data.
 *
 * For backwards compatibility, there is a variant of the inner loop
 * selection which returns an inner loop irrespective of the strides,
 * and with a void* static auxiliary data instead of an NpyAuxData *
 * dynamically allocatable auxiliary data.
 *
 * ufunc:             The ufunc object.
 * dtypes:            An array which has been populated with dtypes,
 *                    in most cases by the type resolution function
 *                    for the same ufunc.
 * fixed_strides:     For each input/output, either the stride that
 *                    will be used every time the function is called
 *                    or NPY_MAX_INTP if the stride might change or
 *                    is not known ahead of time. The loop selection
 *                    function may use this stride to pick inner loops
 *                    which are optimized for contiguous or 0-stride
 *                    cases.
 * out_innerloop:     Should be populated with the correct ufunc inner
 *                    loop for the given type.
 * out_innerloopdata: Should be populated with the void* data to
 *                    be passed into the out_innerloop function.
 * out_needs_api:     If the inner loop needs to use the Python API,
 *                    should set the to 1, otherwise should leave
 *                    this untouched.
 */
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyUFunc_LegacyInnerLoopSelectionFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PyUFunc_LegacyInnerLoopSelectionFunc(Pointer p) { super(p); }
    protected PyUFunc_LegacyInnerLoopSelectionFunc() { allocate(); }
    private native void allocate();
    public native int call(
                            PyUFuncObject ufunc,
                            @ByPtrPtr PyArray_Descr dtypes,
                            @ByPtrPtr PyUFuncGenericFunction out_innerloop,
                            @Cast("void**") @ByPtrPtr Pointer out_innerloopdata,
                            IntPointer out_needs_api);
}

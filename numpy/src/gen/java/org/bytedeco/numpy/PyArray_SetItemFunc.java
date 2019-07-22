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

@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArray_SetItemFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PyArray_SetItemFunc(Pointer p) { super(p); }
    protected PyArray_SetItemFunc() { allocate(); }
    private native void allocate();
    public native int call(PyObject arg0, Pointer arg1, Pointer arg2);
}

// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.dnnl.global.dnnl.*;

@Name("std::vector<dnnl::primitive>") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class primitive_vector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public primitive_vector(Pointer p) { super(p); }
    public primitive_vector(primitive value) { this(1); put(0, value); }
    public primitive_vector(primitive ... array) { this(array.length); put(array); }
    public primitive_vector()       { allocate();  }
    public primitive_vector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef primitive_vector put(@ByRef primitive_vector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @ByRef primitive get(@Cast("size_t") long i);
    public native primitive_vector put(@Cast("size_t") long i, primitive value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef primitive value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const primitive get();
    }

    public primitive[] get() {
        primitive[] array = new primitive[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public primitive pop_back() {
        long size = size();
        primitive value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public primitive_vector push_back(primitive value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public primitive_vector put(primitive value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public primitive_vector put(primitive ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}


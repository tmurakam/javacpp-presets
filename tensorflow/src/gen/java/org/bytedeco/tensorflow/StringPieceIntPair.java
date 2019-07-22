// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@NoOffset @Name("std::pair<tensorflow::StringPiece,int>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StringPieceIntPair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringPieceIntPair(Pointer p) { super(p); }
    public StringPieceIntPair(BytePointer firstValue, int secondValue) { this(); put(firstValue, secondValue); }
    public StringPieceIntPair(String firstValue, int secondValue) { this(); put(firstValue, secondValue); }
    public StringPieceIntPair()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef StringPieceIntPair put(@ByRef StringPieceIntPair x);


    @MemberGetter public native @StringPiece BytePointer first(); public native StringPieceIntPair first(BytePointer first);
    @MemberGetter public native int second();  public native StringPieceIntPair second(int second);
    @MemberSetter @Index public native StringPieceIntPair first(@StringPiece String first);

    public StringPieceIntPair put(BytePointer firstValue, int secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }

    public StringPieceIntPair put(String firstValue, int secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}


// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class OptimizerOptions extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OptimizerOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OptimizerOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OptimizerOptions position(long position) {
        return (OptimizerOptions)super.position(position);
    }

  public OptimizerOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  public OptimizerOptions(@Const @ByRef OptimizerOptions from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef OptimizerOptions from);

  public native @ByRef @Name("operator =") OptimizerOptions put(@Const @ByRef OptimizerOptions from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef OptimizerOptions default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const OptimizerOptions internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(OptimizerOptions other);
  public native void Swap(OptimizerOptions other);
  

  // implements Message ----------------------------------------------

  public native OptimizerOptions New();

  public native OptimizerOptions New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef OptimizerOptions from);
  public native void MergeFrom(@Const @ByRef OptimizerOptions from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------
  @MemberGetter public static native @Cast("const tensorflow::OptimizerOptions::Level") int L1();
  public static final int L1 = L1();
  @MemberGetter public static native @Cast("const tensorflow::OptimizerOptions::Level") int L0();
  public static final int L0 = L0();
  public static native @Cast("bool") boolean Level_IsValid(int value);
  @MemberGetter public static native @Cast("const tensorflow::OptimizerOptions::Level") int Level_MIN();
  public static final int Level_MIN = Level_MIN();
  @MemberGetter public static native @Cast("const tensorflow::OptimizerOptions::Level") int Level_MAX();
  public static final int Level_MAX = Level_MAX();
  @MemberGetter public static native int Level_ARRAYSIZE();
  public static final int Level_ARRAYSIZE = Level_ARRAYSIZE();
  public static native @Cast("const google::protobuf::EnumDescriptor*") Pointer Level_descriptor();
  public static native @Cast("bool") boolean Level_Parse(@StdString BytePointer name,
        @Cast("tensorflow::OptimizerOptions::Level*") IntPointer value);
  public static native @Cast("bool") boolean Level_Parse(@StdString String name,
        @Cast("tensorflow::OptimizerOptions::Level*") IntBuffer value);
  public static native @Cast("bool") boolean Level_Parse(@StdString BytePointer name,
        @Cast("tensorflow::OptimizerOptions::Level*") int... value);
  public static native @Cast("bool") boolean Level_Parse(@StdString String name,
        @Cast("tensorflow::OptimizerOptions::Level*") IntPointer value);
  public static native @Cast("bool") boolean Level_Parse(@StdString BytePointer name,
        @Cast("tensorflow::OptimizerOptions::Level*") IntBuffer value);
  public static native @Cast("bool") boolean Level_Parse(@StdString String name,
        @Cast("tensorflow::OptimizerOptions::Level*") int... value);
  @MemberGetter public static native @Cast("const tensorflow::OptimizerOptions::GlobalJitLevel") int DEFAULT();
  public static final int DEFAULT = DEFAULT();
  @MemberGetter public static native @Cast("const tensorflow::OptimizerOptions::GlobalJitLevel") int OFF();
  public static final int OFF = OFF();
  @MemberGetter public static native @Cast("const tensorflow::OptimizerOptions::GlobalJitLevel") int ON_1();
  public static final int ON_1 = ON_1();
  @MemberGetter public static native @Cast("const tensorflow::OptimizerOptions::GlobalJitLevel") int ON_2();
  public static final int ON_2 = ON_2();
  public static native @Cast("bool") boolean GlobalJitLevel_IsValid(int value);
  @MemberGetter public static native @Cast("const tensorflow::OptimizerOptions::GlobalJitLevel") int GlobalJitLevel_MIN();
  public static final int GlobalJitLevel_MIN = GlobalJitLevel_MIN();
  @MemberGetter public static native @Cast("const tensorflow::OptimizerOptions::GlobalJitLevel") int GlobalJitLevel_MAX();
  public static final int GlobalJitLevel_MAX = GlobalJitLevel_MAX();
  @MemberGetter public static native int GlobalJitLevel_ARRAYSIZE();
  public static final int GlobalJitLevel_ARRAYSIZE = GlobalJitLevel_ARRAYSIZE();
  public static native @Cast("const google::protobuf::EnumDescriptor*") Pointer GlobalJitLevel_descriptor();
  public static native @Cast("bool") boolean GlobalJitLevel_Parse(@StdString BytePointer name,
        @Cast("tensorflow::OptimizerOptions::GlobalJitLevel*") IntPointer value);
  public static native @Cast("bool") boolean GlobalJitLevel_Parse(@StdString String name,
        @Cast("tensorflow::OptimizerOptions::GlobalJitLevel*") IntBuffer value);
  public static native @Cast("bool") boolean GlobalJitLevel_Parse(@StdString BytePointer name,
        @Cast("tensorflow::OptimizerOptions::GlobalJitLevel*") int... value);
  public static native @Cast("bool") boolean GlobalJitLevel_Parse(@StdString String name,
        @Cast("tensorflow::OptimizerOptions::GlobalJitLevel*") IntPointer value);
  public static native @Cast("bool") boolean GlobalJitLevel_Parse(@StdString BytePointer name,
        @Cast("tensorflow::OptimizerOptions::GlobalJitLevel*") IntBuffer value);
  public static native @Cast("bool") boolean GlobalJitLevel_Parse(@StdString String name,
        @Cast("tensorflow::OptimizerOptions::GlobalJitLevel*") int... value);

  // accessors -------------------------------------------------------

  // bool do_common_subexpression_elimination = 1;
  public native void clear_do_common_subexpression_elimination();
  @MemberGetter public static native int kDoCommonSubexpressionEliminationFieldNumber();
  public static final int kDoCommonSubexpressionEliminationFieldNumber = kDoCommonSubexpressionEliminationFieldNumber();
  public native @Cast("bool") boolean do_common_subexpression_elimination();
  public native void set_do_common_subexpression_elimination(@Cast("bool") boolean value);

  // bool do_constant_folding = 2;
  public native void clear_do_constant_folding();
  @MemberGetter public static native int kDoConstantFoldingFieldNumber();
  public static final int kDoConstantFoldingFieldNumber = kDoConstantFoldingFieldNumber();
  public native @Cast("bool") boolean do_constant_folding();
  public native void set_do_constant_folding(@Cast("bool") boolean value);

  // bool do_function_inlining = 4;
  public native void clear_do_function_inlining();
  @MemberGetter public static native int kDoFunctionInliningFieldNumber();
  public static final int kDoFunctionInliningFieldNumber = kDoFunctionInliningFieldNumber();
  public native @Cast("bool") boolean do_function_inlining();
  public native void set_do_function_inlining(@Cast("bool") boolean value);

  // .tensorflow.OptimizerOptions.Level opt_level = 3;
  public native void clear_opt_level();
  @MemberGetter public static native int kOptLevelFieldNumber();
  public static final int kOptLevelFieldNumber = kOptLevelFieldNumber();
  public native @Cast("tensorflow::OptimizerOptions_Level") int opt_level();
  public native void set_opt_level(@Cast("tensorflow::OptimizerOptions_Level") int value);

  // int64 max_folded_constant_in_bytes = 6;
  public native void clear_max_folded_constant_in_bytes();
  @MemberGetter public static native int kMaxFoldedConstantInBytesFieldNumber();
  public static final int kMaxFoldedConstantInBytesFieldNumber = kMaxFoldedConstantInBytesFieldNumber();
  public native @Cast("google::protobuf::int64") long max_folded_constant_in_bytes();
  public native void set_max_folded_constant_in_bytes(@Cast("google::protobuf::int64") long value);

  // .tensorflow.OptimizerOptions.GlobalJitLevel global_jit_level = 5;
  public native void clear_global_jit_level();
  @MemberGetter public static native int kGlobalJitLevelFieldNumber();
  public static final int kGlobalJitLevelFieldNumber = kGlobalJitLevelFieldNumber();
  public native @Cast("tensorflow::OptimizerOptions_GlobalJitLevel") int global_jit_level();
  public native void set_global_jit_level(@Cast("tensorflow::OptimizerOptions_GlobalJitLevel") int value);
}

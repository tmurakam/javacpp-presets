// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FunctionDef extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FunctionDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FunctionDef position(long position) {
        return (FunctionDef)super.position(position);
    }

  public FunctionDef() { super((Pointer)null); allocate(); }
  private native void allocate();

  public FunctionDef(@Const @ByRef FunctionDef from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef FunctionDef from);

  public native @ByRef @Name("operator =") FunctionDef put(@Const @ByRef FunctionDef from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef FunctionDef default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const FunctionDef internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(FunctionDef other);
  public native void Swap(FunctionDef other);
  

  // implements Message ----------------------------------------------

  public native FunctionDef New();

  public native FunctionDef New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef FunctionDef from);
  public native void MergeFrom(@Const @ByRef FunctionDef from);
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

  // accessors -------------------------------------------------------

  // repeated .tensorflow.NodeDef node_def = 3;
  public native int node_def_size();
  public native void clear_node_def();
  @MemberGetter public static native int kNodeDefFieldNumber();
  public static final int kNodeDefFieldNumber = kNodeDefFieldNumber();
  public native NodeDef mutable_node_def(int index);
  public native @Const @ByRef NodeDef node_def(int index);
  public native NodeDef add_node_def();

  // map<string, string> ret = 4;
  public native int ret_size();
  public native void clear_ret();
  @MemberGetter public static native int kRetFieldNumber();
  public static final int kRetFieldNumber = kRetFieldNumber();
  public native @Const @ByRef StringStringMap ret();
  public native StringStringMap mutable_ret();

  // map<string, .tensorflow.AttrValue> attr = 5;
  public native int attr_size();
  public native void clear_attr();
  @MemberGetter public static native int kAttrFieldNumber();
  public static final int kAttrFieldNumber = kAttrFieldNumber();
  public native @Const @ByRef StringAttrValueMap attr();
  public native StringAttrValueMap mutable_attr();

  // map<string, string> control_ret = 6;
  public native int control_ret_size();
  public native void clear_control_ret();
  @MemberGetter public static native int kControlRetFieldNumber();
  public static final int kControlRetFieldNumber = kControlRetFieldNumber();
  public native @Const @ByRef StringStringMap control_ret();
  public native StringStringMap mutable_control_ret();

  // map<uint32, .tensorflow.FunctionDef.ArgAttrs> arg_attr = 7;
  public native int arg_attr_size();
  public native void clear_arg_attr();
  @MemberGetter public static native int kArgAttrFieldNumber();
  public static final int kArgAttrFieldNumber = kArgAttrFieldNumber();
  public native @Const @ByRef IntFunctionDef_ArgAttrsMap arg_attr();
  public native IntFunctionDef_ArgAttrsMap mutable_arg_attr();

  // .tensorflow.OpDef signature = 1;
  public native @Cast("bool") boolean has_signature();
  public native void clear_signature();
  @MemberGetter public static native int kSignatureFieldNumber();
  public static final int kSignatureFieldNumber = kSignatureFieldNumber();
  public native @Const @ByRef OpDef signature();
  public native OpDef release_signature();
  public native OpDef mutable_signature();
  public native void set_allocated_signature(OpDef signature);
  public native void unsafe_arena_set_allocated_signature(
        OpDef signature);
  public native OpDef unsafe_arena_release_signature();
}

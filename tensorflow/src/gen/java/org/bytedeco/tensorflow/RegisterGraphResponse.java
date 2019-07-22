// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RegisterGraphResponse extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RegisterGraphResponse(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RegisterGraphResponse(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RegisterGraphResponse position(long position) {
        return (RegisterGraphResponse)super.position(position);
    }

  public RegisterGraphResponse() { super((Pointer)null); allocate(); }
  private native void allocate();

  public RegisterGraphResponse(@Const @ByRef RegisterGraphResponse from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef RegisterGraphResponse from);

  public native @ByRef @Name("operator =") RegisterGraphResponse put(@Const @ByRef RegisterGraphResponse from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef RegisterGraphResponse default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const RegisterGraphResponse internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(RegisterGraphResponse other);
  public native void Swap(RegisterGraphResponse other);
  

  // implements Message ----------------------------------------------

  public native RegisterGraphResponse New();

  public native RegisterGraphResponse New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef RegisterGraphResponse from);
  public native void MergeFrom(@Const @ByRef RegisterGraphResponse from);
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

  // string graph_handle = 1;
  public native void clear_graph_handle();
  @MemberGetter public static native int kGraphHandleFieldNumber();
  public static final int kGraphHandleFieldNumber = kGraphHandleFieldNumber();
  public native @StdString BytePointer graph_handle();
  public native void set_graph_handle(@StdString BytePointer value);
  public native void set_graph_handle(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_graph_handle(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_graph_handle(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_graph_handle();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_graph_handle();
  public native void set_allocated_graph_handle(@StdString @Cast({"char*", "std::string*"}) BytePointer graph_handle);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_graph_handle();
  public native void unsafe_arena_set_allocated_graph_handle(
        @StdString @Cast({"char*", "std::string*"}) BytePointer graph_handle);
}

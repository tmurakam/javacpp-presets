// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MarkRecvFinishedRequest extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MarkRecvFinishedRequest(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MarkRecvFinishedRequest(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MarkRecvFinishedRequest position(long position) {
        return (MarkRecvFinishedRequest)super.position(position);
    }

  public MarkRecvFinishedRequest() { super((Pointer)null); allocate(); }
  private native void allocate();

  public MarkRecvFinishedRequest(@Const @ByRef MarkRecvFinishedRequest from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef MarkRecvFinishedRequest from);

  public native @ByRef @Name("operator =") MarkRecvFinishedRequest put(@Const @ByRef MarkRecvFinishedRequest from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef MarkRecvFinishedRequest default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const MarkRecvFinishedRequest internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(MarkRecvFinishedRequest other);
  public native void Swap(MarkRecvFinishedRequest other);
  

  // implements Message ----------------------------------------------

  public native MarkRecvFinishedRequest New();

  public native MarkRecvFinishedRequest New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef MarkRecvFinishedRequest from);
  public native void MergeFrom(@Const @ByRef MarkRecvFinishedRequest from);
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

  // int64 request_id = 1;
  public native void clear_request_id();
  @MemberGetter public static native int kRequestIdFieldNumber();
  public static final int kRequestIdFieldNumber = kRequestIdFieldNumber();
  public native @Cast("google::protobuf::int64") long request_id();
  public native void set_request_id(@Cast("google::protobuf::int64") long value);
}

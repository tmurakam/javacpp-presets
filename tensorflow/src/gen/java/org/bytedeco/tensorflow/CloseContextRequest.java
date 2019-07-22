// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow::eager") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CloseContextRequest extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CloseContextRequest(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CloseContextRequest(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CloseContextRequest position(long position) {
        return (CloseContextRequest)super.position(position);
    }

  public CloseContextRequest() { super((Pointer)null); allocate(); }
  private native void allocate();

  public CloseContextRequest(@Const @ByRef CloseContextRequest from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef CloseContextRequest from);

  public native @ByRef @Name("operator =") CloseContextRequest put(@Const @ByRef CloseContextRequest from);
//   #if LANG_CXX11
//   #endif
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef CloseContextRequest default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const CloseContextRequest internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(CloseContextRequest other);
  

  // implements Message ----------------------------------------------

  public native CloseContextRequest New();

  public native CloseContextRequest New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef CloseContextRequest from);
  public native void MergeFrom(@Const @ByRef CloseContextRequest from);
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

  // fixed64 context_id = 1;
  public native void clear_context_id();
  @MemberGetter public static native int kContextIdFieldNumber();
  public static final int kContextIdFieldNumber = kContextIdFieldNumber();
  public native @Cast("google::protobuf::uint64") long context_id();
  public native void set_context_id(@Cast("google::protobuf::uint64") long value);
}

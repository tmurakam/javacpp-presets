// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RecvBufRequest extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecvBufRequest(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RecvBufRequest(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RecvBufRequest position(long position) {
        return (RecvBufRequest)super.position(position);
    }

  public RecvBufRequest() { super((Pointer)null); allocate(); }
  private native void allocate();

  public RecvBufRequest(@Const @ByRef RecvBufRequest from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef RecvBufRequest from);

  public native @ByRef @Name("operator =") RecvBufRequest put(@Const @ByRef RecvBufRequest from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef RecvBufRequest default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const RecvBufRequest internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(RecvBufRequest other);
  public native void Swap(RecvBufRequest other);
  

  // implements Message ----------------------------------------------

  public native RecvBufRequest New();

  public native RecvBufRequest New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef RecvBufRequest from);
  public native void MergeFrom(@Const @ByRef RecvBufRequest from);
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

  // string buf_rendezvous_key = 2;
  public native void clear_buf_rendezvous_key();
  @MemberGetter public static native int kBufRendezvousKeyFieldNumber();
  public static final int kBufRendezvousKeyFieldNumber = kBufRendezvousKeyFieldNumber();
  public native @StdString BytePointer buf_rendezvous_key();
  public native void set_buf_rendezvous_key(@StdString BytePointer value);
  public native void set_buf_rendezvous_key(@StdString String value);
  public native void set_buf_rendezvous_key(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_buf_rendezvous_key(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_buf_rendezvous_key();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_buf_rendezvous_key();
  public native void set_allocated_buf_rendezvous_key(@StdString @Cast({"char*", "std::string*"}) BytePointer buf_rendezvous_key);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_buf_rendezvous_key();
  public native void unsafe_arena_set_allocated_buf_rendezvous_key(
        @StdString @Cast({"char*", "std::string*"}) BytePointer buf_rendezvous_key);

  // string src_device = 8;
  public native void clear_src_device();
  @MemberGetter public static native int kSrcDeviceFieldNumber();
  public static final int kSrcDeviceFieldNumber = kSrcDeviceFieldNumber();
  public native @StdString BytePointer src_device();
  public native void set_src_device(@StdString BytePointer value);
  public native void set_src_device(@StdString String value);
  public native void set_src_device(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_src_device(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_src_device();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_src_device();
  public native void set_allocated_src_device(@StdString @Cast({"char*", "std::string*"}) BytePointer src_device);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_src_device();
  public native void unsafe_arena_set_allocated_src_device(
        @StdString @Cast({"char*", "std::string*"}) BytePointer src_device);

  // string dst_device = 9;
  public native void clear_dst_device();
  @MemberGetter public static native int kDstDeviceFieldNumber();
  public static final int kDstDeviceFieldNumber = kDstDeviceFieldNumber();
  public native @StdString BytePointer dst_device();
  public native void set_dst_device(@StdString BytePointer value);
  public native void set_dst_device(@StdString String value);
  public native void set_dst_device(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_dst_device(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_dst_device();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_dst_device();
  public native void set_allocated_dst_device(@StdString @Cast({"char*", "std::string*"}) BytePointer dst_device);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_dst_device();
  public native void unsafe_arena_set_allocated_dst_device(
        @StdString @Cast({"char*", "std::string*"}) BytePointer dst_device);

  // .tensorflow.DeviceLocality client_locality = 5;
  public native @Cast("bool") boolean has_client_locality();
  public native void clear_client_locality();
  @MemberGetter public static native int kClientLocalityFieldNumber();
  public static final int kClientLocalityFieldNumber = kClientLocalityFieldNumber();
  public native @Const @ByRef DeviceLocality client_locality();
  public native DeviceLocality release_client_locality();
  public native DeviceLocality mutable_client_locality();
  public native void set_allocated_client_locality(DeviceLocality client_locality);
  public native void unsafe_arena_set_allocated_client_locality(
        DeviceLocality client_locality);
  public native DeviceLocality unsafe_arena_release_client_locality();

  // .tensorflow.DeviceLocality server_locality = 6;
  public native @Cast("bool") boolean has_server_locality();
  public native void clear_server_locality();
  @MemberGetter public static native int kServerLocalityFieldNumber();
  public static final int kServerLocalityFieldNumber = kServerLocalityFieldNumber();
  public native @Const @ByRef DeviceLocality server_locality();
  public native DeviceLocality release_server_locality();
  public native DeviceLocality mutable_server_locality();
  public native void set_allocated_server_locality(DeviceLocality server_locality);
  public native void unsafe_arena_set_allocated_server_locality(
        DeviceLocality server_locality);
  public native DeviceLocality unsafe_arena_release_server_locality();

  // .google.protobuf.Any transport_options = 7;
  public native @Cast("bool") boolean has_transport_options();
  public native void clear_transport_options();
  @MemberGetter public static native int kTransportOptionsFieldNumber();
  public static final int kTransportOptionsFieldNumber = kTransportOptionsFieldNumber();
  public native @Cast("const google::protobuf::Any*") @ByRef Pointer transport_options();
  public native @Cast("google::protobuf::Any*") Pointer release_transport_options();
  public native @Cast("google::protobuf::Any*") Pointer mutable_transport_options();
  public native void set_allocated_transport_options(@Cast("google::protobuf::Any*") Pointer transport_options);
  public native void unsafe_arena_set_allocated_transport_options(
        @Cast("google::protobuf::Any*") Pointer transport_options);
  public native @Cast("google::protobuf::Any*") Pointer unsafe_arena_release_transport_options();

  // int64 step_id = 1;
  public native void clear_step_id();
  @MemberGetter public static native int kStepIdFieldNumber();
  public static final int kStepIdFieldNumber = kStepIdFieldNumber();
  public native @Cast("google::protobuf::int64") long step_id();
  public native void set_step_id(@Cast("google::protobuf::int64") long value);

  // int64 num_bytes = 3;
  public native void clear_num_bytes();
  @MemberGetter public static native int kNumBytesFieldNumber();
  public static final int kNumBytesFieldNumber = kNumBytesFieldNumber();
  public native @Cast("google::protobuf::int64") long num_bytes();
  public native void set_num_bytes(@Cast("google::protobuf::int64") long value);

  // fixed64 buf_ptr = 4;
  public native void clear_buf_ptr();
  @MemberGetter public static native int kBufPtrFieldNumber();
  public static final int kBufPtrFieldNumber = kBufPtrFieldNumber();
  public native @Cast("google::protobuf::uint64") long buf_ptr();
  public native void set_buf_ptr(@Cast("google::protobuf::uint64") long value);

  // int64 request_id = 10;
  public native void clear_request_id();
  @MemberGetter public static native int kRequestIdFieldNumber();
  public static final int kRequestIdFieldNumber = kRequestIdFieldNumber();
  public native @Cast("google::protobuf::int64") long request_id();
  public native void set_request_id(@Cast("google::protobuf::int64") long value);

  // uint64 src_incarnation = 11;
  public native void clear_src_incarnation();
  @MemberGetter public static native int kSrcIncarnationFieldNumber();
  public static final int kSrcIncarnationFieldNumber = kSrcIncarnationFieldNumber();
  public native @Cast("google::protobuf::uint64") long src_incarnation();
  public native void set_src_incarnation(@Cast("google::protobuf::uint64") long value);
}

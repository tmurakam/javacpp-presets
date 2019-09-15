// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RecvTensorRequest extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecvTensorRequest(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RecvTensorRequest(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RecvTensorRequest position(long position) {
        return (RecvTensorRequest)super.position(position);
    }

  public RecvTensorRequest() { super((Pointer)null); allocate(); }
  private native void allocate();

  public RecvTensorRequest(@Const @ByRef RecvTensorRequest from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef RecvTensorRequest from);

  public native @ByRef @Name("operator =") RecvTensorRequest put(@Const @ByRef RecvTensorRequest from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef RecvTensorRequest default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const RecvTensorRequest internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(RecvTensorRequest other);
  public native void Swap(RecvTensorRequest other);
  

  // implements Message ----------------------------------------------

  public native RecvTensorRequest New();

  public native RecvTensorRequest New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef RecvTensorRequest from);
  public native void MergeFrom(@Const @ByRef RecvTensorRequest from);
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

  // string rendezvous_key = 2;
  public native void clear_rendezvous_key();
  @MemberGetter public static native int kRendezvousKeyFieldNumber();
  public static final int kRendezvousKeyFieldNumber = kRendezvousKeyFieldNumber();
  public native @StdString BytePointer rendezvous_key();
  public native void set_rendezvous_key(@StdString BytePointer value);
  public native void set_rendezvous_key(@StdString String value);
  public native void set_rendezvous_key(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_rendezvous_key(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_rendezvous_key();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_rendezvous_key();
  public native void set_allocated_rendezvous_key(@StdString @Cast({"char*", "std::string*"}) BytePointer rendezvous_key);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_rendezvous_key();
  public native void unsafe_arena_set_allocated_rendezvous_key(
        @StdString @Cast({"char*", "std::string*"}) BytePointer rendezvous_key);

  // .tensorflow.DeviceLocality client_locality = 4;
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

  // .tensorflow.DeviceLocality server_locality = 5;
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

  // .google.protobuf.Any transport_options = 6;
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

  // int64 request_id = 7;
  public native void clear_request_id();
  @MemberGetter public static native int kRequestIdFieldNumber();
  public static final int kRequestIdFieldNumber = kRequestIdFieldNumber();
  public native @Cast("google::protobuf::int64") long request_id();
  public native void set_request_id(@Cast("google::protobuf::int64") long value);

  // bool dma_ok = 3;
  public native void clear_dma_ok();
  @MemberGetter public static native int kDmaOkFieldNumber();
  public static final int kDmaOkFieldNumber = kDmaOkFieldNumber();
  public native @Cast("bool") boolean dma_ok();
  public native void set_dma_ok(@Cast("bool") boolean value);
}

// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RunGraphRequest extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RunGraphRequest(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RunGraphRequest(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RunGraphRequest position(long position) {
        return (RunGraphRequest)super.position(position);
    }

  public RunGraphRequest() { super((Pointer)null); allocate(); }
  private native void allocate();

  public RunGraphRequest(@Const @ByRef RunGraphRequest from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef RunGraphRequest from);

  public native @ByRef @Name("operator =") RunGraphRequest put(@Const @ByRef RunGraphRequest from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef RunGraphRequest default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const RunGraphRequest internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(RunGraphRequest other);
  public native void Swap(RunGraphRequest other);
  

  // implements Message ----------------------------------------------

  public native RunGraphRequest New();

  public native RunGraphRequest New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef RunGraphRequest from);
  public native void MergeFrom(@Const @ByRef RunGraphRequest from);
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

  // repeated .tensorflow.NamedTensorProto send = 3;
  public native int send_size();
  public native void clear_send();
  @MemberGetter public static native int kSendFieldNumber();
  public static final int kSendFieldNumber = kSendFieldNumber();
  public native NamedTensorProto mutable_send(int index);
  public native @Const @ByRef NamedTensorProto send(int index);
  public native NamedTensorProto add_send();

  // repeated string recv_key = 4;
  public native int recv_key_size();
  public native void clear_recv_key();
  @MemberGetter public static native int kRecvKeyFieldNumber();
  public static final int kRecvKeyFieldNumber = kRecvKeyFieldNumber();
  public native @StdString BytePointer recv_key(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_recv_key(int index);
  public native void set_recv_key(int index, @StdString BytePointer value);
  public native void set_recv_key(int index, @StdString String value);
  public native void set_recv_key(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_recv_key(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_recv_key();
  public native void add_recv_key(@StdString BytePointer value);
  public native void add_recv_key(@StdString String value);
  public native void add_recv_key(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_recv_key(String value, @Cast("size_t") long size);

  // string graph_handle = 1;
  public native void clear_graph_handle();
  @MemberGetter public static native int kGraphHandleFieldNumber();
  public static final int kGraphHandleFieldNumber = kGraphHandleFieldNumber();
  public native @StdString BytePointer graph_handle();
  public native void set_graph_handle(@StdString BytePointer value);
  public native void set_graph_handle(@StdString String value);
  public native void set_graph_handle(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_graph_handle(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_graph_handle();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_graph_handle();
  public native void set_allocated_graph_handle(@StdString @Cast({"char*", "std::string*"}) BytePointer graph_handle);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_graph_handle();
  public native void unsafe_arena_set_allocated_graph_handle(
        @StdString @Cast({"char*", "std::string*"}) BytePointer graph_handle);

  // string session_handle = 8;
  public native void clear_session_handle();
  @MemberGetter public static native int kSessionHandleFieldNumber();
  public static final int kSessionHandleFieldNumber = kSessionHandleFieldNumber();
  public native @StdString BytePointer session_handle();
  public native void set_session_handle(@StdString BytePointer value);
  public native void set_session_handle(@StdString String value);
  public native void set_session_handle(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_session_handle(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_session_handle();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_session_handle();
  public native void set_allocated_session_handle(@StdString @Cast({"char*", "std::string*"}) BytePointer session_handle);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_session_handle();
  public native void unsafe_arena_set_allocated_session_handle(
        @StdString @Cast({"char*", "std::string*"}) BytePointer session_handle);

  // .tensorflow.ExecutorOpts exec_opts = 5;
  public native @Cast("bool") boolean has_exec_opts();
  public native void clear_exec_opts();
  @MemberGetter public static native int kExecOptsFieldNumber();
  public static final int kExecOptsFieldNumber = kExecOptsFieldNumber();
  public native @Const @ByRef ExecutorOpts exec_opts();
  public native ExecutorOpts release_exec_opts();
  public native ExecutorOpts mutable_exec_opts();
  public native void set_allocated_exec_opts(ExecutorOpts exec_opts);
  public native void unsafe_arena_set_allocated_exec_opts(
        ExecutorOpts exec_opts);
  public native ExecutorOpts unsafe_arena_release_exec_opts();

  // int64 step_id = 2;
  public native void clear_step_id();
  @MemberGetter public static native int kStepIdFieldNumber();
  public static final int kStepIdFieldNumber = kStepIdFieldNumber();
  public native @Cast("google::protobuf::int64") long step_id();
  public native void set_step_id(@Cast("google::protobuf::int64") long value);

  // int64 request_id = 11;
  public native void clear_request_id();
  @MemberGetter public static native int kRequestIdFieldNumber();
  public static final int kRequestIdFieldNumber = kRequestIdFieldNumber();
  public native @Cast("google::protobuf::int64") long request_id();
  public native void set_request_id(@Cast("google::protobuf::int64") long value);

  // bool create_worker_session_called = 10;
  public native void clear_create_worker_session_called();
  @MemberGetter public static native int kCreateWorkerSessionCalledFieldNumber();
  public static final int kCreateWorkerSessionCalledFieldNumber = kCreateWorkerSessionCalledFieldNumber();
  public native @Cast("bool") boolean create_worker_session_called();
  public native void set_create_worker_session_called(@Cast("bool") boolean value);

  // bool is_partial = 6;
  public native void clear_is_partial();
  @MemberGetter public static native int kIsPartialFieldNumber();
  public static final int kIsPartialFieldNumber = kIsPartialFieldNumber();
  public native @Cast("bool") boolean is_partial();
  public native void set_is_partial(@Cast("bool") boolean value);

  // bool is_last_partial_run = 7;
  public native void clear_is_last_partial_run();
  @MemberGetter public static native int kIsLastPartialRunFieldNumber();
  public static final int kIsLastPartialRunFieldNumber = kIsLastPartialRunFieldNumber();
  public native @Cast("bool") boolean is_last_partial_run();
  public native void set_is_last_partial_run(@Cast("bool") boolean value);

  // bool store_errors_in_response_body = 9;
  public native void clear_store_errors_in_response_body();
  @MemberGetter public static native int kStoreErrorsInResponseBodyFieldNumber();
  public static final int kStoreErrorsInResponseBodyFieldNumber = kStoreErrorsInResponseBodyFieldNumber();
  public native @Cast("bool") boolean store_errors_in_response_body();
  public native void set_store_errors_in_response_body(@Cast("bool") boolean value);
}

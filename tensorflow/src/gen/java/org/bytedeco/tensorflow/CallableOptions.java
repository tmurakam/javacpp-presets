// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CallableOptions extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CallableOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CallableOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CallableOptions position(long position) {
        return (CallableOptions)super.position(position);
    }

  public CallableOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  public CallableOptions(@Const @ByRef CallableOptions from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef CallableOptions from);

  public native @ByRef @Name("operator =") CallableOptions put(@Const @ByRef CallableOptions from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef CallableOptions default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const CallableOptions internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(CallableOptions other);
  public native void Swap(CallableOptions other);
  

  // implements Message ----------------------------------------------

  public native CallableOptions New();

  public native CallableOptions New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef CallableOptions from);
  public native void MergeFrom(@Const @ByRef CallableOptions from);
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

  // repeated string feed = 1;
  public native int feed_size();
  public native void clear_feed();
  @MemberGetter public static native int kFeedFieldNumber();
  public static final int kFeedFieldNumber = kFeedFieldNumber();
  public native @StdString BytePointer feed(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_feed(int index);
  public native void set_feed(int index, @StdString BytePointer value);
  public native void set_feed(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_feed(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_feed(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_feed();
  public native void add_feed(@StdString BytePointer value);
  public native void add_feed(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_feed(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_feed(String value, @Cast("size_t") long size);

  // repeated string fetch = 2;
  public native int fetch_size();
  public native void clear_fetch();
  @MemberGetter public static native int kFetchFieldNumber();
  public static final int kFetchFieldNumber = kFetchFieldNumber();
  public native @StdString BytePointer fetch(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_fetch(int index);
  public native void set_fetch(int index, @StdString BytePointer value);
  public native void set_fetch(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_fetch(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_fetch(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_fetch();
  public native void add_fetch(@StdString BytePointer value);
  public native void add_fetch(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_fetch(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_fetch(String value, @Cast("size_t") long size);

  // repeated string target = 3;
  public native int target_size();
  public native void clear_target();
  @MemberGetter public static native int kTargetFieldNumber();
  public static final int kTargetFieldNumber = kTargetFieldNumber();
  public native @StdString BytePointer target(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_target(int index);
  public native void set_target(int index, @StdString BytePointer value);
  public native void set_target(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_target(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_target(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_target();
  public native void add_target(@StdString BytePointer value);
  public native void add_target(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_target(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_target(String value, @Cast("size_t") long size);

  // repeated .tensorflow.TensorConnection tensor_connection = 5;
  public native int tensor_connection_size();
  public native void clear_tensor_connection();
  @MemberGetter public static native int kTensorConnectionFieldNumber();
  public static final int kTensorConnectionFieldNumber = kTensorConnectionFieldNumber();
  public native TensorConnection mutable_tensor_connection(int index);
  public native @Const @ByRef TensorConnection tensor_connection(int index);
  public native TensorConnection add_tensor_connection();

  // map<string, string> feed_devices = 6;
  public native int feed_devices_size();
  public native void clear_feed_devices();
  @MemberGetter public static native int kFeedDevicesFieldNumber();
  public static final int kFeedDevicesFieldNumber = kFeedDevicesFieldNumber();
  public native @Const @ByRef StringStringMap feed_devices();
  public native StringStringMap mutable_feed_devices();

  // map<string, string> fetch_devices = 7;
  public native int fetch_devices_size();
  public native void clear_fetch_devices();
  @MemberGetter public static native int kFetchDevicesFieldNumber();
  public static final int kFetchDevicesFieldNumber = kFetchDevicesFieldNumber();
  public native @Const @ByRef StringStringMap fetch_devices();
  public native StringStringMap mutable_fetch_devices();

  // .tensorflow.RunOptions run_options = 4;
  public native @Cast("bool") boolean has_run_options();
  public native void clear_run_options();
  @MemberGetter public static native int kRunOptionsFieldNumber();
  public static final int kRunOptionsFieldNumber = kRunOptionsFieldNumber();
  public native @Const @ByRef RunOptions run_options();
  public native RunOptions release_run_options();
  public native RunOptions mutable_run_options();
  public native void set_allocated_run_options(RunOptions run_options);
  public native void unsafe_arena_set_allocated_run_options(
        RunOptions run_options);
  public native RunOptions unsafe_arena_release_run_options();

  // bool fetch_skip_sync = 8;
  public native void clear_fetch_skip_sync();
  @MemberGetter public static native int kFetchSkipSyncFieldNumber();
  public static final int kFetchSkipSyncFieldNumber = kFetchSkipSyncFieldNumber();
  public native @Cast("bool") boolean fetch_skip_sync();
  public native void set_fetch_skip_sync(@Cast("bool") boolean value);
}

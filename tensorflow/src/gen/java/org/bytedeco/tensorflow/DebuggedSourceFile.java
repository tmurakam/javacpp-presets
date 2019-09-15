// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DebuggedSourceFile extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DebuggedSourceFile(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DebuggedSourceFile(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DebuggedSourceFile position(long position) {
        return (DebuggedSourceFile)super.position(position);
    }

  public DebuggedSourceFile() { super((Pointer)null); allocate(); }
  private native void allocate();

  public DebuggedSourceFile(@Const @ByRef DebuggedSourceFile from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef DebuggedSourceFile from);

  public native @ByRef @Name("operator =") DebuggedSourceFile put(@Const @ByRef DebuggedSourceFile from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef DebuggedSourceFile default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const DebuggedSourceFile internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(DebuggedSourceFile other);
  public native void Swap(DebuggedSourceFile other);
  

  // implements Message ----------------------------------------------

  public native DebuggedSourceFile New();

  public native DebuggedSourceFile New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef DebuggedSourceFile from);
  public native void MergeFrom(@Const @ByRef DebuggedSourceFile from);
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

  // repeated string lines = 5;
  public native int lines_size();
  public native void clear_lines();
  @MemberGetter public static native int kLinesFieldNumber();
  public static final int kLinesFieldNumber = kLinesFieldNumber();
  public native @StdString BytePointer lines(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_lines(int index);
  public native void set_lines(int index, @StdString BytePointer value);
  public native void set_lines(int index, @StdString String value);
  public native void set_lines(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_lines(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_lines();
  public native void add_lines(@StdString BytePointer value);
  public native void add_lines(@StdString String value);
  public native void add_lines(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_lines(String value, @Cast("size_t") long size);

  // string host = 1;
  public native void clear_host();
  @MemberGetter public static native int kHostFieldNumber();
  public static final int kHostFieldNumber = kHostFieldNumber();
  public native @StdString BytePointer host();
  public native void set_host(@StdString BytePointer value);
  public native void set_host(@StdString String value);
  public native void set_host(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_host(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_host();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_host();
  public native void set_allocated_host(@StdString @Cast({"char*", "std::string*"}) BytePointer host);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_host();
  public native void unsafe_arena_set_allocated_host(
        @StdString @Cast({"char*", "std::string*"}) BytePointer host);

  // string file_path = 2;
  public native void clear_file_path();
  @MemberGetter public static native int kFilePathFieldNumber();
  public static final int kFilePathFieldNumber = kFilePathFieldNumber();
  public native @StdString BytePointer file_path();
  public native void set_file_path(@StdString BytePointer value);
  public native void set_file_path(@StdString String value);
  public native void set_file_path(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_file_path(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_file_path();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_file_path();
  public native void set_allocated_file_path(@StdString @Cast({"char*", "std::string*"}) BytePointer file_path);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_file_path();
  public native void unsafe_arena_set_allocated_file_path(
        @StdString @Cast({"char*", "std::string*"}) BytePointer file_path);

  // int64 last_modified = 3;
  public native void clear_last_modified();
  @MemberGetter public static native int kLastModifiedFieldNumber();
  public static final int kLastModifiedFieldNumber = kLastModifiedFieldNumber();
  public native @Cast("google::protobuf::int64") long last_modified();
  public native void set_last_modified(@Cast("google::protobuf::int64") long value);

  // int64 bytes = 4;
  public native void clear_bytes();
  @MemberGetter public static native int kBytesFieldNumber();
  public static final int kBytesFieldNumber = kBytesFieldNumber();
  public native @Cast("google::protobuf::int64") long bytes();
  public native void set_bytes(@Cast("google::protobuf::int64") long value);
}

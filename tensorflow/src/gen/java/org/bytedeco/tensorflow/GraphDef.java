// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class GraphDef extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GraphDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GraphDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public GraphDef position(long position) {
        return (GraphDef)super.position(position);
    }

  public GraphDef() { super((Pointer)null); allocate(); }
  private native void allocate();

  public GraphDef(@Const @ByRef GraphDef from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef GraphDef from);

  public native @ByRef @Name("operator =") GraphDef put(@Const @ByRef GraphDef from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef GraphDef default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const GraphDef internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(GraphDef other);
  public native void Swap(GraphDef other);
  

  // implements Message ----------------------------------------------

  public native GraphDef New();

  public native GraphDef New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef GraphDef from);
  public native void MergeFrom(@Const @ByRef GraphDef from);
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

  // repeated .tensorflow.NodeDef node = 1;
  public native int node_size();
  public native void clear_node();
  @MemberGetter public static native int kNodeFieldNumber();
  public static final int kNodeFieldNumber = kNodeFieldNumber();
  public native NodeDef mutable_node(int index);
  public native @Const @ByRef NodeDef node(int index);
  public native NodeDef add_node();

  // .tensorflow.FunctionDefLibrary library = 2;
  public native @Cast("bool") boolean has_library();
  public native void clear_library();
  @MemberGetter public static native int kLibraryFieldNumber();
  public static final int kLibraryFieldNumber = kLibraryFieldNumber();
  public native @Const @ByRef FunctionDefLibrary library();
  public native FunctionDefLibrary release_library();
  public native FunctionDefLibrary mutable_library();
  public native void set_allocated_library(FunctionDefLibrary library);
  public native void unsafe_arena_set_allocated_library(
        FunctionDefLibrary library);
  public native FunctionDefLibrary unsafe_arena_release_library();

  // .tensorflow.VersionDef versions = 4;
  public native @Cast("bool") boolean has_versions();
  public native void clear_versions();
  @MemberGetter public static native int kVersionsFieldNumber();
  public static final int kVersionsFieldNumber = kVersionsFieldNumber();
  public native @Const @ByRef VersionDef versions();
  public native VersionDef release_versions();
  public native VersionDef mutable_versions();
  public native void set_allocated_versions(VersionDef versions);
  public native void unsafe_arena_set_allocated_versions(
        VersionDef versions);
  public native VersionDef unsafe_arena_release_versions();

  // int32 version = 3 [deprecated = true];
  public native @Deprecated void clear_version();
  @MemberGetter public static native @Deprecated int kVersionFieldNumber();
  public static final int kVersionFieldNumber = kVersionFieldNumber();
  public native @Cast("google::protobuf::int32") @Deprecated int version();
  public native @Deprecated void set_version(@Cast("google::protobuf::int32") int value);
}

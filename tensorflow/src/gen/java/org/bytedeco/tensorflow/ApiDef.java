// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ApiDef extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ApiDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ApiDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ApiDef position(long position) {
        return (ApiDef)super.position(position);
    }

  public ApiDef() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ApiDef(@Const @ByRef ApiDef from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ApiDef from);

  public native @ByRef @Name("operator =") ApiDef put(@Const @ByRef ApiDef from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef ApiDef default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ApiDef internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(ApiDef other);
  public native void Swap(ApiDef other);
  

  // implements Message ----------------------------------------------

  public native ApiDef New();

  public native ApiDef New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef ApiDef from);
  public native void MergeFrom(@Const @ByRef ApiDef from);
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
  @MemberGetter public static native @Cast("const tensorflow::ApiDef::Visibility") int DEFAULT_VISIBILITY();
  public static final int DEFAULT_VISIBILITY = DEFAULT_VISIBILITY();
  @MemberGetter public static native @Cast("const tensorflow::ApiDef::Visibility") int VISIBLE();
  public static final int VISIBLE = VISIBLE();
  @MemberGetter public static native @Cast("const tensorflow::ApiDef::Visibility") int SKIP();
  public static final int SKIP = SKIP();
  @MemberGetter public static native @Cast("const tensorflow::ApiDef::Visibility") int HIDDEN();
  public static final int HIDDEN = HIDDEN();
  public static native @Cast("bool") boolean Visibility_IsValid(int value);
  @MemberGetter public static native @Cast("const tensorflow::ApiDef::Visibility") int Visibility_MIN();
  public static final int Visibility_MIN = Visibility_MIN();
  @MemberGetter public static native @Cast("const tensorflow::ApiDef::Visibility") int Visibility_MAX();
  public static final int Visibility_MAX = Visibility_MAX();
  @MemberGetter public static native int Visibility_ARRAYSIZE();
  public static final int Visibility_ARRAYSIZE = Visibility_ARRAYSIZE();
  public static native @Cast("const google::protobuf::EnumDescriptor*") Pointer Visibility_descriptor();
  public static native @Cast("bool") boolean Visibility_Parse(@StdString BytePointer name,
        @Cast("tensorflow::ApiDef::Visibility*") IntPointer value);
  public static native @Cast("bool") boolean Visibility_Parse(@StdString String name,
        @Cast("tensorflow::ApiDef::Visibility*") IntBuffer value);
  public static native @Cast("bool") boolean Visibility_Parse(@StdString BytePointer name,
        @Cast("tensorflow::ApiDef::Visibility*") int... value);
  public static native @Cast("bool") boolean Visibility_Parse(@StdString String name,
        @Cast("tensorflow::ApiDef::Visibility*") IntPointer value);
  public static native @Cast("bool") boolean Visibility_Parse(@StdString BytePointer name,
        @Cast("tensorflow::ApiDef::Visibility*") IntBuffer value);
  public static native @Cast("bool") boolean Visibility_Parse(@StdString String name,
        @Cast("tensorflow::ApiDef::Visibility*") int... value);

  // accessors -------------------------------------------------------

  // repeated .tensorflow.ApiDef.Endpoint endpoint = 3;
  public native int endpoint_size();
  public native void clear_endpoint();
  @MemberGetter public static native int kEndpointFieldNumber();
  public static final int kEndpointFieldNumber = kEndpointFieldNumber();
  public native ApiDef_Endpoint mutable_endpoint(int index);
  public native @Const @ByRef ApiDef_Endpoint endpoint(int index);
  public native ApiDef_Endpoint add_endpoint();

  // repeated .tensorflow.ApiDef.Arg in_arg = 4;
  public native int in_arg_size();
  public native void clear_in_arg();
  @MemberGetter public static native int kInArgFieldNumber();
  public static final int kInArgFieldNumber = kInArgFieldNumber();
  public native ApiDef_Arg mutable_in_arg(int index);
  public native @Const @ByRef ApiDef_Arg in_arg(int index);
  public native ApiDef_Arg add_in_arg();

  // repeated .tensorflow.ApiDef.Arg out_arg = 5;
  public native int out_arg_size();
  public native void clear_out_arg();
  @MemberGetter public static native int kOutArgFieldNumber();
  public static final int kOutArgFieldNumber = kOutArgFieldNumber();
  public native ApiDef_Arg mutable_out_arg(int index);
  public native @Const @ByRef ApiDef_Arg out_arg(int index);
  public native ApiDef_Arg add_out_arg();

  // repeated .tensorflow.ApiDef.Attr attr = 6;
  public native int attr_size();
  public native void clear_attr();
  @MemberGetter public static native int kAttrFieldNumber();
  public static final int kAttrFieldNumber = kAttrFieldNumber();
  public native ApiDef_Attr mutable_attr(int index);
  public native @Const @ByRef ApiDef_Attr attr(int index);
  public native ApiDef_Attr add_attr();

  // repeated string arg_order = 11;
  public native int arg_order_size();
  public native void clear_arg_order();
  @MemberGetter public static native int kArgOrderFieldNumber();
  public static final int kArgOrderFieldNumber = kArgOrderFieldNumber();
  public native @StdString BytePointer arg_order(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_arg_order(int index);
  public native void set_arg_order(int index, @StdString BytePointer value);
  public native void set_arg_order(int index, @StdString String value);
  public native void set_arg_order(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_arg_order(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_arg_order();
  public native void add_arg_order(@StdString BytePointer value);
  public native void add_arg_order(@StdString String value);
  public native void add_arg_order(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_arg_order(String value, @Cast("size_t") long size);

  // string graph_op_name = 1;
  public native void clear_graph_op_name();
  @MemberGetter public static native int kGraphOpNameFieldNumber();
  public static final int kGraphOpNameFieldNumber = kGraphOpNameFieldNumber();
  public native @StdString BytePointer graph_op_name();
  public native void set_graph_op_name(@StdString BytePointer value);
  public native void set_graph_op_name(@StdString String value);
  public native void set_graph_op_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_graph_op_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_graph_op_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_graph_op_name();
  public native void set_allocated_graph_op_name(@StdString @Cast({"char*", "std::string*"}) BytePointer graph_op_name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_graph_op_name();
  public native void unsafe_arena_set_allocated_graph_op_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer graph_op_name);

  // string summary = 7;
  public native void clear_summary();
  @MemberGetter public static native int kSummaryFieldNumber();
  public static final int kSummaryFieldNumber = kSummaryFieldNumber();
  public native @StdString BytePointer summary();
  public native void set_summary(@StdString BytePointer value);
  public native void set_summary(@StdString String value);
  public native void set_summary(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_summary(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_summary();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_summary();
  public native void set_allocated_summary(@StdString @Cast({"char*", "std::string*"}) BytePointer summary);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_summary();
  public native void unsafe_arena_set_allocated_summary(
        @StdString @Cast({"char*", "std::string*"}) BytePointer summary);

  // string description = 8;
  public native void clear_description();
  @MemberGetter public static native int kDescriptionFieldNumber();
  public static final int kDescriptionFieldNumber = kDescriptionFieldNumber();
  public native @StdString BytePointer description();
  public native void set_description(@StdString BytePointer value);
  public native void set_description(@StdString String value);
  public native void set_description(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_description(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_description();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_description();
  public native void set_allocated_description(@StdString @Cast({"char*", "std::string*"}) BytePointer description);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_description();
  public native void unsafe_arena_set_allocated_description(
        @StdString @Cast({"char*", "std::string*"}) BytePointer description);

  // string description_prefix = 9;
  public native void clear_description_prefix();
  @MemberGetter public static native int kDescriptionPrefixFieldNumber();
  public static final int kDescriptionPrefixFieldNumber = kDescriptionPrefixFieldNumber();
  public native @StdString BytePointer description_prefix();
  public native void set_description_prefix(@StdString BytePointer value);
  public native void set_description_prefix(@StdString String value);
  public native void set_description_prefix(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_description_prefix(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_description_prefix();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_description_prefix();
  public native void set_allocated_description_prefix(@StdString @Cast({"char*", "std::string*"}) BytePointer description_prefix);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_description_prefix();
  public native void unsafe_arena_set_allocated_description_prefix(
        @StdString @Cast({"char*", "std::string*"}) BytePointer description_prefix);

  // string description_suffix = 10;
  public native void clear_description_suffix();
  @MemberGetter public static native int kDescriptionSuffixFieldNumber();
  public static final int kDescriptionSuffixFieldNumber = kDescriptionSuffixFieldNumber();
  public native @StdString BytePointer description_suffix();
  public native void set_description_suffix(@StdString BytePointer value);
  public native void set_description_suffix(@StdString String value);
  public native void set_description_suffix(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_description_suffix(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_description_suffix();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_description_suffix();
  public native void set_allocated_description_suffix(@StdString @Cast({"char*", "std::string*"}) BytePointer description_suffix);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_description_suffix();
  public native void unsafe_arena_set_allocated_description_suffix(
        @StdString @Cast({"char*", "std::string*"}) BytePointer description_suffix);

  // string deprecation_message = 12;
  public native void clear_deprecation_message();
  @MemberGetter public static native int kDeprecationMessageFieldNumber();
  public static final int kDeprecationMessageFieldNumber = kDeprecationMessageFieldNumber();
  public native @StdString BytePointer deprecation_message();
  public native void set_deprecation_message(@StdString BytePointer value);
  public native void set_deprecation_message(@StdString String value);
  public native void set_deprecation_message(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_deprecation_message(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_deprecation_message();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_deprecation_message();
  public native void set_allocated_deprecation_message(@StdString @Cast({"char*", "std::string*"}) BytePointer deprecation_message);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_deprecation_message();
  public native void unsafe_arena_set_allocated_deprecation_message(
        @StdString @Cast({"char*", "std::string*"}) BytePointer deprecation_message);

  // .tensorflow.ApiDef.Visibility visibility = 2;
  public native void clear_visibility();
  @MemberGetter public static native int kVisibilityFieldNumber();
  public static final int kVisibilityFieldNumber = kVisibilityFieldNumber();
  public native @Cast("tensorflow::ApiDef_Visibility") int visibility();
  public native void set_visibility(@Cast("tensorflow::ApiDef_Visibility") int value);

  // int32 deprecation_version = 13;
  public native void clear_deprecation_version();
  @MemberGetter public static native int kDeprecationVersionFieldNumber();
  public static final int kDeprecationVersionFieldNumber = kDeprecationVersionFieldNumber();
  public native @Cast("google::protobuf::int32") int deprecation_version();
  public native void set_deprecation_version(@Cast("google::protobuf::int32") int value);
}

// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SavedObject extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SavedObject(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SavedObject(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SavedObject position(long position) {
        return (SavedObject)super.position(position);
    }

  public SavedObject() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SavedObject(@Const @ByRef SavedObject from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef SavedObject from);

  public native @ByRef @Name("operator =") SavedObject put(@Const @ByRef SavedObject from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef SavedObject default_instance();

  /** enum tensorflow::SavedObject::KindCase */
  public static final int
    kUserObject = 4,
    kAsset = 5,
    kFunction = 6,
    kVariable = 7,
    kBareConcreteFunction = 8,
    kConstant = 9,
    kResource = 10,
    KIND_NOT_SET = 0;

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const SavedObject internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(SavedObject other);
  public native void Swap(SavedObject other);
  

  // implements Message ----------------------------------------------

  public native SavedObject New();

  public native SavedObject New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef SavedObject from);
  public native void MergeFrom(@Const @ByRef SavedObject from);
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

  // repeated .tensorflow.TrackableObjectGraph.TrackableObject.ObjectReference children = 1;
  public native int children_size();
  public native void clear_children();
  @MemberGetter public static native int kChildrenFieldNumber();
  public static final int kChildrenFieldNumber = kChildrenFieldNumber();
  public native TrackableObjectGraph_TrackableObject_ObjectReference mutable_children(int index);
  public native @Const @ByRef TrackableObjectGraph_TrackableObject_ObjectReference children(int index);
  public native TrackableObjectGraph_TrackableObject_ObjectReference add_children();

  // repeated .tensorflow.TrackableObjectGraph.TrackableObject.SlotVariableReference slot_variables = 3;
  public native int slot_variables_size();
  public native void clear_slot_variables();
  @MemberGetter public static native int kSlotVariablesFieldNumber();
  public static final int kSlotVariablesFieldNumber = kSlotVariablesFieldNumber();
  public native TrackableObjectGraph_TrackableObject_SlotVariableReference mutable_slot_variables(int index);
  public native @Const @ByRef TrackableObjectGraph_TrackableObject_SlotVariableReference slot_variables(int index);
  public native TrackableObjectGraph_TrackableObject_SlotVariableReference add_slot_variables();

  // .tensorflow.SavedUserObject user_object = 4;
  public native @Cast("bool") boolean has_user_object();
  public native void clear_user_object();
  @MemberGetter public static native int kUserObjectFieldNumber();
  public static final int kUserObjectFieldNumber = kUserObjectFieldNumber();
  public native @Const @ByRef SavedUserObject user_object();
  public native SavedUserObject release_user_object();
  public native SavedUserObject mutable_user_object();
  public native void set_allocated_user_object(SavedUserObject user_object);
  public native void unsafe_arena_set_allocated_user_object(
        SavedUserObject user_object);
  public native SavedUserObject unsafe_arena_release_user_object();

  // .tensorflow.SavedAsset asset = 5;
  public native @Cast("bool") boolean has_asset();
  public native void clear_asset();
  @MemberGetter public static native int kAssetFieldNumber();
  public static final int kAssetFieldNumber = kAssetFieldNumber();
  public native @Const @ByRef SavedAsset asset();
  public native SavedAsset release_asset();
  public native SavedAsset mutable_asset();
  public native void set_allocated_asset(SavedAsset asset);
  public native void unsafe_arena_set_allocated_asset(
        SavedAsset asset);
  public native SavedAsset unsafe_arena_release_asset();

  // .tensorflow.SavedFunction function = 6;
  public native @Cast("bool") boolean has_function();
  public native void clear_function();
  @MemberGetter public static native int kFunctionFieldNumber();
  public static final int kFunctionFieldNumber = kFunctionFieldNumber();
  public native @Const @ByRef SavedFunction function();
  public native SavedFunction release_function();
  public native SavedFunction mutable_function();
  public native void set_allocated_function(SavedFunction function);
  public native void unsafe_arena_set_allocated_function(
        SavedFunction function);
  public native SavedFunction unsafe_arena_release_function();

  // .tensorflow.SavedVariable variable = 7;
  public native @Cast("bool") boolean has_variable();
  public native void clear_variable();
  @MemberGetter public static native int kVariableFieldNumber();
  public static final int kVariableFieldNumber = kVariableFieldNumber();
  public native @Const @ByRef SavedVariable variable();
  public native SavedVariable release_variable();
  public native SavedVariable mutable_variable();
  public native void set_allocated_variable(SavedVariable variable);
  public native void unsafe_arena_set_allocated_variable(
        SavedVariable variable);
  public native SavedVariable unsafe_arena_release_variable();

  // .tensorflow.SavedBareConcreteFunction bare_concrete_function = 8;
  public native @Cast("bool") boolean has_bare_concrete_function();
  public native void clear_bare_concrete_function();
  @MemberGetter public static native int kBareConcreteFunctionFieldNumber();
  public static final int kBareConcreteFunctionFieldNumber = kBareConcreteFunctionFieldNumber();
  public native @Const @ByRef SavedBareConcreteFunction bare_concrete_function();
  public native SavedBareConcreteFunction release_bare_concrete_function();
  public native SavedBareConcreteFunction mutable_bare_concrete_function();
  public native void set_allocated_bare_concrete_function(SavedBareConcreteFunction bare_concrete_function);
  public native void unsafe_arena_set_allocated_bare_concrete_function(
        SavedBareConcreteFunction bare_concrete_function);
  public native SavedBareConcreteFunction unsafe_arena_release_bare_concrete_function();

  // .tensorflow.SavedConstant constant = 9;
  public native @Cast("bool") boolean has_constant();
  public native void clear_constant();
  @MemberGetter public static native int kConstantFieldNumber();
  public static final int kConstantFieldNumber = kConstantFieldNumber();
  public native @Const @ByRef SavedConstant constant();
  public native SavedConstant release_constant();
  public native SavedConstant mutable_constant();
  public native void set_allocated_constant(SavedConstant constant);
  public native void unsafe_arena_set_allocated_constant(
        SavedConstant constant);
  public native SavedConstant unsafe_arena_release_constant();

  // .tensorflow.SavedResource resource = 10;
  public native @Cast("bool") boolean has_resource();
  public native void clear_resource();
  @MemberGetter public static native int kResourceFieldNumber();
  public static final int kResourceFieldNumber = kResourceFieldNumber();
  public native @Const @ByRef SavedResource resource();
  public native SavedResource release_resource();
  public native SavedResource mutable_resource();
  public native void set_allocated_resource(SavedResource resource);
  public native void unsafe_arena_set_allocated_resource(
        SavedResource resource);
  public native SavedResource unsafe_arena_release_resource();

  public native void clear_kind();
  public native @Cast("tensorflow::SavedObject::KindCase") int kind_case();
}

// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Helper to maintain a map between function names in a given
// FunctionDefLibrary and function definitions.
//
// This class is thread-safe.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FunctionLibraryDefinition extends OpRegistryInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionLibraryDefinition(Pointer p) { super(p); }

  // Ops created for function arguments bear the name given by `kArgOp`; those
  // created for return values bear the name given by `kRetOp`.
  @MemberGetter public static native @Cast("const char*") BytePointer kArgOp();
  @MemberGetter public static native @Cast("const char*") BytePointer kDeviceArgOp();
  @MemberGetter public static native @Cast("const char*") BytePointer kRetOp();
  @MemberGetter public static native @Cast("const char*") BytePointer kDeviceRetOp();
  @MemberGetter public static native @Cast("const char*") BytePointer kIntsOnDeviceAttr();

  @MemberGetter public static native @Cast("const char*") BytePointer kGradientOp();
  @MemberGetter public static native @Cast("const char*") BytePointer kFuncAttr();

  // Note: This constructor grabs `lib_def`'s lock in shared mode.
  public FunctionLibraryDefinition(@Const @ByRef FunctionLibraryDefinition lib_def) { super((Pointer)null); allocate(lib_def); }
  private native void allocate(@Const @ByRef FunctionLibraryDefinition lib_def);
  public FunctionLibraryDefinition(@Const OpRegistryInterface default_registry,
                              @Const @ByRef FunctionDefLibrary lib_def) { super((Pointer)null); allocate(default_registry, lib_def); }
  private native void allocate(@Const OpRegistryInterface default_registry,
                              @Const @ByRef FunctionDefLibrary lib_def);

  

  // Returns True if the library contains `func`, False otherwise.
  public native @Cast("bool") boolean Contains(@StdString BytePointer func);
  public native @Cast("bool") boolean Contains(@StdString String func);

  // Returns nullptr if "func" is not defined in "lib_def". Otherwise,
  // returns its definition proto.
  //
  // NB: This function returns a borrowed pointer, which can be invalidated by a
  // subsequent call to `ReplaceFunction()` with the given name.
  public native @Const FunctionDef Find(@StdString BytePointer func);
  public native @Const FunctionDef Find(@StdString String func);

  // Adds function definition 'fdef' to this function library.
  // Returns status 'ok' on success, or error otherwise. This is a no-op if
  // 'fdef' already exists in this function library.
  // If 'fdef' is successfully added to the library, it will be accessible
  // from 'LookUp' and included in the proto returned by 'ToProto'.
  // This operation is atomic.
  public native @ByVal Status AddFunctionDef(@Const @ByRef FunctionDef fdef);

  // Adds gradient definition 'grad' to this function library.
  // This is a no-op if 'grad' already exists in this function library.
  // If 'grad' is successfully added, it will be accessible via 'FindGradient'
  // and included in the proto returned by 'ToProto'.
  // This operation is atomic.
  public native @ByVal Status AddGradientDef(@Const @ByRef GradientDef grad);

  // Replaces the function corresponding to `func` with `fdef`. Returns
  // a non-OK status if "func" was not found in the library, OK otherwise.
  // Please be careful when replacing function: make sure all previous pointers
  // returned by `Find()` are no longer in use.
  public native @ByVal Status ReplaceFunction(@StdString BytePointer func, @Const @ByRef FunctionDef fdef);
  public native @ByVal Status ReplaceFunction(@StdString String func, @Const @ByRef FunctionDef fdef);

  // Replaces the gradient corresponding to `grad.function_name()`. Returns
  // a non-OK status if "grad.function_name()" was not found in the library, OK
  // otherwise.
  public native @ByVal Status ReplaceGradient(@Const @ByRef GradientDef grad);

  // Removes the function corresponding to 'func'. Returns a non-OK status if
  // 'func' was not found in the library, OK otherwise.
  // Please be careful when removing function: make sure there are no other
  // nodes using the function, and all previous pointers returned by `Find()`
  // are no longer in use.
  public native @ByVal Status RemoveFunction(@StdString BytePointer func);
  public native @ByVal Status RemoveFunction(@StdString String func);

  // Adds the functions and gradients in 'other' to this function library.
  // Duplicate functions and gradients are ignored.
  // This operation is atomic.
  public native @ByVal Status AddLibrary(@Const @ByRef FunctionLibraryDefinition other);

  // Adds the functions and gradients in 'lib_def' to this function library.
  // Duplicate functions and gradients are ignored.
  // This operation is atomic.
  public native @ByVal Status AddLibrary(@Const @ByRef FunctionDefLibrary lib_def);

  // If the gradient function for 'func' is specified explicitly in
  // the library, returns the gradient function name.  Otherwise,
  // returns an empty string.
  public native @StdString BytePointer FindGradient(@StdString BytePointer func);
  public native @StdString String FindGradient(@StdString String func);

  // OpRegistryInterface method. Useful for constructing a Graph.
  //
  // If "op" is defined in the library, returns its signature.
  // Otherwise, assume "op" is a primitive op and returns its op
  // signature and shape inference function.
  //
  // NB: This function outputs a borrowed pointer, which can be invalidated by a
  // subsequent call to `ReplaceFunction()` with the given name.
  public native @ByVal Status LookUp(@StdString BytePointer op_type_name,
                  @Cast("const tensorflow::OpRegistrationData**") PointerPointer op_reg_data);
  public native @ByVal Status LookUp(@StdString BytePointer op_type_name,
                  @Const @ByPtrPtr OpRegistrationData op_reg_data);
  public native @ByVal Status LookUp(@StdString String op_type_name,
                  @Const @ByPtrPtr OpRegistrationData op_reg_data);

  // Generates new function name with the specified prefix that is unique
  // across this library.
  public native @StdString BytePointer UniqueFunctionName(@StringPiece BytePointer prefix);
  public native @StdString String UniqueFunctionName(@StringPiece String prefix);

  // Given a node def 'ndef', inspects attributes of the callee
  // function to derive the attribute 'value' for 'attr'. Returns OK
  // iff the attribute is given by the function's definition.
  // TODO(irving): Remove; keep only the const Node& version.

  // Given a node, inspects attributes of the callee function to derive the
  // attribute 'value' for 'attr'. Returns OK iff the attribute is given by the
  // function's definition.

  // Returns a proto representation of the state of this function library.
  public native @ByVal FunctionDefLibrary ToProto();

  public native @Cast("size_t") long num_functions();

  // Returns all the function names in the FunctionLibraryDefinition.
  public native @ByVal StringVector ListFunctionNames();

  public native @Const OpRegistryInterface default_registry();

  // Returns a copy of `*this` with only the subset of functions that are
  // reachable from the nodes of `graph` or `func`.
  public native @ByVal FunctionLibraryDefinition ReachableDefinitions(@Const @ByRef GraphDef graph);
  public native @ByVal FunctionLibraryDefinition ReachableDefinitions(@Const @ByRef FunctionDef func);

  // Copies the function named `func` from `other` to this
  // FunctionLibraryDefinition.
  // REQUIRES: `this->default_registry() == other.default_registry()`.
  // Returns OK on success, or error otherwise. This is a no-op if a function
  // name `func` already exists in this function library, and has the same
  // implementation as in `other`. If the implementations conflict, an invalid
  // argument error is returned.
  public native @ByVal Status CopyFunctionDefFrom(@StdString BytePointer func,
                               @Const @ByRef FunctionLibraryDefinition other);
  public native @ByVal Status CopyFunctionDefFrom(@StdString String func,
                               @Const @ByRef FunctionLibraryDefinition other);
}

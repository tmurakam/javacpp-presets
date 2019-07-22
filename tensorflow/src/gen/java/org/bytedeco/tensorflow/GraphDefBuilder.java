// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Given a function like:
//   namespace ops {
//   Node* Identity(NodeOut input, const GraphDefBuilder::Options& opts) {
//     if (opts.HaveError()) return nullptr;
//     static const string kOpName = "Identity";
//     NodeBuilder node_builder(opts.GetNameForOp(kOpName), kOpName,
//                              opts.op_registry());
//     node_builder.Input(input);
//     return opts.FinalizeBuilder(&node_builder);
//   }
//   }  // namespace ops
//
//   // Or, alternatively:
//   namespace ops {
//   Node* Identity(NodeOut input, const GraphDefBuilder::Options& opts) {
//     static const string kOpName = "Identity";
//     return UnaryOp(kOpName, input, opts);
//   }
//   }  // namespace ops
//
// You call it like:
//   GraphDefBuilder b;
//   using namespace ::tensorflow::ops;  // NOLINT(build/namespaces)
//   Node* na = Const(7, b.opts());
//   // Note: WithName() returns a copy, opts is unchanged.
//   Node* nb = Const(5, b.opts().WithName("control-input"));
//   Node* nc = Identity(na, b.opts().WithControlInput(nb));
//   GraphDef graph_def;
//   Status status = b.ToGraphDef(&graph_def);
//   if (!status.ok()) { /* Handle error */ }
//
// In tests you can skip the status handling via:
//   GraphDefBuilder b(GraphDefBuilder::kFailImmediately);
//   ...
//   b.ToGraphDef(&graph_def);

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class GraphDefBuilder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GraphDefBuilder(Pointer p) { super(p); }

  // Options for adding a Node to a Graph.
  @NoOffset public static class Options extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Options(Pointer p) { super(p); }
  
    // Sets the Graph (that Nodes will be added to) and the status.  The
    // status may be set to nullptr, in which case errors cause CHECK
    // failures.  The graph and status must outlive *this.
    public Options(Graph graph, Status status) { super((Pointer)null); allocate(graph, status); }
    private native void allocate(Graph graph, Status status);

    // Methods for setting options.  These are const methods: they
    // return a copy of *this with the option set.
    public native @ByVal Options WithName(@StringPiece BytePointer name);
    public native @ByVal Options WithName(@StringPiece String name);
    public native @ByVal Options WithDevice(@StringPiece BytePointer device);
    public native @ByVal Options WithDevice(@StringPiece String device);
    public native @ByVal Options WithControlInput(Node control_input);
    public native @ByVal Options WithControlInputs(@ByVal NodeVector control_inputs);

    // Override the default value for an optional attr.
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, int value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, int value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @ArraySlice IntPointer value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @ArraySlice IntBuffer value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @ArraySlice int... value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @ArraySlice IntPointer value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @ArraySlice IntBuffer value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @ArraySlice int... value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @Cast("long long") long value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @Cast("long long") long value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @Cast("long long*") @ArraySlice LongPointer value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @Cast("long long*") @ArraySlice LongBuffer value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @Cast("long long*") @ArraySlice long... value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @Cast("long long*") @ArraySlice LongPointer value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @Cast("long long*") @ArraySlice LongBuffer value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @Cast("long long*") @ArraySlice long... value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, float value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, float value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @ArraySlice FloatPointer value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @ArraySlice FloatBuffer value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @ArraySlice float... value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @ArraySlice FloatPointer value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @ArraySlice FloatBuffer value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @ArraySlice float... value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, double value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, double value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @ArraySlice DoublePointer value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @ArraySlice DoubleBuffer value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @ArraySlice double... value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @ArraySlice DoublePointer value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @ArraySlice DoubleBuffer value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @ArraySlice double... value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @Cast("bool") boolean value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @Cast("bool") boolean value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @Cast("bool*") @ArraySlice BoolPointer value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @Cast("bool*") @ArraySlice boolean... value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @StdString BytePointer value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @StdString String value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @ByVal @Cast("tensorflow::gtl::ArraySlice<std::string>*") StringVector value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @ByVal @Cast("tensorflow::gtl::ArraySlice<std::string>*") StringVector value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @ByVal Tensor value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @ByVal Tensor value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @ByVal TensorVector value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @ByVal TensorVector value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @ByVal TensorProto value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @ByVal TensorProto value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @ByVal TensorProtoVector value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @ByVal TensorProtoVector value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @ByVal TensorShape value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @ByVal TensorShape value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @ByVal @Cast("tensorflow::gtl::ArraySlice<tensorflow::TensorShape>*") TensorShapeVector value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @ByVal @Cast("tensorflow::gtl::ArraySlice<tensorflow::TensorShape>*") TensorShapeVector value);
    public native @ByVal Options WithAttr(@StringPiece BytePointer attr_name, @ByVal NameAttrList value);
    public native @ByVal Options WithAttr(@StringPiece String attr_name, @ByVal NameAttrList value);
    // Note: overload needed to allow {...} expressions for value.

    // Methods for using options from a function that creates a Node.

    // Returns true if the status associated with *this has an error.
    // Use this to skip processing that may depend on prior results.
    public native @Cast("bool") boolean HaveError();

    // Returns a string representation of the status associated with *this.
    // Returns the string `"OK"` if the status doesn't have any error.
    public native @StdString BytePointer StatusToString();

    // Given the Op type name, return a name for a node of that type.
    // Uses the value set in WithName() if that has been called.  Otherwise,
    // returns a name built out of the Op type name.
    public native @StdString BytePointer GetNameForOp(@StringPiece BytePointer op);
    public native @StdString String GetNameForOp(@StringPiece String op);

    // Sets the device, adds control inputs, adds attrs, and calls Finalize().
    // If Finalize returns an error, it is saved and this function returns
    // nullptr.
    public native Node FinalizeBuilder(NodeBuilder builder);

    // Updates the associated status, if any, or calls TF_CHECK_OK if none.
    public native void UpdateStatus(@Const @ByRef Status status);

    // Accessor
    public native @Const OpRegistryInterface op_registry();
  }

  // Start building a new graph.
  public GraphDefBuilder(
        @Const OpRegistryInterface op_registry/*=tensorflow::OpRegistry::Global()*/) { super((Pointer)null); allocate(op_registry); }
  private native void allocate(
        @Const OpRegistryInterface op_registry/*=tensorflow::OpRegistry::Global()*/);
  public GraphDefBuilder() { super((Pointer)null); allocate(); }
  private native void allocate();

  // For use in tests, where you want to fail immediately on error instead
  // of checking the status at the end.
  /** enum tensorflow::GraphDefBuilder::TestFailImmediatelyType */
  public static final int kFailImmediately = 0;
  public GraphDefBuilder(
        @Cast("tensorflow::GraphDefBuilder::TestFailImmediatelyType") int arg0,
        @Const OpRegistryInterface op_registry/*=tensorflow::OpRegistry::Global()*/) { super((Pointer)null); allocate(arg0, op_registry); }
  private native void allocate(
        @Cast("tensorflow::GraphDefBuilder::TestFailImmediatelyType") int arg0,
        @Const OpRegistryInterface op_registry/*=tensorflow::OpRegistry::Global()*/);
  public GraphDefBuilder(
        @Cast("tensorflow::GraphDefBuilder::TestFailImmediatelyType") int arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(
        @Cast("tensorflow::GraphDefBuilder::TestFailImmediatelyType") int arg0);

  // Gets the Options with the associated Graph and Status.
  public native @Const @ByRef Options opts();

  // Once all the nodes have been added, call this to get whether it was
  // successful, and if so fill *graph_def.
  public native @ByVal Status ToGraphDef(GraphDef graph_def);

  // Adds the function and gradient definitions in `fdef_lib` to this graph's op
  // registry. Ignores duplicate functions, and returns a bad status if an
  // imported function differs from an existing function or op with the same
  // name.
  public native @ByVal Status AddFunctionLibrary(@Const @ByRef FunctionDefLibrary fdef_lib);

  // Returns whether a user-defined function with `name` already exists in the
  // graph.
  public native @Cast("bool") boolean HasFunction(@StdString BytePointer name);
  public native @Cast("bool") boolean HasFunction(@StdString String name);
}

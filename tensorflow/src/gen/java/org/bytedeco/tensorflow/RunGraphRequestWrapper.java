// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


////////////////////////////////////////////////////////////////////////////////
//
// Wrapper classes for the `WorkerService.RunGraph` request message.
//
// The `RunGraphRequest` message can contain potentially large tensor
// data as part of its `send` submessages. Here we provide specialized
// wrappers that avoid copying the tensor data wherever possible.
//
// See `RunGraphRequest` in tensorflow/core/protobuf/worker.proto for the
// protocol buffer definition.
//
////////////////////////////////////////////////////////////////////////////////

// Abstract interface for an immutable RunGraphRequest message.
//
// This interface is typically used by server-side components in the
// TensorFlow worker.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RunGraphRequestWrapper extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RunGraphRequestWrapper(Pointer p) { super(p); }


  // The session handle used to register the graph. If empty, a single global
  // namespace is used.
  public native @StdString BytePointer session_handle();

  // Set to true if `CreateWorkerSession` was called for `session_handle`.
  public native @Cast("bool") boolean create_worker_session_called();

  // REQUIRED: graph_handle must be returned by a RegisterGraph call
  // to the same WorkerService.
  public native @StdString BytePointer graph_handle();

  // A unique ID to distinguish different runs of the same graph.
  //
  // The master generates a global unique `step_id` to distinguish
  // different runs of the graph computation. Subgraphs communicate
  // (e.g., send/recv ops) with each other using `step_id` to
  // distinguish tensors generated by different runs.
  public native @Cast("tensorflow::int64") long step_id();

  // Options for this step.
  public native @Const @ByRef ExecutorOpts exec_opts();

  // Sends the tensors in "send" into the graph before the run.
  public native @Cast("size_t") long num_sends();
  public native @StdString BytePointer send_key(@Cast("size_t") long i);
  public native @ByVal Status SendValue(@Cast("size_t") long i, Tensor out_tensor);

  // Fetches the keys into `RunGraphResponse.recv` after the run.
  public native @Cast("size_t") long num_recvs();
  public native @StdString BytePointer recv_key(@Cast("size_t") long i);

  // True if the RunGraphRequest is a partial run request.
  public native @Cast("bool") boolean is_partial();

  // True if this is the last partial run request in a sequence of requests.
  public native @Cast("bool") boolean is_last_partial_run();

  // If true then some errors, e.g., execution errors that have long
  // error messages, may return an OK RunStepResponse with the actual
  // error saved in the status_code/status_error_message fields of the
  // response body. This is a workaround since the RPC subsystem may
  // truncate long metadata messages.
  public native @Cast("bool") boolean store_errors_in_response_body();

  public native @Cast("tensorflow::int64") long request_id();

  // Returns the wrapped data as a protocol buffer message.
  public native @Const @ByRef RunGraphRequest ToProto();
}

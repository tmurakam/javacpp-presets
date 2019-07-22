// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Greedily selects a subset of bounding boxes in descending order of score,
 * 
 *  pruning away boxes that have high overlaps
 *  with previously selected boxes.  Bounding boxes with score less than
 *  {@code score_threshold} are removed. N-by-n overlap values are supplied as square matrix,
 *  which allows for defining a custom overlap criterium (eg. intersection over union,
 *  intersection over area, etc.).
 * 
 *  The output of this operation is a set of integers indexing into the input
 *  collection of bounding boxes representing the selected boxes.  The bounding
 *  box coordinates corresponding to the selected indices can then be obtained
 *  using the {@code tf.gather operation}.  For example:
 * 
 *    selected_indices = tf.image.non_max_suppression_with_overlaps(
 *        overlaps, scores, max_output_size, overlap_threshold, score_threshold)
 *    selected_boxes = tf.gather(boxes, selected_indices)
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * overlaps: A 2-D float tensor of shape {@code [num_boxes, num_boxes]} representing
 *  the n-by-n box overlap values.
 *  * scores: A 1-D float tensor of shape {@code [num_boxes]} representing a single
 *  score corresponding to each box (each row of boxes).
 *  * max_output_size: A scalar integer tensor representing the maximum number of
 *  boxes to be selected by non max suppression.
 *  * overlap_threshold: A 0-D float tensor representing the threshold for deciding whether
 *  boxes overlap too.
 *  * score_threshold: A 0-D float tensor representing the threshold for deciding when to remove
 *  boxes based on score.
 * 
 *  Returns:
 *  * {@code Output}: A 1-D integer tensor of shape {@code [M]} representing the selected
 *  indices from the boxes tensor, where {@code M <= max_output_size}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class NonMaxSuppressionWithOverlaps extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NonMaxSuppressionWithOverlaps(Pointer p) { super(p); }

  public NonMaxSuppressionWithOverlaps(@Const @ByRef Scope scope,
                                @ByVal Input overlaps, @ByVal Input scores, @ByVal Input max_output_size,
                                @ByVal Input overlap_threshold,
                                @ByVal Input score_threshold) { super((Pointer)null); allocate(scope, overlaps, scores, max_output_size, overlap_threshold, score_threshold); }
  private native void allocate(@Const @ByRef Scope scope,
                                @ByVal Input overlaps, @ByVal Input scores, @ByVal Input max_output_size,
                                @ByVal Input overlap_threshold,
                                @ByVal Input score_threshold);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native NonMaxSuppressionWithOverlaps operation(Operation setter);
  public native @ByRef Output selected_indices(); public native NonMaxSuppressionWithOverlaps selected_indices(Output setter);
}

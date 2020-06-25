// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.openpose;

import org.bytedeco.javacpp.annotation.Index;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;
import org.bytedeco.caffe.*;
import static org.bytedeco.caffe.global.caffe.*;

import static org.bytedeco.openpose.global.openpose.*;

    /**
     * Datum: The OpenPose Basic Piece of Information Between Threads
     * Datum is one the main OpenPose classes/structs. The workers and threads share by default a
     * std::shared_ptr<std::vector<Datum>>. It contains all the parameters that the different workers and threads need
     * to exchange.
     */
    @Namespace("op") @NoOffset @Properties(inherit = org.bytedeco.openpose.presets.openpose.class)
public class Datum extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Datum(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Datum(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public Datum position(long position) {
            return (Datum)super.position(position);
        }
    
        // ---------------------------------------- ID parameters ---------------------------------------- //
        /** Datum ID. Internally used to sort the Datums if multi-threading is used. */
        public native @Cast("unsigned long long") long id(); public native Datum id(long setter);

        /** Datum sub-ID. Internally used to sort the Datums if multi-threading is used. */
        public native @Cast("unsigned long long") long subId(); public native Datum subId(long setter);

        /** Datum maximum sub-ID. Used to sort the Datums if multi-threading is used. */
        public native @Cast("unsigned long long") long subIdMax(); public native Datum subIdMax(long setter);

        /**
         * Name used when saving the data to disk (e.g., {@code write_images} or {@code write_keypoint} flags in the demo).
         */
        public native @StdString BytePointer name(); public native Datum name(BytePointer setter);

        /**
         * Corresponding frame number.
         * If the producer (e.g., video) starts from frame 0 and does not repeat any frame, then frameNumber should
         * match the field id.
         */
        public native @Cast("unsigned long long") long frameNumber(); public native Datum frameNumber(long setter);

        // ------------------------------ Input image and rendered version parameters ------------------------------ //
        /**
         * Original image to be processed in cv::Mat uchar format.
         * Size: (input_width x input_height) x 3 channels
         */
        public native @ByRef Matrix cvInputData(); public native Datum cvInputData(Matrix setter);

        /**
         * Original image to be processed in Array<float> format.
         * It has been resized to the net input resolution, as well as reformatted Array<float> format to be compatible
         * with the net.
         * If >1 scales, each scale is right- and bottom-padded to fill the greatest resolution. The
         * scales are sorted from bigger to smaller.
         * Vector size: #scales
         * Each array size: 3 x input_net_height x input_net_width
         */
        public native @StdVector FloatArray inputNetData(); public native Datum inputNetData(FloatArray setter);

        /**
         * Rendered image in Array<float> format.
         * It consists of a blending of the cvInputData and the pose/body part(s) heatmap/PAF(s).
         * If rendering is disabled (e.g., {@code no_render_pose} flag in the demo), outputData will be empty.
         * Size: 3 x output_net_height x output_net_width
         */
        public native @ByRef FloatArray outputData(); public native Datum outputData(FloatArray setter);

        /**
         * Rendered image in cv::Mat uchar format.
         * It has been resized to the desired output resolution (e.g., {@code resolution} flag in the demo).
         * If outputData is empty, cvOutputData will also be empty.
         * Size: (output_height x output_width) x 3 channels
         */
        public native @ByRef Matrix cvOutputData(); public native Datum cvOutputData(Matrix setter);

        /**
         * Rendered 3D image in cv::Mat uchar format.
         */
        public native @ByRef Matrix cvOutputData3D(); public native Datum cvOutputData3D(Matrix setter);

        // ------------------------------ Resulting Array<float> data parameters ------------------------------ //
        /**
         * Body pose (x,y,score) locations for each person in the image.
         * It has been resized to the desired output resolution (e.g., {@code resolution} flag in the demo).
         * Size: #people x #body parts (e.g., 18 for COCO or 15 for MPI) x 3 ((x,y) coordinates + score)
         */
        public native @ByRef FloatArray poseKeypoints(); public native Datum poseKeypoints(FloatArray setter);

        /**
         * People ID
         * It returns a person ID for each body pose, providing temporal consistency. The ID will be the same one
         * for a person across frames. I.e. this ID allows to keep track of the same person in time.
         * If either person identification is disabled or poseKeypoints is empty, poseIds will also be empty.
         * Size: #people
         */
        public native @ByRef LongLongArray poseIds(); public native Datum poseIds(LongLongArray setter);

        /**
         * Body pose global confidence/score for each person in the image.
         * It does not only consider the score of each body keypoint, but also the score of each PAF association.
         * Optimized for COCO evaluation metric.
         * It will highly penalyze people with missing body parts (e.g., cropped people on the borders of the image).
         * If poseKeypoints is empty, poseScores will also be empty.
         * Size: #people
         */
        public native @ByRef FloatArray poseScores(); public native Datum poseScores(FloatArray setter);

        /**
         * Body pose heatmaps (body parts, background and/or PAFs) for the whole image.
         * This parameter is by default empty and disabled for performance. Each group (body parts, background and
         * PAFs) can be individually enabled.
         * #heatmaps = #body parts (if enabled) + 1 (if background enabled) + 2 x #PAFs (if enabled). Each PAF has 2
         * consecutive channels, one for x- and one for y-coordinates.
         * Order heatmaps: body parts + background (as appears in POSE_BODY_PART_MAPPING) + (x,y) channel of each PAF
         * (sorted as appears in POSE_BODY_PART_PAIRS). See {@code pose/poseParameters.hpp}.
         * The user can choose the heatmaps normalization: ranges [0, 1], [-1, 1] or [0, 255]. Check the
         * {@code heatmaps_scale} flag in {OpenPose_path}doc/demo_overview.md for more details.
         * Size: #heatmaps x output_net_height x output_net_width
         */
        public native @ByRef FloatArray poseHeatMaps(); public native Datum poseHeatMaps(FloatArray setter);

        /**
         * Body pose candidates for the whole image.
         * This parameter is by default empty and disabled for performance. It can be enabled with {@code candidates_body}.
         * Candidates refer to all the detected body parts, before being assembled into people. Note that the number
         * of candidates is equal or higher than the number of body parts after being assembled into people.
         * Size: #body parts x min(part candidates, POSE_MAX_PEOPLE) x 3 (x,y,score).
         * Rather than vector, it should ideally be:
         * std::array<std::vector<std::array<float,3>>, #BP> poseCandidates;
         */
        public native @StdVector Float3Vector poseCandidates(); public native Datum poseCandidates(Float3Vector setter);

        /**
         * Face detection locations (x,y,width,height) for each person in the image.
         * It is resized to cvInputData.size().
         * Size: #people
         */
        public native @StdVector FloatRectangle faceRectangles(); public native Datum faceRectangles(FloatRectangle setter);

        /**
         * Face keypoints (x,y,score) locations for each person in the image.
         * It has been resized to the same resolution as {@code poseKeypoints}.
         * Size: #people x #face parts (70) x 3 ((x,y) coordinates + score)
         */
        public native @ByRef FloatArray faceKeypoints(); public native Datum faceKeypoints(FloatArray setter);

        /**
         * Face pose heatmaps (face parts and/or background) for the whole image.
         * Analogous of bodyHeatMaps applied to face. However, there is no PAFs and the size is different.
         * Size: #people x #face parts (70) x output_net_height x output_net_width
         */
        public native @ByRef FloatArray faceHeatMaps(); public native Datum faceHeatMaps(FloatArray setter);

        /**
         * Hand detection locations (x,y,width,height) for each person in the image.
         * It is resized to cvInputData.size().
         * Size: #people
         */
        public native @StdVector FloatRectangle2 handRectangles(); public native Datum handRectangles(FloatRectangle2 setter);

        /**
         * Hand keypoints (x,y,score) locations for each person in the image.
         * It has been resized to the same resolution as {@code poseKeypoints}.
         * handKeypoints[0] corresponds to left hands, and handKeypoints[1] to right ones.
         * Size each Array: #people x #hand parts (21) x 3 ((x,y) coordinates + score)
         */
        public native @ByRef FloatArray2 handKeypoints(); public native Datum handKeypoints(FloatArray2 setter);

        /**
         * Hand pose heatmaps (hand parts and/or background) for the whole image.
         * Analogous of faceHeatMaps applied to face.
         * Size each Array: #people x #hand parts (21) x output_net_height x output_net_width
         */
        public native @ByRef FloatArray2 handHeatMaps(); public native Datum handHeatMaps(FloatArray2 setter);

        // ---------------------------------------- 3-D Reconstruction parameters ---------------------------------------- //
        /**
         * Body pose (x,y,z,score) locations for each person in the image.
         * Size: #people x #body parts (e.g., 18 for COCO or 15 for MPI) x 4 ((x,y,z) coordinates + score)
         */
        public native @ByRef FloatArray poseKeypoints3D(); public native Datum poseKeypoints3D(FloatArray setter);

        /**
         * Face keypoints (x,y,z,score) locations for each person in the image.
         * It has been resized to the same resolution as {@code poseKeypoints3D}.
         * Size: #people x #face parts (70) x 4 ((x,y,z) coordinates + score)
         */
        public native @ByRef FloatArray faceKeypoints3D(); public native Datum faceKeypoints3D(FloatArray setter);

        /**
         * Hand keypoints (x,y,z,score) locations for each person in the image.
         * It has been resized to the same resolution as {@code poseKeypoints3D}.
         * handKeypoints[0] corresponds to left hands, and handKeypoints[1] to right ones.
         * Size each Array: #people x #hand parts (21) x 4 ((x,y,z) coordinates + score)
         */
        public native @ByRef FloatArray2 handKeypoints3D(); public native Datum handKeypoints3D(FloatArray2 setter);

        /**
         * 3x4 camera matrix of the camera (equivalent to cameraIntrinsics * cameraExtrinsics).
         */
        public native @ByRef Matrix cameraMatrix(); public native Datum cameraMatrix(Matrix setter);

        /**
         * 3x4 extrinsic parameters of the camera.
         */
        public native @ByRef Matrix cameraExtrinsics(); public native Datum cameraExtrinsics(Matrix setter);

        /**
         * 3x3 intrinsic parameters of the camera.
         */
        public native @ByRef Matrix cameraIntrinsics(); public native Datum cameraIntrinsics(Matrix setter);

        /**
         * If it is not empty, OpenPose will not run its internal body pose estimation network and will instead use
         * this data as the substitute of its network. The size of this element must match the size of the output of
         * its internal network, or it will lead to core dumped (segmentation) errors. You can modify the pose
         * estimation flags to match the dimension of both elements (e.g., {@code --net_resolution}, {@code --scale_number}, etc.).
         */
        public native @ByRef FloatArray poseNetOutput(); public native Datum poseNetOutput(FloatArray setter);

        // ---------------------------------------- Other (internal) parameters ---------------------------------------- //
        /**
         * Scale ratio between the input Datum::cvInputData and the net input size.
         */
        public native @StdVector DoublePointer scaleInputToNetInputs(); public native Datum scaleInputToNetInputs(DoublePointer setter);

        /**
         * Size(s) (width x height) of the image(s) fed to the pose deep net.
         * The size of the std::vector corresponds to the number of scales.
         */
        public native @StdVector IntPoint netInputSizes(); public native Datum netInputSizes(IntPoint setter);

        /**
         * Scale ratio between the input Datum::cvInputData and the output Datum::cvOutputData.
         */
        public native double scaleInputToOutput(); public native Datum scaleInputToOutput(double setter);

        /**
         * Size (width x height) of the image returned by the deep net.
         */
        public native @ByRef IntPoint netOutputSize(); public native Datum netOutputSize(IntPoint setter);

        /**
         * Scale ratio between the net output and the final output Datum::cvOutputData.
         */
        public native double scaleNetToOutput(); public native Datum scaleNetToOutput(double setter);

        /**
         * Pair with the element key id POSE_BODY_PART_MAPPING on {@code pose/poseParameters.hpp} and its mapped value (e.g.
         * 1 and "Neck").
         */
        public native @ByRef IntStringPair elementRendered(); public native Datum elementRendered(IntStringPair setter);

        // 3D/Adam parameters (experimental code not meant to be publicly used)
//         #ifdef USE_3D_ADAM_MODEL
//         #endif





        // ---------------------------------------- Functions ---------------------------------------- //
        /**
         * Default constructor struct.
         * It simply initializes the struct, id is temporary set to 0 and each other variable is assigned to its
         * default value.
         */
        public Datum() { super((Pointer)null); allocate(); }
        private native void allocate();

        /**
         * Copy constructor.
         * It performs {@code fast copy}: For performance purpose, copying a Datum or Array<T> or cv::Mat just copies the
         * reference, it still shares the same internal data.
         * Modifying the copied element will modify the original one.
         * Use clone() for a slower but real copy, similarly to cv::Mat and Array<T>.
         * @param datum Datum to be copied.
         */
        public Datum(@Const @ByRef Datum datum) { super((Pointer)null); allocate(datum); }
        private native void allocate(@Const @ByRef Datum datum);

        /**
         * Copy assignment.
         * Similar to Datum::Datum(const Datum& datum).
         * @param datum Datum to be copied.
         * @return The resulting Datum.
         */
        public native @ByRef @Name("operator =") Datum put(@Const @ByRef Datum datum);

        /**
         * Move constructor.
         * It destroys the original Datum to be moved.
         * @param datum Datum to be moved.
         */

        /**
         * Move assignment.
         * Similar to Datum::Datum(Datum&& datum).
         * @param datum Datum to be moved.
         * @return The resulting Datum.
         */

        /**
         * Destructor class.
         * Declared virtual so that Datum can be inherited.
         */

        /**
         * Clone function.
         * Similar to cv::Mat::clone and Array<T>::clone.
         * It performs a real but slow copy of the data, i.e., even if the copied element is modified, the original
         * one is not.
         * @return The resulting Datum.
         */
        public native @ByVal Datum clone();





        // ---------------------------------------- Comparison operators ---------------------------------------- //
        /**
         * Less comparison operator.
         * @param datum Datum to be compared.
         * @return Whether the instance satisfies the condition with respect to datum.
         */
        public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef Datum datum);
        /**
         * Greater comparison operator.
         * @param datum Datum to be compared.
         * @return Whether the instance satisfies the condition with respect to datum.
         */
        public native @Cast("bool") @Name("operator >") boolean greaterThan(@Const @ByRef Datum datum);
        /**
         * Less or equal comparison operator.
         * @param datum Datum to be compared.
         * @return Whether the instance satisfies the condition with respect to datum.
         */
        public native @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Const @ByRef Datum datum);
        /**
         * Greater or equal comparison operator.
         * @param datum Datum to be compared.
         * @return Whether the instance satisfies the condition with respect to datum.
         */
        public native @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Const @ByRef Datum datum);
        /**
         * Equal comparison operator.
         * @param datum Datum to be compared.
         * @return Whether the instance satisfies the condition with respect to datum.
         */
        public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef Datum datum);
        /**
         * Not equal comparison operator.
         * @param datum Datum to be compared.
         * @return Whether the instance satisfies the condition with respect to datum.
         */
        public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef Datum datum);
    }

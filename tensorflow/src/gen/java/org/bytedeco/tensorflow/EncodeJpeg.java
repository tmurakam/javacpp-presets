// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** JPEG-encode an image.
 * 
 *  {@code image} is a 3-D uint8 Tensor of shape {@code [height, width, channels]}.
 * 
 *  The attr {@code format} can be used to override the color format of the encoded
 *  output.  Values can be:
 * 
 *  *   {@code ''}: Use a default format based on the number of channels in the image.
 *  *   {@code grayscale}: Output a grayscale JPEG image.  The {@code channels} dimension
 *      of {@code image} must be 1.
 *  *   {@code rgb}: Output an RGB JPEG image. The {@code channels} dimension
 *      of {@code image} must be 3.
 * 
 *  If {@code format} is not specified or is the empty string, a default format is picked
 *  in function of the number of channels in {@code image}:
 * 
 *  *   1: Output a grayscale image.
 *  *   3: Output an RGB image.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * image: 3-D with shape {@code [height, width, channels]}.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * format: Per pixel image format.
 *  * quality: Quality of the compression from 0 to 100 (higher is better and slower).
 *  * progressive: If True, create a JPEG that loads progressively (coarse to fine).
 *  * optimize_size: If True, spend CPU/RAM to reduce size with no quality change.
 *  * chroma_downsampling: See http://en.wikipedia.org/wiki/Chroma_subsampling.
 *  * density_unit: Unit used to specify {@code x_density} and {@code y_density}:
 *  pixels per inch ({@code 'in'}) or centimeter ({@code 'cm'}).
 *  * x_density: Horizontal pixels per density unit.
 *  * y_density: Vertical pixels per density unit.
 *  * xmp_metadata: If not empty, embed this XMP metadata in the image header.
 * 
 *  Returns:
 *  * {@code Output}: 0-D. JPEG-encoded image. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EncodeJpeg extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EncodeJpeg(Pointer p) { super(p); }

  /** Optional attribute setters for EncodeJpeg */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** Per pixel image format.
     * 
     *  Defaults to "" */
    
    ///
    public native @ByVal Attrs Format(@StringPiece BytePointer x);
    public native @ByVal Attrs Format(@StringPiece String x);

    /** Quality of the compression from 0 to 100 (higher is better and slower).
     * 
     *  Defaults to 95 */
    
    ///
    public native @ByVal Attrs Quality(@Cast("tensorflow::int64") long x);

    /** If True, create a JPEG that loads progressively (coarse to fine).
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs Progressive(@Cast("bool") boolean x);

    /** If True, spend CPU/RAM to reduce size with no quality change.
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs OptimizeSize(@Cast("bool") boolean x);

    /** See http://en.wikipedia.org/wiki/Chroma_subsampling.
     * 
     *  Defaults to true */
    
    ///
    public native @ByVal Attrs ChromaDownsampling(@Cast("bool") boolean x);

    /** Unit used to specify {@code x_density} and {@code y_density}:
     *  pixels per inch ({@code 'in'}) or centimeter ({@code 'cm'}).
     * 
     *  Defaults to "in" */
    
    ///
    public native @ByVal Attrs DensityUnit(@StringPiece BytePointer x);
    public native @ByVal Attrs DensityUnit(@StringPiece String x);

    /** Horizontal pixels per density unit.
     * 
     *  Defaults to 300 */
    
    ///
    public native @ByVal Attrs XDensity(@Cast("tensorflow::int64") long x);

    /** Vertical pixels per density unit.
     * 
     *  Defaults to 300 */
    
    ///
    public native @ByVal Attrs YDensity(@Cast("tensorflow::int64") long x);

    /** If not empty, embed this XMP metadata in the image header.
     * 
     *  Defaults to "" */
    public native @ByVal Attrs XmpMetadata(@StringPiece BytePointer x);
    public native @ByVal Attrs XmpMetadata(@StringPiece String x);

    public native @StringPiece BytePointer format_(); public native Attrs format_(BytePointer setter);
    public native @Cast("tensorflow::int64") long quality_(); public native Attrs quality_(long setter);
    public native @Cast("bool") boolean progressive_(); public native Attrs progressive_(boolean setter);
    public native @Cast("bool") boolean optimize_size_(); public native Attrs optimize_size_(boolean setter);
    public native @Cast("bool") boolean chroma_downsampling_(); public native Attrs chroma_downsampling_(boolean setter);
    public native @StringPiece BytePointer density_unit_(); public native Attrs density_unit_(BytePointer setter);
    public native @Cast("tensorflow::int64") long x_density_(); public native Attrs x_density_(long setter);
    public native @Cast("tensorflow::int64") long y_density_(); public native Attrs y_density_(long setter);
    public native @StringPiece BytePointer xmp_metadata_(); public native Attrs xmp_metadata_(BytePointer setter);
  }
  public EncodeJpeg(@Const @ByRef Scope scope, @ByVal Input image) { super((Pointer)null); allocate(scope, image); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input image);
  public EncodeJpeg(@Const @ByRef Scope scope, @ByVal Input image, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, image, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input image, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Format(@StringPiece BytePointer x);
  public static native @ByVal Attrs Format(@StringPiece String x);
  public static native @ByVal Attrs Quality(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Progressive(@Cast("bool") boolean x);
  public static native @ByVal Attrs OptimizeSize(@Cast("bool") boolean x);
  public static native @ByVal Attrs ChromaDownsampling(@Cast("bool") boolean x);
  public static native @ByVal Attrs DensityUnit(@StringPiece BytePointer x);
  public static native @ByVal Attrs DensityUnit(@StringPiece String x);
  public static native @ByVal Attrs XDensity(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs YDensity(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs XmpMetadata(@StringPiece BytePointer x);
  public static native @ByVal Attrs XmpMetadata(@StringPiece String x);

  public native @ByRef Operation operation(); public native EncodeJpeg operation(Operation setter);
  public native @ByRef Output contents(); public native EncodeJpeg contents(Output setter);
}

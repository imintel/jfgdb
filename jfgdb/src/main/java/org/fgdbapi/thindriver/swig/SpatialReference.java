/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fgdbapi.thindriver.swig;

public class SpatialReference {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SpatialReference(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SpatialReference obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FGDBJNIWrapperJNI.delete_SpatialReference(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SpatialReference() {
    this(FGDBJNIWrapperJNI.new_SpatialReference(), true);
  }

  public int SetSpatialReferenceText(String spatialReference) {
    return FGDBJNIWrapperJNI.SpatialReference_SetSpatialReferenceText(swigCPtr, this, spatialReference);
  }

  public int SetSpatialReferenceID(int srid) {
    return FGDBJNIWrapperJNI.SpatialReference_SetSpatialReferenceID(swigCPtr, this, srid);
  }

 

  public int SetXYFalseOrigin(double falseX, double falseY) {
    return FGDBJNIWrapperJNI.SpatialReference_SetXYFalseOrigin(swigCPtr, this, falseX, falseY);
  }


  public int SetXYResolution(double xyResolution) {
    return FGDBJNIWrapperJNI.SpatialReference_SetXYResolution(swigCPtr, this, xyResolution);
  }

  public int SetXYTolerance(double xyTolerance) {
    return FGDBJNIWrapperJNI.SpatialReference_SetXYTolerance(swigCPtr, this, xyTolerance);
  }


  public int SetZFalseOrigin(double falseZ) {
    return FGDBJNIWrapperJNI.SpatialReference_SetZFalseOrigin(swigCPtr, this, falseZ);
  }

  public int SetZResolution(double zResolution) {
    return FGDBJNIWrapperJNI.SpatialReference_SetZResolution(swigCPtr, this, zResolution);
  }

  public int SetZTolerance(double zTolerance) {
    return FGDBJNIWrapperJNI.SpatialReference_SetZTolerance(swigCPtr, this, zTolerance);
  }


  public int SetMFalseOrigin(double falseM) {
    return FGDBJNIWrapperJNI.SpatialReference_SetMFalseOrigin(swigCPtr, this, falseM);
  }

  public int SetMResolution(double mResolution) {
    return FGDBJNIWrapperJNI.SpatialReference_SetMResolution(swigCPtr, this, mResolution);
  }

  public int SetMTolerance(double mTolerance) {
    return FGDBJNIWrapperJNI.SpatialReference_SetMTolerance(swigCPtr, this, mTolerance);
  }

}

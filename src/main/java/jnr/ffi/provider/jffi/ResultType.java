package jnr.ffi.provider.jffi;

import jnr.ffi.NativeType;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.ToNativeConverter;

import java.lang.annotation.Annotation;

/**
 *
 */
class ResultType extends SigType {
    final FromNativeConverter fromNativeConverter;

    ResultType(Class javaType, com.kenai.jffi.Type jffiType, Annotation[] annotations, FromNativeConverter fromNativeConverter) {
        super(javaType, jffiType, annotations, fromNativeConverter != null ? fromNativeConverter.nativeType() : javaType);
        this.fromNativeConverter = fromNativeConverter;
    }
}
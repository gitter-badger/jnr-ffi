package jnr.ffi.provider.jffi;

import jnr.ffi.Pointer;
import jnr.ffi.Struct;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;

/**
 * Created with IntelliJ IDEA.
 * User: wayne
 * Date: 21/11/12
 * Time: 2:43 AM
 * To change this template use File | Settings | File Templates.
 */
public final class StructByReferenceToNativeConverter implements ToNativeConverter<Struct, Pointer> {
    private final int flags;

    StructByReferenceToNativeConverter(int flags) {
        this.flags = flags;
    }

    public Class<Pointer> nativeType() {
        return Pointer.class;
    }

    public Pointer toNative(Struct value, ToNativeContext ctx) {
        return value != null ? Struct.getMemory(value, flags) : null;
    }
}
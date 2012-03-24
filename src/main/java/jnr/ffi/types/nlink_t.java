  
package jnr.ffi.types;

import jnr.ffi.TypeAlias;
import jnr.ffi.annotations.TypeDefinition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.PARAMETER, ElementType.METHOD })
@TypeDefinition(alias = TypeAlias.nlink_t)
public @interface nlink_t {

}

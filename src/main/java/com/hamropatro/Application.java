/* (C) Hamro Patro 2021 */
package com.hamropatro;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;
import javax.persistence.Entity;

@OpenAPIDefinition(info = @Info(title = "parewa-template", version = "0.0"))
@Introspected(packages = "com.hamropatro.entities", includedAnnotations = Entity.class)
public class Application {

	public static void main(String[] args) {
		Micronaut.run(Application.class, args);
	}
}

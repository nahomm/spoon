package spoon.reflect.visitor;

import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.reference.CtTypeReference;

import java.util.Collection;

public interface ImportScanner {
	/**
	 * Computes import of a {@link spoon.reflect.declaration.CtSimpleType}
	 * (represent a class).
	 *
	 * @return Imports computes by Spoon, not original imports.
	 */
	Collection<CtTypeReference<?>> computeImports(CtSimpleType<?> simpleType);

	/**
	 * Checks if the type is already imported.
	 */
	boolean isImported(CtTypeReference<?> ref);
}

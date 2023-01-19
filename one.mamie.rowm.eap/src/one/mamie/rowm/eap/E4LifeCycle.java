package one.mamie.rowm.eap;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.e4.ui.workbench.lifecycle.PreSave;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessAdditions;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessRemovals;

/**
 * This is a stub implementation containing e4 LifeCycle annotated
 * methods.<br />
 * There is a corresponding entry in <em>plugin.xml</em> (under the
 * <em>org.eclipse.core.runtime.products' extension point</em>) that references
 * this class.
 **/
public class E4LifeCycle {

	@PostContextCreate
	void postContextCreate(IEclipseContext workbenchContext) {
		// Boilerplate
	}

	@PreSave
	void preSave(IEclipseContext workbenchContext) {
		// Boilerplate
	}

	@ProcessAdditions
	void processAdditions(IEclipseContext workbenchContext) {
		// Boilerplate
	}

	@ProcessRemovals
	void processRemovals(IEclipseContext workbenchContext) {
		// Boilerplate
	}
}

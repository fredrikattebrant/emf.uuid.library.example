package emf.uuid.library.example.Library.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class LibraryResource extends XMIResourceImpl {

	public LibraryResource() {
		super();
	}
	
	public LibraryResource(URI uri) {
		super(uri);
	}
	
	@Override
	protected boolean useUUIDs() {
		return true; // always use UUIDs'
	}
}

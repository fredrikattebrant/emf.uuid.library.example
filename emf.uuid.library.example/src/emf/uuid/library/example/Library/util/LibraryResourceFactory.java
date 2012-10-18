package emf.uuid.library.example.Library.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class LibraryResourceFactory extends XMIResourceFactoryImpl {

	public LibraryResourceFactory() {
		super();
	}
	
	@Override
	public Resource createResource(URI uri) {
		return new LibraryResource(uri);
	}
}

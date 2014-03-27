package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.BodyInElement_c.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================

// No special imports
import java.util.*;
import java.lang.reflect.*;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import com.mentor.nucleus.bp.core.util.PersistenceUtil;
import org.eclipse.core.runtime.NullProgressMonitor;
import com.mentor.nucleus.bp.core.ui.marker.UmlProblem;
import com.mentor.nucleus.bp.core.common.*;
abstract class EV_BODY_IN_ELEMENT extends genericEvent_c {
	public abstract int getEvtcode();
}

public class BodyInElement_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public BodyInElement_c(ModelRoot modelRoot, java.util.UUID p_m_element_id,
			java.util.UUID p_m_action_id) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_action_id = IdAssigner.preprocessUUID(p_m_action_id);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_element_id = IdAssigner.preprocessUUID(p_m_element_id);

		Object[] key = {m_action_id, m_element_id};
		addInstanceToMap(key);
	}
	static public BodyInElement_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_element_id, java.util.UUID p_m_action_id,
			String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(BodyInElement_c.class);
		BodyInElement_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_action_id, p_m_element_id};
			new_inst = (BodyInElement_c) instances.get(key);
		}
		String contentPath = PersistenceUtil.resolveRelativePath(p_localPath,
				new Path(p_contentPath));
		if (modelRoot.isNewCompareRoot()) {
			// for comparisons we do not want to change
			// the content path
			contentPath = p_contentPath;
		}
		if (new_inst != null && !modelRoot.isCompareRoot()) {
			PersistableModelComponent pmc = new_inst.getPersistableComponent();
			if (pmc == null) {
				// dangling reference, redo this instance
				new_inst.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_action_id = IdAssigner.preprocessUUID(p_m_action_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_element_id = IdAssigner
						.preprocessUUID(p_m_element_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new BodyInElement_c(modelRoot, p_m_element_id,
					p_m_action_id);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public BodyInElement_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_element_id, java.util.UUID p_m_action_id) {
		InstanceList instances = modelRoot
				.getInstanceList(BodyInElement_c.class);
		BodyInElement_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_action_id, p_m_element_id};
			source = (BodyInElement_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_action_id = IdAssigner.preprocessUUID(p_m_action_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_element_id = IdAssigner.preprocessUUID(p_m_element_id);

				return source;
			}
		}
		// there is no instance matching the id
		BodyInElement_c new_inst = new BodyInElement_c(modelRoot,
				p_m_element_id, p_m_action_id);
		return new_inst;
	}
	public BodyInElement_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_action_id = IdAssigner.NULL_UUID;
		m_element_id = IdAssigner.NULL_UUID;
		Object[] key = {m_action_id, m_element_id};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_action_id, m_element_id};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_action_id != p_newKey) {

			m_action_id = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof BodyInElement_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof BodyInElement_c)) {
			return false;
		}

		BodyInElement_c me = (BodyInElement_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getAction_id()) || IdAssigner.NULL_UUID
				.equals(((BodyInElement_c) elem).getAction_id()))
				&& this != elem) {
			return false;
		}
		if (!getAction_id().equals(((BodyInElement_c) elem).getAction_id()))
			return false;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getElement_id()) || IdAssigner.NULL_UUID
				.equals(((BodyInElement_c) elem).getElement_id()))
				&& this != elem) {
			return false;
		}
		if (!getElement_id().equals(((BodyInElement_c) elem).getElement_id()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof BodyInElement_c)) {
			return false;
		}

		BodyInElement_c me = (BodyInElement_c) elem;
		if (!getAction_idCachedValue().equals(
				((BodyInElement_c) elem).getAction_idCachedValue()))
			return false;
		if (!getElement_idCachedValue().equals(
				((BodyInElement_c) elem).getElement_idCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_action_id;
	private java.util.UUID m_element_id;

	// declare association references from this class

	// referring navigation

	PackageableElement_c IsDeclaredInPackageableElement;
	public void relateAcrossR640To(PackageableElement_c target) {
		relateAcrossR640To(target, true);
	}
	public void relateAcrossR640To(PackageableElement_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsDeclaredInPackageableElement)
			return; // already related

		if (IsDeclaredInPackageableElement != target) {

			Object oldKey = getInstanceKey();

			if (IsDeclaredInPackageableElement != null) {

				IsDeclaredInPackageableElement.clearBackPointerR640To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"BodyInElement_c.relateAcrossR640To(PackageableElement_c target)",
									"Relate performed across R640 from Body in Element to Packageable Element without unrelate of prior instance.");
				}
			}

			IsDeclaredInPackageableElement = target;
			m_element_id = target.getElement_id();
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR640To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR640From(PackageableElement_c target) {
		unrelateAcrossR640From(target, true);
	}
	public void unrelateAcrossR640From(PackageableElement_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (IsDeclaredInPackageableElement == null)
			return; // already unrelated

		if (target != IsDeclaredInPackageableElement) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R640",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR640To(this);
		}

		if (IsDeclaredInPackageableElement != null) {

			m_element_id = IsDeclaredInPackageableElement.getElement_id();
			IsDeclaredInPackageableElement = null;
			target.removeRef();
		}
	}

	// referring navigation

	Body_c HasDeclaredBody;
	public void relateAcrossR640To(Body_c target) {
		relateAcrossR640To(target, true);
	}
	public void relateAcrossR640To(Body_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == HasDeclaredBody)
			return; // already related

		if (HasDeclaredBody != target) {

			Object oldKey = getInstanceKey();

			if (HasDeclaredBody != null) {

				HasDeclaredBody.clearBackPointerR640To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"BodyInElement_c.relateAcrossR640To(Body_c target)",
									"Relate performed across R640 from Body in Element to Body without unrelate of prior instance.");
				}
			}

			HasDeclaredBody = target;
			m_action_id = target.getAction_id();
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR640To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR640From(Body_c target) {
		unrelateAcrossR640From(target, true);
	}
	public void unrelateAcrossR640From(Body_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (HasDeclaredBody == null)
			return; // already unrelated

		if (target != HasDeclaredBody) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R640",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR640To(this);
		}

		if (HasDeclaredBody != null) {

			m_action_id = HasDeclaredBody.getAction_id();
			HasDeclaredBody = null;
			target.removeRef();
		}
	}

	public static BodyInElement_c getOneACT_BIEOnR640(
			PackageableElement_c[] targets) {
		return getOneACT_BIEOnR640(targets, null);
	}

	public static BodyInElement_c getOneACT_BIEOnR640(
			PackageableElement_c[] targets, ClassQueryInterface_c test) {
		BodyInElement_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneACT_BIEOnR640(targets[i], test);
			}
		}

		return ret_val;
	}

	public static BodyInElement_c getOneACT_BIEOnR640(
			PackageableElement_c target) {
		return getOneACT_BIEOnR640(target, null);
	}

	public static BodyInElement_c getOneACT_BIEOnR640(
			PackageableElement_c target, boolean loadComponent) {
		return getOneACT_BIEOnR640(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static BodyInElement_c getOneACT_BIEOnR640(
			PackageableElement_c target, ClassQueryInterface_c test) {
		if (target != null) {
			return getOneACT_BIEOnR640(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static BodyInElement_c getOneACT_BIEOnR640(ModelRoot modelRoot,
			PackageableElement_c target, ClassQueryInterface_c test) {
		return getOneACT_BIEOnR640(modelRoot, target, test, true);
	}

	public static BodyInElement_c getOneACT_BIEOnR640(ModelRoot modelRoot,
			PackageableElement_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		return find_getOneACT_BIEOnR640(modelRoot, target, test);
	}
	private static BodyInElement_c find_getOneACT_BIEOnR640(
			ModelRoot modelRoot, PackageableElement_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			synchronized (target.backPointer_HasDeclaredBodyInElementHasDeclared_R640) {
				for (int i = 0; i < target.backPointer_HasDeclaredBodyInElementHasDeclared_R640
						.size(); ++i) {
					BodyInElement_c source = (BodyInElement_c) target.backPointer_HasDeclaredBodyInElementHasDeclared_R640
							.get(i);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						return source;
					}
				}
			}
		}
		// not found
		return null;
	}

	public static BodyInElement_c[] getManyACT_BIEsOnR640(
			PackageableElement_c[] targets) {
		return getManyACT_BIEsOnR640(targets, null);
	}
	public static BodyInElement_c[] getManyACT_BIEsOnR640(
			PackageableElement_c[] targets, boolean loadComponent) {
		return getManyACT_BIEsOnR640(targets, null, loadComponent);
	}
	public static BodyInElement_c[] getManyACT_BIEsOnR640(
			PackageableElement_c[] targets, ClassQueryInterface_c test) {
		return getManyACT_BIEsOnR640(targets, test, true);
	}

	public static BodyInElement_c[] getManyACT_BIEsOnR640(
			PackageableElement_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new BodyInElement_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(BodyInElement_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			synchronized (targets[i].backPointer_HasDeclaredBodyInElementHasDeclared_R640) {
				for (int j = 0; j < targets[i].backPointer_HasDeclaredBodyInElementHasDeclared_R640
						.size(); ++j) {
					BodyInElement_c source = (BodyInElement_c) targets[i].backPointer_HasDeclaredBodyInElementHasDeclared_R640
							.get(j);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						matches.add(source);
					}
				}
			}
		}
		if (matches.size() > 0) {
			BodyInElement_c[] ret_set = new BodyInElement_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new BodyInElement_c[0];
		}
	}

	public static BodyInElement_c[] getManyACT_BIEsOnR640(
			PackageableElement_c target) {
		return getManyACT_BIEsOnR640(target, null);
	}

	public static BodyInElement_c[] getManyACT_BIEsOnR640(
			PackageableElement_c target, boolean loadComponent) {
		return getManyACT_BIEsOnR640(target, null, loadComponent);
	}

	public static BodyInElement_c[] getManyACT_BIEsOnR640(
			PackageableElement_c target, ClassQueryInterface_c test) {
		return getManyACT_BIEsOnR640(target, test, true);
	}

	public static BodyInElement_c[] getManyACT_BIEsOnR640(
			PackageableElement_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		if (target == null)
			return new BodyInElement_c[0];

		ModelRoot modelRoot = target.getModelRoot();
		Vector matches = new Vector();
		synchronized (target.backPointer_HasDeclaredBodyInElementHasDeclared_R640) {
			for (int i = 0; i < target.backPointer_HasDeclaredBodyInElementHasDeclared_R640
					.size(); ++i) {
				BodyInElement_c source = (BodyInElement_c) target.backPointer_HasDeclaredBodyInElementHasDeclared_R640
						.get(i);
				if (source != null && (test == null || test.evaluate(source))) {

					matches.add(source);
				}
			}
		}

		if (matches.size() > 0) {
			BodyInElement_c[] ret_set = new BodyInElement_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new BodyInElement_c[0];
		}
	}

	public static BodyInElement_c getOneACT_BIEOnR640(Body_c[] targets) {
		return getOneACT_BIEOnR640(targets, null);
	}

	public static BodyInElement_c getOneACT_BIEOnR640(Body_c[] targets,
			ClassQueryInterface_c test) {
		BodyInElement_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneACT_BIEOnR640(targets[i], test);
			}
		}

		return ret_val;
	}

	public static BodyInElement_c getOneACT_BIEOnR640(Body_c target) {
		return getOneACT_BIEOnR640(target, null);
	}

	public static BodyInElement_c getOneACT_BIEOnR640(Body_c target,
			boolean loadComponent) {
		return getOneACT_BIEOnR640(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static BodyInElement_c getOneACT_BIEOnR640(Body_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneACT_BIEOnR640(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static BodyInElement_c getOneACT_BIEOnR640(ModelRoot modelRoot,
			Body_c target, ClassQueryInterface_c test) {
		return getOneACT_BIEOnR640(modelRoot, target, test, true);
	}

	public static BodyInElement_c getOneACT_BIEOnR640(ModelRoot modelRoot,
			Body_c target, ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneACT_BIEOnR640(modelRoot, target, test);
	}
	private static BodyInElement_c find_getOneACT_BIEOnR640(
			ModelRoot modelRoot, Body_c target, ClassQueryInterface_c test) {
		if (target != null) {
			synchronized (target.backPointer_IsDeclaredInBodyInElementIsDeclaredIn_R640) {
				for (int i = 0; i < target.backPointer_IsDeclaredInBodyInElementIsDeclaredIn_R640
						.size(); ++i) {
					BodyInElement_c source = (BodyInElement_c) target.backPointer_IsDeclaredInBodyInElementIsDeclaredIn_R640
							.get(i);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						return source;
					}
				}
			}
		}
		// not found
		return null;
	}

	public static BodyInElement_c[] getManyACT_BIEsOnR640(Body_c[] targets) {
		return getManyACT_BIEsOnR640(targets, null);
	}
	public static BodyInElement_c[] getManyACT_BIEsOnR640(Body_c[] targets,
			boolean loadComponent) {
		return getManyACT_BIEsOnR640(targets, null, loadComponent);
	}
	public static BodyInElement_c[] getManyACT_BIEsOnR640(Body_c[] targets,
			ClassQueryInterface_c test) {
		return getManyACT_BIEsOnR640(targets, test, true);
	}

	public static BodyInElement_c[] getManyACT_BIEsOnR640(Body_c[] targets,
			ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new BodyInElement_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(BodyInElement_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			synchronized (targets[i].backPointer_IsDeclaredInBodyInElementIsDeclaredIn_R640) {
				for (int j = 0; j < targets[i].backPointer_IsDeclaredInBodyInElementIsDeclaredIn_R640
						.size(); ++j) {
					BodyInElement_c source = (BodyInElement_c) targets[i].backPointer_IsDeclaredInBodyInElementIsDeclaredIn_R640
							.get(j);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						matches.add(source);
					}
				}
			}
		}
		if (matches.size() > 0) {
			BodyInElement_c[] ret_set = new BodyInElement_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new BodyInElement_c[0];
		}
	}

	public static BodyInElement_c[] getManyACT_BIEsOnR640(Body_c target) {
		if (target != null) {
			Body_c[] targetArray = new Body_c[1];
			targetArray[0] = target;
			return getManyACT_BIEsOnR640(targetArray);
		} else {
			BodyInElement_c[] result = new BodyInElement_c[0];
			return result;
		}
	}

	public static BodyInElement_c[] getManyACT_BIEsOnR640(Body_c target,
			boolean loadComponent) {
		if (target != null) {
			Body_c[] targetArray = new Body_c[1];
			targetArray[0] = target;
			return getManyACT_BIEsOnR640(targetArray, loadComponent);
		} else {
			BodyInElement_c[] result = new BodyInElement_c[0];
			return result;
		}
	}

	public void batchRelate(ModelRoot modelRoot, boolean notifyChanges,
			boolean searchAllRoots) {
		batchRelate(modelRoot, false, notifyChanges, searchAllRoots);
	}

	public void batchRelate(ModelRoot modelRoot, boolean relateProxies,
			boolean notifyChanges, boolean searchAllRoots) {
		InstanceList instances = null;
		ModelRoot baseRoot = modelRoot;

		// R640
		Body_c relInst56451 = (Body_c) baseRoot.getInstanceList(Body_c.class)
				.get(new Object[]{m_action_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst56451 == null) {
			relInst56451 = (Body_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(Body_c.class)
					.get(new Object[]{m_action_id});
		}
		if (relInst56451 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst56451 = (Body_c) roots[i].getInstanceList(Body_c.class)
						.get(new Object[]{m_action_id});
				if (relInst56451 != null)
					break;
			}
		}
		//synchronized
		if (relInst56451 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst56451) && !isProxy())) {
				relInst56451.relateAcrossR640To(this, notifyChanges);
			}
		}

		PackageableElement_c relInst56452 = (PackageableElement_c) baseRoot
				.getInstanceList(PackageableElement_c.class).get(
						new Object[]{m_element_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst56452 == null) {
			relInst56452 = (PackageableElement_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(PackageableElement_c.class)
					.get(new Object[]{m_element_id});
		}
		if (relInst56452 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst56452 = (PackageableElement_c) roots[i].getInstanceList(
						PackageableElement_c.class).get(
						new Object[]{m_element_id});
				if (relInst56452 != null)
					break;
			}
		}
		//synchronized
		if (relInst56452 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst56452) && !isProxy())) {
				relInst56452.relateAcrossR640To(this, notifyChanges);
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R640
		// ACT_ACT
		inst = HasDeclaredBody;
		unrelateAcrossR640From(HasDeclaredBody, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
		// PE_PE
		inst = IsDeclaredInPackageableElement;
		unrelateAcrossR640From(IsDeclaredInPackageableElement, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
	}
	public static void batchRelateAll(ModelRoot modelRoot,
			boolean notifyChanges, boolean searchAllRoots) {
		batchRelateAll(modelRoot, notifyChanges, searchAllRoots, false);
	}
	public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots, boolean relateProxies)
  {
	InstanceList instances = modelRoot.getInstanceList(BodyInElement_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final BodyInElement_c inst = (BodyInElement_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(BodyInElement_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static BodyInElement_c BodyInElementInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		BodyInElement_c result = findBodyInElementInstance(modelRoot, test,
				loadComponent);
		return result;
	}
	private static BodyInElement_c findBodyInElementInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(BodyInElement_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				BodyInElement_c x = (BodyInElement_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					return x;
				}
			}
		}
		return null;
	}
	public static BodyInElement_c BodyInElementInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test) {
		return BodyInElementInstance(modelRoot, test, true);
	}

	public static BodyInElement_c BodyInElementInstance(ModelRoot modelRoot) {
		return BodyInElementInstance(modelRoot, null, true);
	}

	public static BodyInElement_c[] BodyInElementInstances(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(BodyInElement_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				BodyInElement_c x = (BodyInElement_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					matches.add(x);
				}
			}
			if (matches.size() > 0) {
				BodyInElement_c[] ret_set = new BodyInElement_c[matches.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new BodyInElement_c[0];
			}
		}
	}
	public static BodyInElement_c[] BodyInElementInstances(ModelRoot modelRoot,
			ClassQueryInterface_c test) {
		return BodyInElementInstances(modelRoot, test, true);
	}
	public static BodyInElement_c[] BodyInElementInstances(ModelRoot modelRoot) {
		return BodyInElementInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Body in Element.dispose call: ";
		Body_c testR640Inst = Body_c.getOneACT_ACTOnR640(this, false);

		if (testR640Inst != null) {
			delete_error = true;
			errorMsg = errorMsg + "640 ";
		}

		PackageableElement_c testR640InstOth = PackageableElement_c
				.getOnePE_PEOnR640(this, false);

		if (testR640InstOth != null) {
			delete_error = true;
			errorMsg = errorMsg + "640 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log.println(ILogger.DELETE, "Body in Element",
						errorMsg);
			} else {
				Exception e = new Exception();
				e.fillInStackTrace();
				CorePlugin.logError(errorMsg, e);
			}
		}
		return result;
	}

	// end declare instance pool

	// declare attribute accessors
	public boolean isUUID(String attributeName) {
		if (attributeName.equals("action_id")) {
			return true;
		}
		if (attributeName.equals("element_id")) {
			return true;
		}
		return false;
	}
	// declare attribute accessors
	public long getAction_idLongBased() {
		if (HasDeclaredBody != null) {
			return HasDeclaredBody.getAction_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getAction_id() {
		if (HasDeclaredBody != null) {
			return HasDeclaredBody.getAction_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getAction_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_action_id))
			return m_action_id;
		else
			return getAction_id();
	}

	public void setAction_id(java.util.UUID newValue) {
		m_action_id = IdAssigner.preprocessUUID(newValue);
	}
	public long getElement_idLongBased() {
		if (IsDeclaredInPackageableElement != null) {
			return IsDeclaredInPackageableElement.getElement_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getElement_id() {
		if (IsDeclaredInPackageableElement != null) {
			return IsDeclaredInPackageableElement.getElement_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getElement_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_element_id))
			return m_element_id;
		else
			return getElement_id();
	}

	public void setElement_id(java.util.UUID newValue) {
		m_element_id = IdAssigner.preprocessUUID(newValue);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log.println(ILogger.OPERATION, "Body in Element", //$NON-NLS-1$
				" Operation entered: Body in Element::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		BodyInElement_c[] objs = BodyInElement_c.BodyInElementInstances(
				modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log.println(ILogger.OPERATION, "Body in Element", //$NON-NLS-1$
				" Operation entered: Body in Element::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class BodyInElement_c_test56454_c implements ClassQueryInterface_c {
			BodyInElement_c_test56454_c(java.util.UUID p56455,
					java.util.UUID p56456) {
				m_p56455 = p56455;
				m_p56456 = p56456;
			}
			private java.util.UUID m_p56455;
			private java.util.UUID m_p56456;
			public boolean evaluate(Object candidate) {
				BodyInElement_c selected = (BodyInElement_c) candidate;
				boolean retval = false;
				retval = (selected.getAction_id().equals(m_p56455))
						& (selected.getElement_id().equals(m_p56456));
				return retval;
			}
		}

		BodyInElement_c[] objs56453 = BodyInElement_c.BodyInElementInstances(
				modelRoot, new BodyInElement_c_test56454_c(getAction_id(),
						getElement_id()));

		if (((objs56453.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Body in Element", //$NON-NLS-1$
								"Consistency: Object: Body in Element: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs56453.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin.logError(
						"Consistency: Object: Body in Element: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
								+ "Actual Value: " //$NON-NLS-1$
								+ Integer.toString(objs56453.length), e);
			}
			retval = false;

		}

		if (((objs56453.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Body in Element", //$NON-NLS-1$
								"Consistency: Object: Body in Element: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs56453.length)
										+ " Action_ID: " + "Not Printable" + " Element_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Body in Element: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56453.length)
										+ " Action_ID: " + "Not Printable" + " Element_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Body in Element is a link class in association: rel.Numb = 640
		// Other side
		// The other side class in the association is: Packageable Element
		class PackageableElement_c_test56460_c implements ClassQueryInterface_c {
			PackageableElement_c_test56460_c(java.util.UUID p56461) {
				m_p56461 = p56461;
			}
			private java.util.UUID m_p56461;
			public boolean evaluate(Object candidate) {
				PackageableElement_c selected = (PackageableElement_c) candidate;
				boolean retval = false;
				retval = (selected.getElement_id().equals(m_p56461));
				return retval;
			}
		}

		PackageableElement_c[] objs56459 = PackageableElement_c
				.PackageableElementInstances(modelRoot,
						new PackageableElement_c_test56460_c(getElement_id()));

		if (((objs56459.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Body in Element", //$NON-NLS-1$
								"Consistency: Object: Body in Element: Association: 640: Cardinality of other side of link is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs56459.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Body in Element: Association: 640: Cardinality of other side of link is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56459.length), e);
			}
			retval = false;

		}

		return retval;
	}

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Body in Element